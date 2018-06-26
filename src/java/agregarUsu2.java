/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.Emp;
import beans.metodo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/agregarUsu2"})
public class agregarUsu2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Pattern r = Pattern.compile("[{}<>+\"/]");
            boolean  usuOK=false;
            boolean  passOK=false;
            boolean  rolOK=false;
            
            
            metodo met = new metodo();
            String usu,pass,rol;
            int introl=0;
            usu=request.getParameter("usuarioAgre");
            pass=request.getParameter("passwordAgre");
            rol=request.getParameter("rolAgre");
            
            Matcher musu = r.matcher(usu);
            Matcher mpass = r.matcher(pass);
            
            switch(rol){
                case "Cheff":
                    introl=1;
                    break;
                case "Maestro":
                    introl=2;
                    break;
                case "Tutor":
                    introl=3;
                    break;
            }
            if (introl==1 || introl==2 || introl==3) {
                rolOK=true;
            }
            if (musu.find() || mpass.find()) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Caracteres especiales no permitidos');");
                out.println("location='agregarUsu.jsp';");
                out.println("</script>");
            
            }else{
                if (rolOK) {
                    
                    
                    if (usu.length()>35 || pass.length()>35) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('El máximo de caracteres admitidos son 35 en el usuario y la contraseña');");
                        out.println("location='agregarUsu.jsp';");
                        out.println("</script>");
                    }else{
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Servlet agregarUsu2</title>");            
                        out.println("</head>");
                        out.println("<body>");




                        Emp e = new Emp();

                        e.setUsuario(usu);
                        e.setPassword(pass);
                        e.setRol(introl);

                        int estatus=met.Guardar(e);

                        if (estatus>0) {
                            out.print("<script>alert('El usuario se guardo con exito');</script>");
                            response.sendRedirect("administradorCuentas.jsp");
                        }else{
                            out.print("<script>alert('El usuario no se pudo guardar');</script>");
                            response.sendRedirect("agregarUsu.jsp");
                        }


                        /* TODO output your page here. You may use following sample code. */

                        out.println("<h1>Servlet agregarUsu2 at " + request.getContextPath() + "</h1>");
                        out.println("</body>");
                        out.println("</html>");
                    }
                    
                }else{
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Rol no admitido');");
                    out.println("location='agregarUsu.jsp';");
                    out.println("</script>");
                }
            
            
            
            
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
