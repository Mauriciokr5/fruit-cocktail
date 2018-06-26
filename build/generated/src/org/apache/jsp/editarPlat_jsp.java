package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editarPlat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

try{


      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <form action=\"editarPlat\" >\n");
      out.write("                <input type=\"hidden\" name=\"numMen\"value=\"");
out.print("");
      out.write("\" required=\"required\">\n");
      out.write("                <input type=\"hidden\" name=\"numPlat\"value=\"");
out.print("");
      out.write("\" required=\"required\">\n");
      out.write("                <input type=\"text\" name=\"nomIngrediente\" required=\"required\" style=\"color:black; background-color: #d3d3d3; border: 1px; padding: 0px; border-radius: 5px; width: 350px;\" maxlength='39' pattern='^[a-zA-Z ]+([a-zA-Z ]+)*$'placeholder=\"Nombre del Ingrediente\">\n");
      out.write("                <input type=\"number\" name=\"porIngrediente\" required=\"required\" style=\"color:black; background-color: #d3d3d3; border: 1px; padding: 0px; border-radius: 5px; width: 180px;\" maxlength='7' pattern='[0-9]\\.'placeholder=\"Porcion\">\n");
      out.write("                <select style=\"color:black; background-color: #d3d3d3; border: 1px; padding: 0px; border-radius: 5px;width: 180px;\" required=\"required\" name=\"uni\">\n");
      out.write("                    <option selected=\"selected\">Unidad</option>\n");
      out.write("                    <option value=\"Kg\">Kg</option>\n");
      out.write("                    <option value=\"g\">g</option>\n");
      out.write("                    <option value=\"mg\">mg</option>\n");
      out.write("                    <option value=\"ml\">ml</option>\n");
      out.write("                    <option value=\"-\">Al gusto</option>\n");
      out.write("                </select>\n");
      out.write("                <button type=\"submit\" class=\"btn\" >\n");
      out.write("                <i class=\"icon icon-agregar\"></i>\n");
      out.write("                </button>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}catch(Exception ws){
response.sendRedirect("editMenu.jsp");
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
