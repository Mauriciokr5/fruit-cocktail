package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title> hi</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: white\">\n");
      out.write("        \n");
      out.write("        ");

            Calendar calendario=Calendar.getInstance();
            Calendar fecha = new GregorianCalendar();
            Calendar ultimoDia = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH + 1, 0);
            String fecha_bd=calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+calendario.get(Calendar.DAY_OF_MONTH);
            ArrayList cosa = new ArrayList();
            cosa.add(fecha_bd);
            
for (int i = 0; i < cosa.size(); i++) {
        out.print(String.valueOf(cosa.get(i)));
        out.print("hi"+i);
    }














        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("      ");
out.print(calendario.get(Calendar.MONTH));
      out.write("  \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <div class=\"page-header\">\n");
      out.write("      <h1>");
out.print(fecha_bd);
      out.write("</h1>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div id=\"carousel-example-generic\" class=\"carousel slide\">\n");
      out.write("  <!-- Indicators --> \n");
      out.write("  \n");
      out.write("  <ol class=\"carousel-indicators carousel-indicators-numbers\">\n");
      out.write("      ");
for (int i = 0; i < 31; i++) {
          if (i==0) {
              
      out.write("<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"><b>1</b></li>");

              }else{
                    
      out.write("<li data-target=\"#carousel-example-generic\" data-slide-to=\"");
out.print(i);
      out.write('"');
      out.write('>');
out.print(i+1);
      out.write("</li>");

                  }
          }
      
      out.write("\n");
      out.write("    <!--<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\">1</li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\">2</li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\">3</li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"3\">4</li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"4\">5</li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"5\">6</li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"6\">7</li>-->\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"http://placehold.it/1200x500\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"http://placehold.it/1200x500\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"http://placehold.it/1200x500\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"wrapper typo\">This is a custom\n");
      out.write("  <div class=\"list\"><span class=\"placeholder\">select</span>\n");
      out.write("    <ul class=\"list__ul\">\n");
      out.write("      <li><a href=\"\">select</a></li>\n");
      out.write("      <li><a href=\"\">lorem</a></li>\n");
      out.write("      <li><a href=\"\">ipsum</a></li>\n");
      out.write("      <li><a href=\"\">dolor</a></li>\n");
      out.write("      <li><a href=\"\">sit</a></li>\n");
      out.write("      <li><a href=\"\">amet</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!--\n");
      out.write("  .select\n");
      out.write("    select.typo\n");
      out.write("      - each item in ['lorem', 'ipsum', 'dolor', 'sit', 'amet']\n");
      out.write("        option.typo \n");
      out.write("  -->\n");
      out.write("</div>\n");
      out.write("            <style>\n");
      out.write("                \n");
      out.write("                .typo, .list a {\n");
      out.write("  font-size: 60px;\n");
      out.write("  font-weight: 700;\n");
      out.write("  font-family: 'Playfair Display', sans-serif;\n");
      out.write("  color: #585858;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".typo option, .list a option {\n");
      out.write("  font-size: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".transition {\n");
      out.write("  transition: all .4s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper {\n");
      out.write("  padding-top: 150px;\n");
      out.write("  height: 100vh;\n");
      out.write("  font-size: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".list {\n");
      out.write("  display: inline-block;\n");
      out.write("  position: relative;\n");
      out.write("  margin-left: 6px;\n");
      out.write("}\n");
      out.write(".list ul {\n");
      out.write("  text-align: left;\n");
      out.write("  position: absolute;\n");
      out.write("  padding: 0;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".list ul .active {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write(".list li {\n");
      out.write("  list-style: none;\n");
      out.write("}\n");
      out.write(".list li:first-child a {\n");
      out.write("  color: #7d40bf;\n");
      out.write("}\n");
      out.write(".list a {\n");
      out.write("  transition: all .4s;\n");
      out.write("  color: #7b00ff;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write(".list a:after {\n");
      out.write("  position: absolute;\n");
      out.write("  content: '';\n");
      out.write("  height: 5px;\n");
      out.write("  width: 0;\n");
      out.write("  left: 0;\n");
      out.write("  background: #b066ff;\n");
      out.write("  bottom: 0;\n");
      out.write("  transition: all .4s ease-out;\n");
      out.write("}\n");
      out.write(".list a:hover {\n");
      out.write("  cursor: pointer;\n");
      out.write("  color: #b066ff;\n");
      out.write("}\n");
      out.write(".list a:hover:after {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("select {\n");
      out.write("  display: inline;\n");
      out.write("  border: 0;\n");
      out.write("  width: auto;\n");
      out.write("  margin-left: 10px;\n");
      out.write("  outline: none;\n");
      out.write("  -webkit-appearance: none;\n");
      out.write("  -moz-appearance: none;\n");
      out.write("  border-bottom: 2px solid #555;\n");
      out.write("  color: #7b00ff;\n");
      out.write("  transition: all .4s ease-in-out;\n");
      out.write("}\n");
      out.write("select:hover {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("select option {\n");
      out.write("  border: 0;\n");
      out.write("  border-bottom: 1px solid #555;\n");
      out.write("  padding: 10px;\n");
      out.write("  -webkit-appearance: none;\n");
      out.write("  -moz-appearance: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".placeholder {\n");
      out.write("  border-bottom: 4px solid;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".placeholder:hover {\n");
      out.write("  color: #888888;\n");
      out.write("}\n");
      out.write("                \n");
      out.write("            </style>\n");
      out.write("            <script>\n");
      out.write("            \n");
      out.write("            console.clear();\n");
      out.write("\n");
      out.write("var el = {};\n");
      out.write("\n");
      out.write("$('.placeholder').on('click', function (ev) {\n");
      out.write("  $('.placeholder').css('opacity', '0');\n");
      out.write("  $('.list__ul').toggle();\n");
      out.write("});\n");
      out.write("\n");
      out.write(" $('.list__ul a').on('click', function (ev) {\n");
      out.write("   ev.preventDefault();\n");
      out.write("   var index = $(this).parent().index();\n");
      out.write("   \n");
      out.write("   $('.placeholder').text( $(this).text() ).css('opacity', '1');\n");
      out.write("   \n");
      out.write("   console.log($('.list__ul').find('li').eq(index).html());\n");
      out.write("   \n");
      out.write("   $('.list__ul').find('li').eq(index).prependTo('.list__ul');\n");
      out.write("   $('.list__ul').toggle();   \n");
      out.write("   \n");
      out.write(" });\n");
      out.write("\n");
      out.write("\n");
      out.write("$('select').on('change', function (e) {\n");
      out.write("  \n");
      out.write("  // Set text on placeholder hidden element\n");
      out.write("  $('.placeholder').text(this.value);\n");
      out.write("  \n");
      out.write("  // Animate select width as placeholder\n");
      out.write("  $(this).animate({width: $('.placeholder').width() + 'px' });\n");
      out.write("  \n");
      out.write("});\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"JS\\jssesion.js\" ></script> \n");
      out.write("        <script  src=\"JS\\jquery.js\" ></script> \n");
      out.write("        <script src=\"JS\\bootstrap.js\" ></script>\n");
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
