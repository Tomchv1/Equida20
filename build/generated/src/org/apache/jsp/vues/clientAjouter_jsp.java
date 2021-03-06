package org.apache.jsp.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modele.CategVente;
import java.util.ArrayList;
import modele.Pays;
import formulaires.ClientForm;

public final class clientAjouter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Client Ajouter</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>NOUVEAU CLIENT</h1>\n");
      out.write("        \n");
      out.write("         ");

                //Client client=(Client)request.getAttribute("client");
                ClientForm form = (ClientForm)request.getAttribute("form");
            
      out.write("\n");
      out.write("        \n");
      out.write("        <form class=\"form-inline\" action=\"ajouterClient\" method=\"POST\">\n");
      out.write("                <label for=\"nom\">NOM : </label>\n");
      out.write("                <input id=\"nom\" type=\"text\" name=\"nom\"  size=\"30\" maxlength=\"30\">\n");
      out.write("                </br>\n");
      out.write("                \n");
      out.write("                <label for=\"prenom\">PRENOM : </label>\n");
      out.write("                <input id=\"prenom\"  type=\"text\"  name=\"prenom\" size=\"30\" maxlength=\"30\">      \n");
      out.write("                 </br>\n");
      out.write("                \n");
      out.write("                <label for=\"rue\">rue : </label>\n");
      out.write("                <input id=\"rue\"  type=\"text\"  name=\"rue\" size=\"30\" maxlength=\"50\">\n");
      out.write("                 </br>\n");
      out.write("                               \n");
      out.write("                \n");
      out.write("                <label for=\"copos\">Code postal : </label>\n");
      out.write("                <input id=\"copos\"  type=\"text\"  name=\"copos\" size=\"5\" maxlength=\"5\">\n");
      out.write("                </br>\n");
      out.write("                \n");
      out.write("                <label for=\"ville\">Ville : </label>\n");
      out.write("                <input id=\"ville\"  type=\"text\"  name=\"ville\" size=\"40\" maxlength=\"40\">\n");
      out.write("                </br>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <label for=\"pays\">Pays : </label>\n");
      out.write("                <input list=\"listePays\" name=\"pays\" id=\"choix_pays\">\n");
      out.write("               \n");
      out.write("                <datalist id=\"codePays\">\n");
      out.write("                    ");

                        ArrayList<Pays> lesPays = (ArrayList)request.getAttribute("pLesPays");
                        for (int i=0; i<lesPays.size();i++){
                            Pays p = lesPays.get(i);
                            out.println("<option value='" + p.getCode()+"'>" + p.getNom()+"</option>" );
                        }
                    
      out.write("\n");
      out.write("                </datalist>\n");
      out.write("                </br>            \n");
      out.write("                \n");
      out.write("                <label for=\"categVente\">Categorie Vente : </label>\n");
      out.write("                <select name=\"categVente\" size=\"5\" multiple>\n");
      out.write("                ");

                        ArrayList<CategVente> lesCategVente = (ArrayList)request.getAttribute("pLesCategVente");
                        for (int i=0; i<lesCategVente.size();i++){
                            CategVente cv = lesCategVente.get(i);
                            out.println("<option value ='" + cv.getCode() + "'>" + cv.getLibelle() + "</option>"); 
                           
                        }
                    
      out.write("\n");
      out.write("                </select></br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("            <input type=\"submit\" name=\"valider\" id=\"valider\" value=\"Valider\"/>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
