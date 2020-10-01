/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaires;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import modele.Cheval;
import modele.TypeCheval;

/**
 *
 * @author Zakina
 */
public class ChevalForm {
    
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
    //private void validationNom( String nom ) throws Exception {
    //    if ( nom != null && nom.length() < 3 ) {
    //    throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
    //    }
    //}

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
    
    
    public Cheval ajouterCheval( HttpServletRequest request ) {
      
        Cheval unCheval  = new Cheval();
         
        String nom = getDataForm( request, "nom" );
        String sexe = getDataForm( request, "sexe");
        String prixDepart = getDataForm( request, "prixDepart" );
        Integer result = Integer.parseInt(prixDepart);
        String vendeur = getDataForm( request, "vendeur");
        String proprietaire = getDataForm( request, "proprietaire" );
        String sire = getDataForm( request, "sire" );
        //String unTypeCheval = getDataForm( request, "id_typeChev" );
        
         TypeCheval unTypeChev  = new TypeCheval();
         
         String id = getDataForm( request, "id_typechev");
        
        // Traitement de la liste à choix multiple
        //Pour chq catégorie selectionné, on instancie une nouvelle catégorie et on l'ajoute au client
        //TypeCheval unTypeChev ;
        //String[] typeCheval = request.getParameterValues("typeCheval");
        //for (int i=0; i<typeCheval.length; i++){
         //   unTypeChev = new TypeCheval();
        //    unTypeChev.setId(unTypeChev[i]);
        //    unCheval.addUnTypeChev(unTypeChev);
        //}
        
 
       
        //try {
        //     validationNom( nom );
       // } catch ( Exception e ) {
        //    setErreur( "nom", e.getMessage() );
        //}
        //unClient.setNom(nom);

        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'ajout.";
        } else {
            resultat = "Échec de l'ajout.";
        }
         
      
        unCheval.setNom(nom);
        unCheval.setSexe(sexe);
        unCheval.setPrixDepart(result);
        unCheval.setVendeur(vendeur);
        unCheval.setProprietaire(proprietaire);
        unCheval.setSire(sire);
        unCheval.setUnTypeChev(unTypeChev);
        
               
       
        return unCheval ;
    }
    
    
    

}
