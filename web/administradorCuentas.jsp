<%-- 
    Document   : administradorCuentas
    Created on : 28/05/2018, 05:51:44 PM
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
        if (nivel==0) {
                response.sendRedirect("index.jsp");
            }
    
    
            
        
        
        
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
            
            <div align="center" >
        <table  class="tablaUsuarios"  style="color: white;" >
            
            <tr>
                
                <th>Id</th>
                <th>Usuario</th>
                <th>Contraseña</th>
                <th style="width: 100px;">Rol</th>
                <th style="width: 50px;"></th>
                <th style="width: 50px;"></th>
                
            </tr>
            
            <%
                ArrayList<Emp> lista=met.getAllEmpleados();
                
                for (int i = 0; i < met.getAllEmpleados().size()+1; i++) {
                        %>
                        
                            <%
                                if (i==met.getAllEmpleados().size()) {
                                        %>
                                        <tr >
                                            <td colspan="6" class="fila_agregar" bgcolor="#d3d3d3" align="center">
                                                
                                                <form action="agregarUsu.jsp">

                                                    <button type="submit" class="btn2" style="width: 760px;">
                                                <i class="icon icon-agregar-usuario"></i>
                                                </button>
                                                </form>
                                            </td>
                                            
                                        </tr>
                                        <%
                                    }else{
                                
                                if (lista.get(i).getRol()==4) {
                                        
                                    }else{
                            %>
                        <tr>    
                            <td><%out.print(lista.get(i).getIdUsuarios());%></td>
                            <td><%out.print(lista.get(i).getUsuario());%></td>
                            <td><%out.print(lista.get(i).getPassword());%></td>
                            <td><%
                                switch(lista.get(i).getRol()){
                                    case 1:
                                        out.print("Cheff");
                                        break;
                                    case 2:
                                        out.print("Maestro");
                                        break;
                                    case 3:
                                        out.print("Tutor");
                                        break;
                                    default:
                                        out.print("s/rol");
                                        break;
                                }
                                
                            %>
                            </td>
                            <td>
                                <form method="post" action="editarUsuario.jsp" >
                                    <input name="id" type="hidden"  value="<%out.print(/*Integer.parseInt(String.valueOf(*/lista.get(i).getIdUsuarios()/*))*/);%>">
                                    <button type="submit" class="btn">
                                    <i class="icon icon-editar"></i>
                                    </button>
                                </form>
                                
                                            
                            </td>
                            <td>
                                <form method="post" action="eliminarUsu" onsubmit="return veriliminar()" id="eliminarUsuario">
                                    <input name="id" type="hidden" style="display: none" value="<%out.print(lista.get(i).getIdUsuarios());%>">
                                    <button type="submit" class="btn">
                                    <i class="icon icon-eliminar-usuario"></i>
                                    </button>
                                </form>
                                
                                            
                            </td>
                            
                        </tr>
                        
                        <%
                            }
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
	var formulario = document.getElementById("eliminarUsuario");	
	var dato = formulario[0];
        var statusConfirm = confirm("¿Realmente desea eliminar este usuario?"); 
            if (statusConfirm == true) 
            { 
                
                formulario.submit();
                return true;
            } 
            else 
            { 
                location.href="administradorCuentas.jsp";
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
