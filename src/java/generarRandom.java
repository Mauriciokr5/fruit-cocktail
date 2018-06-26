/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.metodo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class generarRandom extends HttpServlet {

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
            
            Calendar calendario=Calendar.getInstance();
            Calendar fecha = new GregorianCalendar();
            Calendar dia_semana = new GregorianCalendar();

            String fechabd="";
            metodo met = new metodo();

            for (int i = 0; i <= fecha.getActualMaximum(Calendar.MONTH); i++) {
                int sem=0;
                dia_semana.set(2018, i, 1);
                for (int y = 1; y <= dia_semana.getActualMaximum(Calendar.DAY_OF_MONTH); y++) {

                    dia_semana.set(calendario.get(Calendar.YEAR), i, y);
                    fechabd = dia_semana.get(Calendar.YEAR)+"-"+(dia_semana.get(Calendar.MONTH)+1)+"-"+dia_semana.get(Calendar.DAY_OF_MONTH);
                    int entresemana =dia_semana.get(Calendar.DAY_OF_WEEK);

                    if (entresemana>1 && entresemana<7) {

                        boolean ranOK =true; 
                        int random = (int)(Math.random()*(met.getAllMenus().size()+1));

                        while(random==0){
                            random = (int)(Math.random()*(met.getAllMenus().size()+1));
                        }
                        if (random!=0) {
                                //aqui va el set de la fecha y el menu
                                
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Puede tardar un poco');");
                                met.random(fechabd,random);
                                out.println("location='calendario.jsp';");
                                out.println("</script>");
                            }


                    }
                }

            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet generarRandom</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet generarRandom at " + request.getContextPath() + "</h1>");
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
