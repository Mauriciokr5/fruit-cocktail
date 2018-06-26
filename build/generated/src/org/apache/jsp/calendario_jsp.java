package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.beansIngredientes;
import java.util.ArrayList;
import beans.metodo;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class calendario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 
    
    //session = request.getSession();
    int nivel=0;
    try{
    session = request.getSession();
    String y;
    y=""+session.getAttribute("levelac");
        
    nivel=Integer.parseInt(y);
    
    
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/preloader.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/calendariocss.css\">\n");
      out.write("        <link href=\"SRC/iwachu.ico\" rel=\"icon\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/edityguardar.css\" />\n");
      out.write("        \n");
      out.write("        <title>Calendario</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        <style>\n");
      out.write("            header{\n");
      out.write("                height: 50px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("       ");

            
           metodo met = new metodo();
           String a="";
           a=met.MostrarDatos();
           ArrayList platillo = new ArrayList();
           
           
            
            
            //String a = conexion.prinusuario();
            
            
            
            
            Calendar calendario=Calendar.getInstance();
            Calendar fecha = new GregorianCalendar();
            Calendar ultimoDia = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH + 1, 0);
           
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.onload=function(){\n");
      out.write("                var soc= document.getElementById('socket');\n");
      out.write("                soc.style.visibility = 'hidden';\n");
      out.write("                soc.style.opacity='0';\n");
      out.write("                document.getElementById('paginacompleta').style.display = 'block';\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id =\"socket\" class=\"socket\">\n");
      out.write("            <div class=\"gel center-gel\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c1 r1\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c2 r1\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c3 r1\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c4 r1\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c5 r1\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c6 r1\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"gel c7 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"gel c8 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c9 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c10 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c11 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c12 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c13 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c14 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c15 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c16 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c17 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c18 r2\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c19 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c20 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c21 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c22 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c23 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c24 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c25 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c26 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c28 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c29 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c30 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c31 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c32 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c33 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c34 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c35 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c36 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gel c37 r3\">\n");
      out.write("                <div class=\"hex-brick h1\"></div>\n");
      out.write("                <div class=\"hex-brick h2\"></div>\n");
      out.write("                <div class=\"hex-brick h3\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"paginacompleta\" style=\"display:none;\">\n");
      out.write("            \n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    \n");
      out.write("                    ");

                        switch(nivel){
                            case 1:
                                
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <font color=\"white\" size=\"5\">Cuenta de Cheff</font>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"calendario.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"segundo\">\n");
      out.write("                                            <i class=\"icon icon-calendario\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Calendario<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"comidaHoy.jsp\" >\n");
      out.write("                                        <span class=\"tercero\">\n");
      out.write("                                            <i class=\"\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Comida de Hoy<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                ");

                            break;
                                
                            case 2 :
                               
      out.write("<li>\n");
      out.write("                                    <font color=\"white\" size=\"5\">Cuenta de Maestro</font>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"calendario.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"segundo\">\n");
      out.write("                                            <i class=\"icon icon-calendario\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Calendario<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"asistencia.jsp\" onclick=\"Asistencia_js()\">\n");
      out.write("                                        <span class=\"segundo\">\n");
      out.write("                                            <i class=\"icon icon-Servicios\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Registro de Asistencia<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                ");

                            break;
                            
                            
                            case 3:
                               
      out.write("<li>\n");
      out.write("                                    <font color=\"white\" size=\"5\">Cuenta de Tutor</font>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"calendario.jsp\" onclick=\"\">\n");
      out.write("                                        <span class=\"segundo\">\n");
      out.write("                                            <i class=\"icon icon-calendario\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        Calendario<!--Aqui va texto de la opcion del menu-->\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                ");

                            break;
                            case 4:
                            
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                        <a href=\"#\" onclick=\"menus()\">\n");
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
      out.write("                        <a href=\"#\" onclick=\"asitencia()\">\n");
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
      out.write("                                \n");
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
      out.write("        </header>    \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <div >\n");
      out.write("            <br>\n");
      out.write("            <h1 class=\"titulo\">Calendario\n");
      out.write("                ");

                    
                    
                    
                    
                    /*for (int i = 0; i < ultimoDia.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
                                
                                String fecha_bd=calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+i;
                                platillo=met.Platillos(fecha_bd);
                                out.print(platillo.get(i));
                            }*/
                    //out.print(calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+5);
                
      out.write("\n");
      out.write("            \n");
      out.write("            </h1>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"slide-calendario\" >\n");
      out.write("                <div id=\"carousel-1\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"0\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <table class=\"tabla_mes\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h1 class=\"mes_css\">\n");
      out.write("                                        ");

                                            switch(calendario.get(Calendar.MONTH)){
                                        case 0:
                                            out.print("Enero");
                                        break;
                                        case 1:
                                            out.print("Febrero");
                                        break;
                                        case 2:
                                            out.print("Marzo");
                                        break;
                                        case 3:
                                            out.print("Abril");
                                        break;
                                        case 4:
                                            out.print("Mayo");
                                        break;
                                        case 5:
                                            out.print("Junio");
                                        break;
                                        case 6:
                                            out.print("Julio");
                                        break;
                                        case 7:
                                            out.print("Agosto");
                                        break;
                                        case 8:
                                            out.print("Septiembre");
                                        break;
                                        case 9:
                                            out.print("Octubre");
                                        break;
                                        case 10:
                                            out.print("Noviembre");
                                        break;
                                        case 11:
                                            out.print("Diciembre");
                                        break;
                                        
                                    }
                                        
      out.write("\n");
      out.write("                                    </h1>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <form action=\"generarRandom\" class=\"genere\">\n");
      out.write("                                        <input type=\"submit\" value=\" Generar Random \" class=\"guardar\" >\n");
      out.write("                                    </form>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                        <style>\n");
      out.write("                            tabla_mes guardar{\n");
      out.write("                                color: white;\n");
      out.write("                                font-weight: bold;\n");
      out.write("                                border-radius: 1px;\n");
      out.write("                                font-size: 30px;\n");
      out.write("                                border: 1px;\n");
      out.write("                            }\n");
      out.write("                            tabla_mes genere{\n");
      out.write("                                background: transparent; \n");
      out.write("                                padding: 1px; \n");
      out.write("                                border: 0px;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        </style>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        \n");
      out.write("                        ");

                            int mes =calendario.get(Calendar.MONTH);
                            int ano=calendario.get(Calendar.YEAR);
                            for (int i = 1; i < calendario.getActualMaximum(Calendar.DAY_OF_MONTH)+1; i++) {
                            
                            out.print("");
                            if (i==calendario.get(Calendar.DAY_OF_MONTH)) {//cambiar 0 por variable del dia actual
                                    
      out.write("\n");
      out.write("                                    <li data-target=\"#carousel-1\" data-slide-to=\"");
out.print(i-1);
      out.write("\" class=\"active\"><b>");
out.print(i);
      out.write("</b></li>\n");
      out.write("                                    ");
//la clase active de arriba representa que sera la que se mostrara alcargar la pagina
                                }else{
                                      
      out.write("\n");
      out.write("                                        <li data-target=\"#carousel-1\" data-slide-to=\"");
out.print(i-1);
      out.write("\"><b>");
out.print(i);
      out.write("</b></li>\n");
      out.write("                                      ");

                                    }
                            }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ol>\n");
      out.write("                    </div>\n");
      out.write("                           \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    <!-- Contenedor de los slide-->\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        \n");
      out.write("                        ");

                            
                            
                            for (int i = 1; i < calendario.getActualMaximum(Calendar.DAY_OF_MONTH)+1; i++) {
                                Calendar dia_sem = new GregorianCalendar(ano, mes,i);
                                String fecha_bd=calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+(i);
                                
                                
                                
                                
                                
                                    int dia_semana=dia_sem.get(Calendar.DAY_OF_WEEK)-1;
                                    String diasdelasemana="";
                                    
                                    switch(dia_semana){
                                        case 0:
                                            diasdelasemana="Domingo";
                                        break;
                                        case 1:
                                            diasdelasemana="Lunes";
                                        break;
                                        case 2:
                                            diasdelasemana="Martes";
                                        break;
                                        case 3:
                                            diasdelasemana="Miércoles";
                                        break;
                                        case 4:
                                            diasdelasemana="Jueves";
                                        break;
                                        case 5:
                                            diasdelasemana="Viernes";
                                        break;
                                        case 6:
                                            diasdelasemana="Sábado";
                                        break;
                                        case 7:
                                            diasdelasemana="Domingo";
                                        break;
                                    }
                                    
                                    
//cambiar 0 por variable del dia actual
                                        if (dia_semana==0||dia_semana==6) {
                                                
                                            
                                           
      out.write("\n");
      out.write("                                           <div class=\"");

                                                    if (i==calendario.get(Calendar.DAY_OF_MONTH)) {
                                                            out.print("item active");
                                                        }else{
                                                        out.print("item");
                                                    }
                                               

                                                
      out.write("\">\n");
      out.write("\n");
      out.write("                                                             <!-- aqui va lo que esta drento del slide -->\n");
      out.write("                                                             <div >\n");
      out.write("                                                                     <h1 class=\"num_dia_calendario\" align=\"center\">");
out.print(i); 
      out.write("</h1>\n");
      out.write("                                                                     <h1 class=\"dia_semana\">");
out.print(diasdelasemana); 
      out.write("</h1><br>\n");
      out.write("                                                                     <br>\n");
      out.write("                                                                     <br>\n");
      out.write("                                                                     <br>\n");
      out.write("                                                                     <h1 class=\"finsemana\" align=\"center\">Fin de Semana</h1>\n");
      out.write("                                                                 </div>\n");
      out.write("                                                         </div> \n");
      out.write("                                            ");

                                                }else{
                                                    
      out.write("\n");
      out.write("                                                    <div class=\"");

                                                    if (i==calendario.get(Calendar.DAY_OF_MONTH)) {
                                                            out.print("item active");
                                                        }else{
                                                        out.print("item");
                                                    }
                                               

                                                
      out.write("\">\n");
      out.write("                                                \n");
      out.write("                                                <!-- aqui va lo que esta drento del slide -->\n");
      out.write("                                                <div >\n");
      out.write("                                                        <h1 class=\"num_dia_calendario\" align=\"center\">");
out.print(i); 
      out.write("</h1>\n");
      out.write("                                                        <h1 class=\"dia_semana\">");
out.print(diasdelasemana); 
      out.write("</h1><br>\n");
      out.write("                                                        \n");
      out.write("                                                        ");

                                                             if (nivel==4) {
                                                                 
      out.write("\n");
      out.write("                                                                 <h1>");
out.print("Menu "+met.idMenu(fecha_bd));
      out.write("</h1>\n");
      out.write("                                                                ");

                                                                     
                                                                 }
                                                        
                                                        
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("                                                        <table class=\"tabla_dia\">\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <th class=\"th_tabla_dia\" >Platillo</th>\n");
      out.write("                                                                \n");
      out.write("                                                            </tr> \n");
      out.write("                                                            ");

                                                                
                                                                
                                                                for (int x = 0; x < met.Platillos(fecha_bd).size() ; x++) {
                                                                    String nombredelplatillo=String.valueOf(met.Platillos(fecha_bd).get(x));
                                                                    
                                                                    
                                                                        
      out.write("\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                <td class=\"tabla_dia_platillo\">\n");
      out.write("                                                                    <h1 class=\"nombre_platillo\">");
out.print(nombredelplatillo); 
      out.write("</h1>\n");
      out.write("                                                                    ");

                                                                        if (nivel==1||nivel==4) {
                                                                                
                                                                            
                                                                    
      out.write("\n");
      out.write("                                                                    <table class=\"tabla_ingredientes\">\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <th>Ingrediente</th>\n");
      out.write("                                                                            <th>Porción</th>\n");
      out.write("                                                                        </tr> \n");
      out.write("                                                                        ");

                                                                            ArrayList<beansIngredientes>  cosa = met.Ingredientes(nombredelplatillo);
                                                                            for (int ip = 0; ip < cosa.size() ; ip++) {
                                                                                    String ie= cosa.get(ip).getIngrediente();
                                                                                    
                                                                                    double porc=cosa.get(ip).getPorcion();
                                                                                    
                                                                                    String uni =cosa.get(ip).getUnidad();
                                                                                    
                                                                                    
      out.write("\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                        <td>");
out.print(ie);
      out.write("</td>\n");
      out.write("                                                                                        <td>");

                                                                                            if (porc==0) {
                                                                                                    out.print("Al gusto");
                                                                                                }else{
                                                                                                    out.print(porc+" "+uni);
                                                                                                    
                                                                                                }
                                                                                            
                                                                                            
      out.write("</td>\n");
      out.write("                                                                                        </tr>\n");
      out.write("                                                                                    ");

                                                                                    
                                                                                }
                                                                        
      out.write("\n");
      out.write("                                                                        \n");
      out.write("                                                                         \n");
      out.write("\n");
      out.write("                                                                    </table>\n");
      out.write("                                                                </td>\n");
      out.write("                                                                ");

                                                                }
                                                                
      out.write("\n");
      out.write("                                                                \n");
      out.write("                                                            </tr>\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");

                                                                    }
                                                            
      out.write("\n");
      out.write("                                                             \n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </div>     \n");
      out.write("                                                         ");

                                                }
                                }
                        
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"JS\\jssesion.js\" ></script> \n");
      out.write("        <script  src=\"JS\\jquery.js\" ></script> \n");
      out.write("        <script src=\"JS\\bootstrap.js\" ></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    }catch(Exception ws){
        response.sendRedirect("index.jsp");
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
