<%-- 
    Document   : editarPlat
    Created on : 5/06/2018, 11:57:59 AM
    Author     : HP
--%>

<%@page import="beans.metodo"%>
<%@page import="beans.beansIngredientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
try{

    String regmenu = request.getParameter("numMenu");
    String regplat = request.getParameter("numPlat");

    
    String id = request.getParameter("id");
    beansIngredientes e = new beansIngredientes();
    metodo met = new metodo();
    e=met.getIngrediente(Integer.parseInt(id));
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="SRC/iwachu.ico" rel="icon">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        <link rel="stylesheet" href="adcss.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="CSS/cssadm.css">
        <title>Editar Ingrediente</title>
    </head>
    <body style="background-color: black">
        
        <header style="height: 100px;">
            <nav>
                <ul>
                    <li>
                        <a href="admMenus.jsp" onclick="menus()">
                            <span class="segundo">
                                <i class="icon icon-calendario"></i>
                            </span>
                            Control de Menus<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    <li>
                        <a href="administradorCuentas.jsp" >
                            <span class="segundo">
                                <i class="icon icon-usuarios"></i>
                            </span>
                            Administrar cuentas<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    <li>
                                    <a href="calendario.jsp" onclick="">
                                        <span class="segundo">
                                            <i class="icon icon-calendario"></i>
                                        </span>
                                        Calendario<!--Aqui va texto de la opcion del menu-->

                                    </a>

                                </li>
                     <li>
                        <a href="asistencia.jsp" onclick="asitencia()">
                            <span class="segundo">
                                <i class="icon icon-checkmark"></i>
                            </span>
                            Asistencia<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    <li>
                        <a href="cerrarsesion" onclick="">
                            <span class="segundo">
                                <i class="icon icon-salir"></i>
                            </span>
                            Cerrar Sesión<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    
                </ul>
            </nav>
        </header>
        
        
        
        
        
        
        
        
        
        <div class="container">
            <h1 align="center">Editando Ingrediente:</h1>
            <h1 align="center"><%out.print(e.getIngrediente());%></h1><br><br>
            <h1 align="left"><input type="button" onclick="window.location.href='ediPlat.jsp?id=<%out.print(regplat);%>&numMenu=<%out.print(regmenu);%>'" value="Regresar" style="background-color: black;border: 0px; padding-bottom: 10px; margin-top: -10px;" ></h1>
            
            <div align="center">
            <form action="editarIngre" >
                <input type="hidden" name="idIngred"value="<%out.print(id);%>" required="required">
                <input type="hidden" name="numPlat"value="<%out.print(regplat);%>" required="required">
                <input type="hidden" name="numMenu"value="<%out.print(regmenu);%>" required="required">
                <input type="text" name="nomIngrediente" required="required" style="color:black; background-color: #d3d3d3; border: 1px; padding: 0px; border-radius: 5px; width: 350px;" maxlength='39' pattern='^[a-zA-Z ]+([a-zA-Z ]+)*$' value="<%out.print(e.getIngrediente());%>"><br><br>
                <input type="number" name="porIngrediente" required="required" style="color:black; background-color: #d3d3d3; border: 1px; padding: 0px; border-radius: 5px; width: 180px;" maxlength='7' pattern='[0-9]\.' value="<%out.print(e.getPorcion());%>"><br><br>
                <select style="color:black; background-color: #d3d3d3; border: 1px; padding: 0px; border-radius: 5px;width: 180px;" required="required" name="uni">
                    <%
                        String yu =e.getUnidad();
                        
                        if (yu.equalsIgnoreCase("Kg")) {
                                %>
                                
                            <option value="Kg" selected="selected">Kg</option>
                                <option value="g">g</option>
                                <option value="mg">mg</option>
                                <option value="ml">ml</option>
                                <option value="-">Al gusto</option>
                            <%
                            }
                        if (yu.equalsIgnoreCase("g")) {
                                %>
                                
                                <option value="Kg">Kg</option>
                                <option value="g" selected="selected">g</option>
                                <option value="mg">mg</option>
                                <option value="ml">ml</option>
                                <option value="-">Al gusto</option>
                            <%
                            }
                        if (yu.equalsIgnoreCase("mg")) {
                                %>
                                
                                <option value="Kg">Kg</option>
                                <option value="g">g</option>
                                <option value="mg" selected="selected">mg</option>
                                <option value="ml">ml</option>
                                <option value="-">Al gusto</option>
                            <%
                            }
                        if (yu.equalsIgnoreCase("ml")) {
                               %>
                                
                                <option value="Kg">Kg</option>
                                <option value="g">g</option>
                                <option value="mg">mg</option>
                                <option value="ml" selected="selected">ml</option>
                                <option value="-">Al gusto</option>
                            <% 
                            }
                        if (yu.equalsIgnoreCase("-")) {
                                %>
                                
                                <option value="Kg">Kg</option>
                                <option value="g">g</option>
                                <option value="mg">mg</option>
                                <option value="ml">ml</option>
                                <option value="-" selected="selected">Al gusto</option>
                            <%
                            }
                        if (yu.equalsIgnoreCase("Unidad")) {
                                %>
                                
                                <option value="Kg">Kg</option>
                                <option value="g">g</option>
                                <option value="mg">mg</option>
                                <option value="ml">ml</option>
                                <option value="-" selected="selected">Al gusto</option>
                            <%
                            }
                        
                        
                  
                    
                    %>
                    
                </select><br><br>
                <button type="submit" class="btn" >
                <i class="icon icon-guardar"></i>
                </button>
            </form>
            </div>
        </div>        
    </body>
</html>
<%
}catch(Exception ws){
response.sendRedirect("editMenu.jsp");
}
%>