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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class editarUsu2 extends HttpServlet {

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
            metodo met = new metodo();
            Emp e=new Emp();
            
            
            Pattern r = Pattern.compile("[{}<>+\"/]");
            boolean  usuOK=false;
            boolean  passOK=false;
            boolean  rolOK=false;
            
            
            
            String usuE,passE,rolE;
            int introl=0;
            usuE=request.getParameter("usuarioEdit");
            passE=request.getParameter("passwordEdit");
            rolE=request.getParameter("rolEdit");
            
            Matcher musu = r.matcher(usuE);
            Matcher mpass = r.matcher(passE);
            
            switch(rolE){
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
            int id = Integer.parseInt(request.getParameter("idEdit"));
            HttpSession session = request.getSession();
            session.setAttribute("IDDELUSURIO2", id);
            if (introl==1 || introl==2 || introl==3) {
                rolOK=true;
            }
            if (musu.find() || mpass.find()) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Caracteres especiales no permitidos');");
                out.println("location='editarUsuario.jsp';");
                out.println("</script>");
            
            }else{
                if (rolOK) {
                    
                    
                    if (usuE.length()>35 || passE.length()>35) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('El máximo de caracteres admitidos son 35 en el usuario y la contraseña');");
                        out.println("location='editarUsuario.jsp';");
                        out.println("</script>");
                    }else{
                        
                        try{
                            id = Integer.parseInt(request.getParameter("idEdit"));

                            e.setIdUsuarios(id);
                            e.setUsuario(request.getParameter("usuarioEdit"));
                            e.setPassword(request.getParameter("passwordEdit"));

                            switch(request.getParameter("rolEdit")){
                                case "Cheff":
                                    e.setRol(1);
                                    break;

                                case "Maestro":
                                    e.setRol(2);
                                    break;

                                case "Tutor":
                                    e.setRol(3);
                                    break;

                            }
                        }catch(Exception sw){
                            response.sendRedirect("editarUsuario.jsp");
                        }



                        int estatus=met.Actualizar(e);
                        if (estatus>0) {
                            out.println("<script>alert('Cambios Guardados con exito\nUsuario:"+e.getUsuario()+"\nPassword:"+e.getPassword()+""
                                    + "\nRol:"+request.getParameter("rolEdit")+"');</script>");
                            response.sendRedirect("administradorCuentas.jsp");

                        }else{

                            out.println("<script>alert('Error al guardar los cambios');</script>");
                            response.sendRedirect("editarUsuario.jsp");




                        }




                        /* TODO output your page here. You may use following sample code. */
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Servlet editarUsu2</title>");            
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>Servlet editarUsu2 at " + request.getContextPath() + "</h1>");
                        out.println("</body>");
                        out.println("</html>");
                        
                        
                        
                    }
                    
                }else{
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Rol no admitido');");
                    out.println("location='editarUsuario.jsp';");
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
