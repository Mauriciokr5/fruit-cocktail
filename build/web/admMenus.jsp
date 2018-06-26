<%-- 
    Document   : admMenus
    Created on : 31/05/2018, 06:41:46 PM
    Author     : Alumno
--%>

<%@page import="beans.Emp"%>
<%@page import="beans.metodo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int nivel=0;
    try{
        session = request.getSession();
        String y;
        y=""+session.getAttribute("levelac");
        
        nivel=Integer.parseInt(y);
    
           
 
        
    metodo met = new metodo();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador de Cuentas</title>
        <link href="SRC/iwachu.ico" rel="icon">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        <link rel="stylesheet" href="adcss.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="CSS/cssadm.css">
        
        
    </head>
    <body style="background-color: black">
        
        <header>
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
                        <a href="asistencia.jsp" ">
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
            
            <div align="center" >
        <table  class="tablaUsuarios"  style="color: white;" >
            <link rel="stylesheet" href="CSS/edityguardar.css">
            <form action="generarRandom" class="genere" onsubmit="return verCal()" id="calendarizar">
                <input type="submit" value="Calendarizar" class="guardar" style="background-color: black; padding-bottom: 15px;">
            </form>
            <script>
            
            function verCal(){
	var formulario = document.getElementById("calendarizar");	
	var dato = formulario[0];
        var statusConfirm = confirm("Tardará unos segundos"); 
            if (statusConfirm == true) 
            { 
                
                formulario.submit();
                return true;
            } 
            else 
            { 
                location.href="admMenus.jsp";
                return false;
            } 
	
}
        </script>
            
            <tr>
                
                <th></th>
                <th></th>
                <th style="width: 50px;"></th>
                <th style="width: 50px;"></th>
                
            </tr>
            
            <%
                ArrayList<Emp> lista=met.getAllMenus();
                for (int i = 0; i < met.getAllMenus().size()+1; i++) {
                        %>
                        
                            <%
                                if (i==met.getAllMenus().size()) {
                                        %>
                                        <tr >
                                            <td colspan="4" class="fila_agregar" bgcolor="#d3d3d3" align="center">
                                                
                                                <form action="agregarMenu" >
                                                    <input type="hidden" name="numMenu"value="<%out.print(met.getAllMenus().size());%>">
                                                    <button type="submit" class="btn2" style="width: 760px;">
                                                <i class="icon icon-agregar" ></i>
                                                </button>
                                                </form>
                                            </td>
                                            
                                        </tr>
                                        <%
                                    }else{
                                
                                
                            %>
                        <tr>    
                            <td>Menu <%out.print(lista.get(i));%></td>
                            <td>
                            <table class="tabla_dia">
                                                            <tr>
                                                                <th class="th_tabla_dia " style="font-size:25px; font-family: Raleway; padding:15px;" >Platillos</th>
                                                                
                                                            </tr> 
                                                            <%
                                                                int g = Integer.parseInt(String.valueOf(lista.get(i)));
                                                                
                                                                for (int x = 0; x < met.PlatillosPorMenu(g).size() ; x++) {
                                                                    String nombredelplatillo=String.valueOf(met.PlatillosPorMenu(g).get(x));
                                                                    
                                                                    
                                                                        %>
                                                                <tr>
                                                                <td class="tabla_dia_platillo">
                                                                    <%out.print(nombredelplatillo); %>
                                                                </td>
                                                                <%
                                                                
                                                                %>
                                                                
                                                            </tr>
                                                                        
                                                                        <%
                                                                    }
                                                            %>
                                                             
                                                        </table>
                            </td>
                            
                            <td>
                                <form method="post" action="editMenu.jsp" >
                                    <input name="id" type="hidden"  value="<%out.print(/*Integer.parseInt(String.valueOf(*/lista.get(i)/*))*/);%>">
                                    <button type="submit" class="btn">
                                    <i class="icon icon-editar"></i>
                                    </button>
                                </form>
                                
                                            
                            </td>
                            <td>
                                <form method="post" action="eliminarMenu" onsubmit="return veriliminar()" id="eliminarMenu" >
                                    <input name="idMenuEli" type="hidden" style="display: block" value="<%out.print(lista.get(i));%>">
                                    <button type="submit" class="btn" >
                                        <i class="icon icon-borrar" ></i>
                                    </button>
                                </form>
                                
                                            
                            </td>
                            
                        </tr>
                        
                        <%
                            
                        }      
                    }
            %>
                
        </table>
            </div>
            
        </div>
        <script  src="JS\jquery.js" ></script> 
        <script src="JS\bootstrap.js" ></script>
        <script>
            
            function veriliminar(){
	var formulario = document.getElementById("eliminarMenu");	
	var dato = formulario[0];
        var statusConfirm = confirm("¿Realmente desea eliminar este Menu?"); 
            if (statusConfirm == true) 
            { 
                
                formulario.submit();
                return true;
            } 
            else 
            { 
                location.href="admMenus.jsp";
                return false;
            } 
	
}
        </script>
    </body>
</html>
<%
}catch(Exception ws){
        response.sendRedirect("index.jsp");
    }
%>
