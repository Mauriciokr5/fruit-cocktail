/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.beansIngredientes;
import beans.metodo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class agregarIngrediente extends HttpServlet {

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
            String numPlat,nomIngrediente,porIngrediente,uni;
            beansIngredientes bI = new beansIngredientes();
            metodo met = new metodo();
            numPlat = request.getParameter("numPlat");
            nomIngrediente = request.getParameter("nomIngrediente");
            porIngrediente = request.getParameter("porIngrediente");
            String menu = request.getParameter("numMenu");
            uni = request.getParameter("uni");
            float porc = 0;
            int id = Integer.parseInt(numPlat);
            
            
            if (uni.equalsIgnoreCase("-")) {
                porc = 0;
            }else{
                porc = Float.parseFloat(porIngrediente);
            }
            
            bI.setIngrediente(nomIngrediente);
            bI.setPorcion(porc);
            bI.setUnidad(uni);
            
            
            
            
            if (met.valPlat(id)==id) {
                        int estatus = met.GuardarIngrediente(bI,id);
                
                    if (estatus!=0) {
                        HttpSession session = request.getSession();
                        session.setAttribute("idPalti", numPlat);
                        //out.print(numPlat);
                        out.println("<script type=\"text/javascript\">");
                        
                        out.println("location='ediPlat.jsp?id="+numPlat+"&numMenu="+menu+"';");
                        out.println("</script>");
                        
                    }else{
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Hubo un error');");
                        out.println("location='ediPlat.jsp?id="+numPlat+"&numMenu="+menu+"';");
                        out.println("</script>");
                    }
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('El platillo no existe');");
                out.println("location='editMenu.jsp?id="+menu+"';");
                out.println("</script>");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet agregarIngrediente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet agregarIngrediente at " + menu+ "</h1>");
            out.println("</body>");
            out.println("</html>");
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
