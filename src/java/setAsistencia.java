/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.metodo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class setAsistencia extends HttpServlet {

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
            
            Pattern r = Pattern.compile("[{}<>+\"/]");//patron
            Pattern rfecha = Pattern.compile("-");
            boolean fechaOK =false;
            boolean asisOK =false;
            


        int asistencia;
        String as,fecha;
            as=request.getParameter("as");
            fecha=request.getParameter("fecha");
            Matcher mas = r.matcher(as);
            Matcher mfecha = r.matcher(fecha);
            Matcher mfecha2 = rfecha.matcher(fecha);
            asistencia=Integer.parseInt(as);
            if (mfecha2.find()&&fecha.length()<11) {
                fechaOK=true;
            }
            
            if (asistencia<1000) {
                asisOK=true;
            }
            
            if (asisOK==true&&fechaOK==true) {
                
            
            
            
    
            if (mas.find()||mfecha.find()) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Caracteres especiales no permitidos');");
                out.println("location='asistencia.jsp';");
                out.println("</script>");
                
            
            }else{
                metodo met = new metodo();
                int estatus=met.Asistencia(fecha,asistencia);
                
                
            
            
            
            
            
            
            
            
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet setAsistencia</title>");            
                out.println("</head>");
                out.println("<body>");
                out.print("<h1></h1>");
                if (estatus==3) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Se ha actualizado la asistencia');");
                    out.println("location='asistencia.jsp';");
                    out.println("</script>");
                }else{
                    if (estatus==2) {
                        out.println("<script type=\"text/javascript\">");
                    out.println("alert('Se ha agregado la asistencia');");
                    out.println("location='asistencia.jsp';");
                    out.println("</script>");
                    }else{
                        out.println("<script type=\"text/javascript\">");
                    out.println("alert('No se ha registrado la asistencia');");
                    out.println("location='asistencia.jsp';");
                    out.println("</script>");
                    }
                    
                }
                out.println("</body>");
                out.println("</html>");
            }
        }else{
                if (asisOK==false) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('No se puede registrar una asistencia mayor a 999');");
                    out.println("location='asistencia.jsp';");
                    out.println("</script>");
                }
                if (fechaOK==false) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Formato de fecha no aceptable');");
                    out.println("location='asistencia.jsp';");
                    out.println("</script>");
                }
                out.println("<script type=\"text/javascript\">");
                    out.println("alert('Error');");
                    out.println("location='asistencia.jsp';");
                    out.println("</script>");
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
