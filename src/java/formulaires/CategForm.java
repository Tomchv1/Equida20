/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaires;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import modele.CategVente;


/**
 *
 * @author Zakina
 */
public class CategForm {
    
    private String resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs(Map<String, String> erreurs) {
        this.erreurs = erreurs;
    }
    
    //méthode de validation du champ de saisie nom
    private void validationLibelle( String libelle ) throws Exception {
        if ( libelle != null && libelle.length() < 3 ) {
        throw new Exception( "Le libellé doit contenir au moins 3 caractères." );
        }
    }

    private void setErreur( String champ, String message ) {
    erreurs.put(champ, message );
    }    
    
    private static String getDataForm( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }   
    }
    
    
    public CategVente ajouterCategorie( HttpServletRequest request ) {
      
        CategVente uneCateg  = new CategVente();
         
        String code = getDataForm( request, "code" );
        String libelle = getDataForm( request, "libelle");

        try {
             validationLibelle( libelle );
        } catch ( Exception e ) {
            setErreur( "nom", e.getMessage() );
        }
        uneCateg.setCode(code);

        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'ajout.";
        } else {
            resultat = "Échec de l'ajout.";
        }
         
      
        uneCateg.setCode(code);
        uneCateg.setLibelle(libelle);
               
       
        return uneCateg ;
    }
    
    
    

}
