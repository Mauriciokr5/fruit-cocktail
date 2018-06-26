<%-- 
    Document   : index
    Created on : 3/06/2018, 12:45:10 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int nivel=0;
    session = request.getSession();
        String y;
        //y=""+session.getAttribute("levelac");
    
        
        
       // nivel=Integer.parseInt(y);
        if (session.getAttribute("levelac")!=null) {
            
                response.sendRedirect("sesion.jsp");
            }else{
            
        
        
        
    
        if (session.getAttribute("levelac")==null) {
                
            
    
        
        
        
                
            
%>
<html>
    <head>
        <title>Fruit Coacktail</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        <link rel="stylesheet" href="estilos.css">
	<link rel="stylesheet" href="fonts.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link href="SRC/iwachu.ico" rel="icon">
    </head>
    <body style="background-color:black;">
        <script type="text/javascript" src="JS\principal.js" ></script>
        
        
        
        
        <header>
            <nav>
                <ul>
                    <li >
                        
                        <a href="#I" onclick='Inicio()' >
                            <span class="primero">
                                <i class="icon icon-Inicio"></i>
                            </span>
                            Inicio<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    <li>
                        <a href="#QS" onclick="quienes_somos()">
                            <span class="segundo">
                                <i class="icon icon-Acerca-de"></i>
                            </span>
                            Quienes Somos<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    <li>
                        <a href="#IS" onclick="iniciosesion()">
                            <span class="tercero">
                                <i class="icon icon-entrar"></i>
                            </span>
                            Inicio de Sesión<!--Aqui va texto de la opcion del menu-->
                            
                        </a>
                        
                    </li>
                    
                </ul>
            </nav>
        </header>
        
       
        
        
        
        <div id="I" style="display: block;" align="center">
            <br><br><br>
            
            <br><br>
            <img src="SRC/bloodwarelogo.png" alt="bloodware_logo" >
            <h3 >BloodWare</h3>
        </div>
        
        
        
        
        <div id="QS" align='center' style="display: none;" >
            <h1>Quienes Somos</h1>
            <p>
                <font color="lightgray" size="5" >
                    Bloodware es el resultado de una idea que se dio en un salón de clases, por cuestiones de un proyecto que debíamos realizar, los que iniciamos con esta idea fuimos Miguel, Mauricio, Sergio y Karla, compañeros de trabajo, además de grandes amigos.
                </font>
            </p>
            <p >
                <font color="lightgray" size="5" >
                    Bloodware nace por una problemática común en el mundo, como lo es la buena alimentación, tratamos de hacerlo de una forma novedosa y útil. Así que creamos Fruit Cocktail 2.0 es una “” que gestiona los platillos que se preparan en las escuelas secundarias de tiempo completo, mediante la calendarización de los mismos.
                </font>
            </p>
                
                    
                       
                        
                    <br>
                        <img src="SRC/bloodwarelogo.png" alt="bloodware_logo" >
                    
            
        </div>
        
        
        
        
        <div id="IS" align='center' style="display: none;">
            
            <form method="post" action="pruebasd" >
                <table >
                    <tr>
                        <td align="center"><h4 >Inicio de Sesión</h4><br><br></td>
                    </tr>
                    <tr>
                        <td>Usuario:<input type="text" name="Usuario1" id="usuario"></td>
                        
                    </tr>
                    
                    <tr>
                        <td>
                            Contraseña:<br>
                            <input type="password" name="Password1" id="contraseña" size="5"></td>
                        
                    </tr>
                </table>
                <br><br>
                <input type="submit" value="Ingresar" name="iniciar"  >
                
            </form>
        </div>
        <br><br><br><br><br>
        
    </body>
</html>
<%

}else{
response.sendRedirect("sesion.jsp");
}
}
%>