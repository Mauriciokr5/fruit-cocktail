<%-- 
    Document   : consumido
    Created on : 10/06/2018, 10:42:52 PM
    Author     : HP
--%>

<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int nivel=0;
    try{
        session = request.getSession();
        String y;
        y=""+session.getAttribute("levelac");
        
        nivel=Integer.parseInt(y);
    
    if (nivel==4 || nivel==1) {
            
        

        Calendar calendario=Calendar.getInstance();
        Calendar fecha = new GregorianCalendar();
        Calendar ultimoDia = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH + 1, 0);
        int mes =calendario.get(Calendar.MONTH);
        int ano=calendario.get(Calendar.YEAR);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);
        int dia_semana=calendario.get(Calendar.DAY_OF_MONTH);
        String fecha_bd=ano+"-"+(mes+1)+"-"+(dia);
%>
<html>
    <script type="text/javascript" src="JS\principal.js" ></script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        <link rel="stylesheet" href="adcss.css">
	<link rel="stylesheet" href="fonts.css">
        <link rel="stylesheet" href="style.css">
        
        <link rel="stylesheet" href="CSS/calendariocss.css">
        <link href="SRC/iwachu.ico" rel="icon">
        <title>Asistencia</title>
    </head>
    <body style="background-color: black; color: white;">
        
        <header>
            <nav>
                <ul>
                    
                    <%
                        switch(nivel){
                            case 4:
                                %>
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
                    
                                <%
                            break;
                                
                            case 1:
                                %>
                                <li>
                                    <font color="white" size="5">Cuenta de Cheff</font>
                                </li>
                                <li>
                                    <a href="calendario.jsp" onclick="">
                                        <span class="segundo">
                                            <i class="icon icon-Servicios"></i>
                                        </span>
                                        Calendario<!--Aqui va texto de la opcion del menu-->

                                    </a>

                                </li>
                                <li>
                                    <a href="comidaHoy.jsp" onclick="">
                                        <span class="tercero">
                                            <i class=""></i>
                                        </span>
                                        Comida de Hoy<!--Aqui va texto de la opcion del menu-->

                                    </a>

                                </li>
                                <li>
                                    <a href="consumido.jsp" onclick="">
                                        <span class="tercero">
                                            <i class=""></i>
                                        </span>
                                        Consumo<!--Aqui va texto de la opcion del menu-->

                                    </a>

                                </li>
                                <%
                            break;
                            
                            
                            
                        }
                    %>
                    
                    <li>
                        <a href="cerrarsesion" >
                            <span class="tercero">
                                <i class="icon icon-salir"></i>
                            </span>
                            Cerrar Sesión<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    
                </ul>
            </nav>
        </header>   
        
        
        
        
        
        
        <div id="asis" style="display: block;" align="center">
            <br><br><br>
            
            <h3 >Consumo</h3>
            Ingrese el consumo del dia de hoy <%out.print(fecha_bd);%> :<br><br>
            
            
            <form method="post" action="setConsumo">
                <input type="hidden" name="fecha" value="<%out.print(fecha_bd);%>">
                <input style="color:black;" name="com" id="asistencia" type="text" onkeypress="return validarn(event)" maxlength="3" >
                <br>
                <input class="asbotonclass" id="asboton" type="submit" value="Enviar">
            </form>

        </div>
    </body>
</html>
<%
}else{
response.sendRedirect("index.jsp");
}
}catch(Exception ws){
        response.sendRedirect("index.jsp");
    }
%>
