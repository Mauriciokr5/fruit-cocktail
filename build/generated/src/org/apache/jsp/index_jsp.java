package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    int nivel=0;
    session = request.getSession();
        String y;
        //y=""+session.getAttribute("levelac");
    
        
        
        //nivel=Integer.parseInt(y);
        if (session.getAttribute("levelac")!=null) {
            
                response.sendRedirect("sesion.jsp");
            }else{
            
        
        
        
    
        if (session.getAttribute("levelac")==null) {
                
            
    
        
        
        
                
            

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Fruit Coacktail</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"fonts.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"SRC/iwachu.ico\" rel=\"icon\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:black;\">\n");
      out.write("        <script type=\"text/javascript\" src=\"JS\\principal.js\" ></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li >\n");
      out.write("                        \n");
      out.write("                        <a href=\"#I\" onclick='Inicio()' >\n");
      out.write("                            <span class=\"primero\">\n");
      out.write("                                <i class=\"icon icon-Inicio\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Inicio<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#QS\" onclick=\"quienes_somos()\">\n");
      out.write("                            <span class=\"segundo\">\n");
      out.write("                                <i class=\"icon icon-Acerca-de\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Quienes Somos<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#IS\" onclick=\"iniciosesion()\">\n");
      out.write("                            <span class=\"tercero\">\n");
      out.write("                                <i class=\"icon icon-entrar\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Inicio de Sesión<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"I\" style=\"display: block;\" align=\"center\">\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("            <img src=\"SRC/bloodwarelogo.png\" alt=\"bloodware_logo\" >\n");
      out.write("            <h3 >BloodWare</h3>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"QS\" align='center' style=\"display: none;\" >\n");
      out.write("            <h1>Quienes Somos</h1>\n");
      out.write("            <p>\n");
      out.write("                <font color=\"lightgray\" size=\"5\" >\n");
      out.write("                    Bloodware es el resultado de una idea que se dio en un salón de clases, por cuestiones de un proyecto que debíamos realizar, los que iniciamos con esta idea fuimos Miguel, Mauricio, Sergio y Karla, compañeros de trabajo, además de grandes amigos.\n");
      out.write("                </font>\n");
      out.write("            </p>\n");
      out.write("            <p >\n");
      out.write("                <font color=\"lightgray\" size=\"5\" >\n");
      out.write("                    Bloodware nace por una problemática común en el mundo, como lo es la buena alimentación, tratamos de hacerlo de una forma novedosa y útil. Así que creamos Fruit Cocktail 2.0 es una “” que gestiona los platillos que se preparan en las escuelas secundarias de tiempo completo, mediante la calendarización de los mismos.\n");
      out.write("                </font>\n");
      out.write("            </p>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    <br>\n");
      out.write("                        <img src=\"SRC/bloodwarelogo.png\" alt=\"bloodware_logo\" >\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"IS\" align='center' style=\"display: none;\">\n");
      out.write("            \n");
      out.write("            <form method=\"post\" action=\"pruebasd\" >\n");
      out.write("                <table >\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"center\"><h4 >Inicio de Sesión</h4><br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Usuario:<input type=\"text\" name=\"Usuario1\" id=\"usuario\"></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Contraseña:<br>\n");
      out.write("                            <input type=\"password\" name=\"Password1\" id=\"contraseña\" size=\"5\"></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" value=\"Ingresar\" name=\"iniciar\"  >\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");


}
}

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
