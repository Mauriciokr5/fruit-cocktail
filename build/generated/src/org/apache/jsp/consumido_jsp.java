package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;
import java.util.Calendar;

public final class consumido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    int nivel=0;
    try{
        session = request.getSession();
        String y;
        y=""+session.getAttribute("levelac");
        
        nivel=Integer.parseInt(y);
    
    if (nivel==4 || nivel==2) {
            
        

        Calendar calendario=Calendar.getInstance();
        Calendar fecha = new GregorianCalendar();
        Calendar ultimoDia = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH + 1, 0);
        int mes =calendario.get(Calendar.MONTH);
        int ano=calendario.get(Calendar.YEAR);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);
        int dia_semana=calendario.get(Calendar.DAY_OF_MONTH);
        String fecha_bd=ano+"-"+(mes+1)+"-"+(dia);

      out.write("\n");
      out.write("<html>\n");
      out.write("    <script type=\"text/javascript\" src=\"JS\\principal.js\" ></script>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"adcss.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"fonts.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/calendariocss.css\">\n");
      out.write("        <link href=\"SRC/iwachu.ico\" rel=\"icon\">\n");
      out.write("        <title>Asistencia</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black; color: white;\">\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    \n");
      out.write("                    ");

                        switch(nivel){
                            case 4:
                                
      out.write("\n");
      out.write("                                <li>\n");
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
      out.write("                        <a href=\"calendario.jsp\" onclick=\"\">\n");
      out.write("                            <span class=\"segundo\">\n");
      out.write("                                <i class=\"icon icon-calendario\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            Calendario<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
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
      out.write("                    \n");
      out.write("                                ");

                            break;
                                
                            case 1:
                                
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <font color=\"white\" size=\"5\">Cuenta de Cheff</font>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"calendario.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"segundo\">\n");
      out.write("                                            <i class=\"icon icon-Servicios\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Calendario<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"comidaHoy.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"tercero\">\n");
      out.write("                                            <i class=\"\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Comida de Hoy<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"consumido.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"tercero\">\n");
      out.write("                                            <i class=\"\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Consumo<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                ");

                            break;
                            
                            
                            
                        }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"cerrarsesion\" >\n");
      out.write("                            <span class=\"tercero\">\n");
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
      out.write("        </header>   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"asis\" style=\"display: block;\" align=\"center\">\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("            <h3 >Consumo</h3>\n");
      out.write("            Ingrese el consumo del dia de hoy ");
out.print(fecha_bd);
      out.write(" :<br><br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form method=\"post\" action=\"setConsumo\">\n");
      out.write("                <input type=\"hidden\" name=\"fecha\" value=\"");
out.print(fecha_bd);
      out.write("\">\n");
      out.write("                <input style=\"color:black;\" name=\"as\" id=\"asistencia\" type=\"text\" onkeypress=\"return validarn(event)\" maxlength=\"3\" >\n");
      out.write("                <br>\n");
      out.write("                <input class=\"asbotonclass\" id=\"asboton\" type=\"submit\" value=\"Enviar\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}else{
response.sendRedirect("index.jsp");
}
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
