<%-- 
    Document   : editMenu
    Created on : 1/06/2018, 12:24:13 PM
    Author     : HP
--%>

<%@page import="beans.platillo"%>
<%@page import="beans.Emp"%>
<%@page import="beans.metodo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    try{
        session = request.getSession();
        String y;
        y=""+session.getAttribute("levelac");
        
        int nivel=Integer.parseInt(y);
    
        int idDelMenu=0;
        
            idDelMenu = Integer.parseInt(String.valueOf(request.getParameter("id")));
             
        
            metodo met = new metodo();
            int h = met.valMenu(idDelMenu);
            
            if (h==idDelMenu) {
                    
                

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
            
            <div align="center" >
        <table  class="tablaUsuarios"  style="color: white;" >
            <h1 align="left"><input type="button" onclick="window.location.href='admMenus.jsp'" value="Regresar" style="background-color: black;border: 0px; padding-bottom: 10px; margin-top: -10px;" ></h1>
            <h1><font size="6">Editando Menu <%out.print(idDelMenu);%></font></h1><br><br>
            <tr>
                
                
                <th></th>
                <th style="width: 50px;"></th>
                <th style="width: 50px;"></th>
                
            </tr>
            
            <%
                ArrayList<platillo> lista=met.PlatillosConId(idDelMenu);
                for (int i = 0; i < lista.size()+1; i++) {
                        %>
                        
                            <%
                                if (i==lista.size()) {
                                        %>
                                        <tr >
                                            
                                            <td colspan="3" class="" bgcolor="black" align="left">
                                                
                                                <form action="agregarPlatillo" >
                                                    <input type="hidden" name="numMenu"value="<%out.print(idDelMenu);%>" required="required">
                                                    <input type="text" name="NombrePLat" required="required" style="color:black; background-color: #d3d3d3; border: 1px; padding: 0px; width: 800px; border-radius: 5px;" maxlength='39' pattern='^[a-zA-Z ]+([a-zA-Z ]+)*$' placeholder="Nombre del Platillo">
                                                    <button type="submit" class="btn" >
                                                    <i class="icon icon-agregar"></i>
                                                    </button>
                                                    </form>
                                            </td>
                                            
                                            
                                        </tr>
                                        <%
                                    }else{
                                
                                
                            %>
                        <tr>    
                            <td><%out.print(lista.get(i).getNomPlatillo());%></td>
                            
                            
                            <td>
                                <form method="post" action="ediPlat.jsp" >
                                    <input name="numMenu" type="hidden"  value="<%out.print(idDelMenu);%>">
                                    <input name="id" type="hidden"  value="<%out.print(/*Integer.parseInt(String.valueOf(*/lista.get(i).getIdPlatillo()/*))*/);%>">
                                    <button type="submit" class="btn">
                                    <i class="icon icon-editar"></i>
                                    </button>
                                </form>
                                
                                            
                            </td>
                            <td>
                                <form method="post" action="eliminarPlat" onsubmit="return veriliminar()" id="eliminarMenu">
                                    <input name="numMenu" type="hidden"  value="<%out.print(idDelMenu);%>">
                                    <input name="idPlatEli" type="hidden" style="display: block" value="<%out.print(lista.get(i).getIdPlatillo());%>">
                                    <button type="submit" class="btn">
                                    <i class="icon icon-borrar"></i>
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
        var statusConfirm = confirm("¿Realmente desea eliminar este platillo?"); 
            if (statusConfirm == true) 
            { 
                
                formulario.submit();
                return true;
            } 
            else 
            { 
                location.href="editMenu.jsp?id=<%out.print(idDelMenu);%>";
                return false;
            } 
	
}
        </script>
    </body>
</html>
<%
    
    }else{
response.sendRedirect("admMenus.jsp");
}
}catch(Exception ws){
        response.sendRedirect("index.jsp");
    }
%>
