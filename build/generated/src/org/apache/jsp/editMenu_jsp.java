package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Emp;
import beans.metodo;
import java.util.ArrayList;

public final class editMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    try{
        session = request.getSession();
        String y;
        y=""+session.getAttribute("levelac");
        
        int nivel=Integer.parseInt(y);
    
        int idDelMenu=0;
        if (request.getParameter("id")==null) {
            String hi = String.valueOf(session.getAttribute("IDDELMENU"));
            idDelMenu= Integer.parseInt(hi);
        }else{
            idDelMenu = Integer.parseInt(String.valueOf(request.getParameter("id")));
            }   
            metodo met = new metodo();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Administrador de Cuentas</title>\n");
      out.write("        <link href=\"SRC/iwachu.ico\" rel=\"icon\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"adcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/cssadm.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"admMenus.jsp\" onclick=\"menus()\">\n");
      out.write("                            <span class=\"segundo\">\n");
      out.write("                                <i class=\"icon icon-calendario\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Control de Menus<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"administradorCuentas.jsp\" >\n");
      out.write("                            <span class=\"segundo\">\n");
      out.write("                                <i class=\"icon icon-usuarios\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Administrar cuentas<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                                    <a href=\"calendario.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"segundo\">\n");
      out.write("                                            <i class=\"icon icon-calendario\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Calendario<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a href=\"asistencia.jsp\" onclick=\"asitencia()\">\n");
      out.write("                            <span class=\"segundo\">\n");
      out.write("                                <i class=\"icon icon-checkmark\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Asistencia<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"cerrarsesion\" onclick=\"\">\n");
      out.write("                            <span class=\"segundo\">\n");
      out.write("                                <i class=\"icon icon-salir\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Cerrar Sesión<!--Aqui va texto de la opcion del menu-->\n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div align=\"center\" >\n");
      out.write("        <table  class=\"tablaUsuarios\"  style=\"color: white;\" >\n");
      out.write("            <h1>Editando Menu ");
out.print(idDelMenu);
      out.write("</h1><br><br>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th style=\"width: 50px;\"></th>\n");
      out.write("                <th style=\"width: 50px;\"></th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                ArrayList<Emp> lista=met.PlatillosPorMenu(idDelMenu);
                for (int i = 0; i < lista.size()+1; i++) {
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                            ");

                                if (i==lista.size()) {
                                        
      out.write("\n");
      out.write("                                        <tr >\n");
      out.write("                                            <td colspan=\"4\" class=\"fila_agregar\" bgcolor=\"#d3d3d3\" align=\"center\">\n");
      out.write("                                                \n");
      out.write("                                                <form action=\"agregarPlatillo\">\n");
      out.write("                                                    <input type=\"hidden\" name=\"numMenu\"value=\"");
out.print(met.getAllMenus().size());
      out.write("\">\n");
      out.write("                                                    <button type=\"submit\" class=\"btn2\" style=\"width: 760px;\">\n");
      out.write("                                                <i class=\"icon icon-agregar\"></i>Agregar\n");
      out.write("                                                </button>\n");
      out.write("                                                </form>\n");
      out.write("                                            </td>\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                    }else{
                                
                                
                            
      out.write("\n");
      out.write("                        <tr>    \n");
      out.write("                            <td>");
out.print(lista.get(i));
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"post\" action=\"editarMenu.jsp\" >\n");
      out.write("                                    <input name=\"id\" type=\"hidden\"  value=\"");
out.print(/*Integer.parseInt(String.valueOf(*/lista.get(i)/*))*/);
      out.write("\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn\">\n");
      out.write("                                    <i class=\"icon icon-editar\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\n");
      out.write("                                \n");
      out.write("                                            \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"post\" action=\"eliminarMenu\" onsubmit=\"return veriliminar()\" id=\"eliminarMenu\">\n");
      out.write("                                    <input name=\"idMenuEli\" type=\"hidden\" style=\"display: block\" value=\"");
out.print(lista.get(i));
      out.write("\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn\">\n");
      out.write("                                    <i class=\"icon icon-borrar\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\n");
      out.write("                                \n");
      out.write("                                            \n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");

                            
                        }      
                    }
            
      out.write("\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <script  src=\"JS\\jquery.js\" ></script> \n");
      out.write("        <script src=\"JS\\bootstrap.js\" ></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function veriliminar(){\n");
      out.write("\tvar formulario = document.getElementById(\"eliminarMenu\");\t\n");
      out.write("\tvar dato = formulario[0];\n");
      out.write("        var statusConfirm = confirm(\"¿Realmente desea eliminar este platillo?\"); \n");
      out.write("            if (statusConfirm == true) \n");
      out.write("            { \n");
      out.write("                \n");
      out.write("                formulario.submit();\n");
      out.write("                return true;\n");
      out.write("            } \n");
      out.write("            else \n");
      out.write("            { \n");
      out.write("                location.href=\"editMenu.jsp\";\n");
      out.write("                return false;\n");
      out.write("            } \n");
      out.write("\t\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}catch(Exception ws){
        response.sendRedirect("index.jsp");
    }

      out.write('\n');
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
