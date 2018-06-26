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
public class pruebasd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
        try(PrintWriter out = response.getWriter()){
        Pattern r = Pattern.compile("[{}<>+\"/]");//patron


        
        String nom,pass;
            nom=request.getParameter("Usuario1");
            pass=request.getParameter("Password1");
            Matcher mnom = r.matcher(nom);
            Matcher mpass = r.matcher(pass);
            
            
            if (mnom.find()||mpass.find()) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Usuario o contraseña incorrecta');");
                out.println("location='index.jsp';");
                out.println("</script>");
                
            
        }else{
            
            
            
            
           Emp e = new Emp();
            
            metodo met = new metodo();
            
            e = met.verificarUsuario(nom, pass);
            
            
            
            if (e!=null) {
                
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("usuario", e);
                //Sesion por parte del formulario
                HttpSession sesionOK = request.getSession(true);
                sesionOK.setAttribute("usuario", nom);
                int rolicus= e.getRol();
                sesion.setAttribute("levelac", null);
                sesion.setAttribute("levelac", e.getRol());
                if (rolicus!=0) {
                    if(e.getRol()==4){
                    response.sendRedirect("administrador.html");
                    }
                    else{
                        response.sendRedirect("sesion.jsp");
                    }
                }else{
                    sesion.setAttribute("levelac", null);
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Usuario o contraseña incorrecta');");
                    out.println("location='index.jsp';");
                    out.println("</script>");
                    
                    //out.println("<body onload=\"alert('Usuario o Contraseña incorrectos'); window.location='/ProyectoAula/' \"></body>");
                    //out.print("<script>alert('Usuario o Contraseña incorrectos');");
                    //response.sendRedirect("#IS");
                    
                    //response.sendRedirect("#IS");
                }
                
            }else{
                //out.println("<script>alert('Error');</script>");
                response.sendRedirect("index.jsp");
            }
        
        
        
        
        
        
    }
        }
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
