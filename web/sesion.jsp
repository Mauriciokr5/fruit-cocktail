<%-- 
    Document   : sesion
    Created on : 10/05/2018, 01:30:12 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<% 
        int nivel=0;
        try{
        session = request.getSession();
        String y;
        y=""+session.getAttribute("levelac");
        
        nivel=Integer.parseInt(y);
        if (nivel==4) {
                response.sendRedirect("administrador.html");
            }
        if (nivel==0) {
               response.sendRedirect("index.jsp");
               
           }
        }catch(Exception ws){
        response.sendRedirect("index.jsp");
        }
       
    
    
%>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="adcss.css">
	<link rel="stylesheet" href="fonts.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link href="SRC/iwachu.ico" rel="icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>
            <%
                   
                    switch(nivel){
                    case 1:
                        
                        out.print("Cheff");
                    break;

                    case 2:
                        out.print("Maestro");
                        
                    break;


                    case 3:
                        out.print("Tutor");
                        
                    break;
                    
                }
                
                
            %>
        </title>
    </head>
    <body style="background-color:black;">
        
        <header>
            <nav>
                <ul>
                    
                    <%
                        switch(nivel){
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
                                
                            case 2 :
                               %><li>
                                    <font color="white" size="5">Cuenta de Maestro</font>
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
                                    <a href="asistencia.jsp" >
                                        <span class="segundo">
                                            <i class="icon icon-Servicios"></i>
                                        </span>
                                        Registro de Asistencia<!--Aqui va texto de la opcion del menu-->

                                    </a>

                                </li>
                                <%
                            break;
                            
                            
                            case 3:
                               %><li>
                                    <font color="white" size="5">Cuenta de Tutor</font>
                                </li>
                                <li>
                                    <a href="calendario.jsp" onclick="">
                                        <span class="segundo">
                                            <i class="icon icon-Servicios"></i>
                                        </span>
                                        Calendario<!--Aqui va texto de la opcion del menu-->

                                    </a>

                                </li>
                                <%
                            break;
                        }
                    %>
                    
                    <li>
                        <a href="cerrarsesion" >
                            <span class="tercero">
                                <i class="icon icon-Servicios"></i>
                            </span>
                            Cerrar Sesión<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    
                </ul>
            </nav>
        </header>
                    <div name="titu" id="titu" style="display: block" align="center">
                    <h1 align="center">
                        <font size="7" ><b>
                        <%
                            switch(nivel){
                                case 1:
                                    %>Cheff<%
                                    
                                break;

                                case 2:
                                    %>Maestro<%

                                break;

                                case 3:
                                    %>Tutor<%

                                break;
                                
                            }
                        %>
                        </b></font>
                    </h1>
                    </div>
    </body>
</html>
