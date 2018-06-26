<%-- 
    Document   : comidaHoy
    Created on : 3/06/2018, 12:39:30 PM
    Author     : HP
--%>

<%@page import="beans.beansIngredientes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.metodo"%>
<%@page import="java.sql.*"%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    
    //session = request.getSession();
    int nivel=0;
    try{
    session = request.getSession();
    String y;
    y=""+session.getAttribute("levelac");
        if (request.getSession()==null) {
                nivel=0;
            }else{
            nivel=Integer.parseInt(y);
        }
    
    if (nivel==1||nivel==4) {
            
        
    
    
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        <link rel="stylesheet" href="CSS/preloader.css">
        <link rel="stylesheet" href="estilos.css">
        <link rel="stylesheet" href="CSS/calendariocss.css">
        <link href="SRC/iwachu.ico" rel="icon">
        
        <title>Calendario</title>
    </head>
    <body style="background-color: black">
        <style>
            header{
                height: 50px;
            }
        </style>
       <%
            
           metodo met = new metodo();
           String a="";
           a=met.MostrarDatos();
           ArrayList platillo = new ArrayList();
           
           
            
            
            //String a = conexion.prinusuario();
            
            
            
            
            Calendar calendario=Calendar.getInstance();
            Calendar fecha = new GregorianCalendar();
            Calendar ultimoDia = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH + 1, 0);
           
        %>
        <script>
            window.onload=function(){
                var soc= document.getElementById('socket');
                soc.style.visibility = 'hidden';
                soc.style.opacity='0';
                document.getElementById('paginacompleta').style.display = 'block';
            };
        </script>
        
        
        <div id ="socket" class="socket">
            <div class="gel center-gel">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c1 r1">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c2 r1">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c3 r1">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c4 r1">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c5 r1">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c6 r1">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            
            <div class="gel c7 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            
            <div class="gel c8 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c9 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c10 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c11 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c12 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c13 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c14 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c15 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c16 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c17 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c18 r2">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c19 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c20 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c21 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c22 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c23 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c24 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c25 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c26 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c28 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c29 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c30 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c31 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c32 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c33 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c34 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c35 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c36 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            <div class="gel c37 r3">
                <div class="hex-brick h1"></div>
                <div class="hex-brick h2"></div>
                <div class="hex-brick h3"></div>
            </div>
            
        </div>
        
        
        
        
        <div id="paginacompleta" style="display:none;">
            
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
                                            <i class="icon icon-calendario"></i>
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
            
            
            
            
            
            
            
            
            
            
            
            
        
        <div >
            <br>
            <h1 class="titulo">Comida de Hoy
                
            
            </h1>
            <br>
            
            
        </div>
        
        
        <div class="container">
            
            <div class="slide-calendario" >
                <div id="carousel-1" class="carousel slide" data-ride="carousel" data-interval="0">
                    <div class="col-md-6">
                        <table class="tabla_mes">
                            <tr>
                                <td>
                                    <h1 class="mes_css">
                                        <%
                                            switch(calendario.get(Calendar.MONTH)){
                                        case 0:
                                            out.print("Enero");
                                        break;
                                        case 1:
                                            out.print("Febrero");
                                        break;
                                        case 2:
                                            out.print("Marzo");
                                        break;
                                        case 3:
                                            out.print("Abril");
                                        break;
                                        case 4:
                                            out.print("Mayo");
                                        break;
                                        case 5:
                                            out.print("Junio");
                                        break;
                                        case 6:
                                            out.print("Julio");
                                        break;
                                        case 7:
                                            out.print("Agosto");
                                        break;
                                        case 8:
                                            out.print("Septiembre");
                                        break;
                                        case 9:
                                            out.print("Octubre");
                                        break;
                                        case 10:
                                            out.print("Noviembre");
                                        break;
                                        case 11:
                                            out.print("Diciembre");
                                        break;
                                        
                                    }
                                        %>
                                    </h1>
                                </td>
                                
                            </tr>
                        </table>
                                    
                                    
                                        
                        
                    </div>
                    <div class="col-md-6">
                        <%
                            int mes =calendario.get(Calendar.MONTH);
                            int ano=calendario.get(Calendar.YEAR);
                            int dia = calendario.get(Calendar.DAY_OF_MONTH);
                            Calendar dia_sem = new GregorianCalendar(ano, mes,dia);
                            String fecha_bd=calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+(dia);
                            int alumnos=met.gatAsistencia(fecha_bd);    


                        %>
                        <table class="tabla_mes" align="left" >
                                        <tr>
                                            <td style="width:50px;" >
                                                <h1 align="right">Alumnos: </h1>
                                                
                                            </td>
                                            <td >
                                                <%
                                                    if (alumnos==0) {
                                                        %>
                                                            <h1 align="center"><font >Sin asistencia</font></h1>
                                                        <%
                                                        }else{
                                                        %>
                                                            <h1 align="center"><font size="60px">  <%out.print(alumnos);%></font></h1>
                                                        <%
                                                    }
                                                %>
                                                
                                            </td>
                                        </tr>
                                    </table>
                        
                        
                        
                    </div>
                    <!-- Contenedor de los slide-->
                    <div class="carousel-inner" role="listbox">
                        
                        <%
                            
                            
                            
                                
                                
                                
                                
                                
                                
                                    int dia_semana=dia_sem.get(Calendar.DAY_OF_WEEK)-1;
                                    String diasdelasemana="";
                                    
                                    switch(dia_semana){
                                        case 0:
                                            diasdelasemana="Domingo";
                                        break;
                                        case 1:
                                            diasdelasemana="Lunes";
                                        break;
                                        case 2:
                                            diasdelasemana="Martes";
                                        break;
                                        case 3:
                                            diasdelasemana="Miércoles";
                                        break;
                                        case 4:
                                            diasdelasemana="Jueves";
                                        break;
                                        case 5:
                                            diasdelasemana="Viernes";
                                        break;
                                        case 6:
                                            diasdelasemana="Sábado";
                                        break;
                                        case 7:
                                            diasdelasemana="Domingo";
                                        break;
                                    }
                                    
                                    
//cambiar 0 por variable del dia actual
                                        if (dia_semana==0||dia_semana==6) {
                                                
                                            
                                           %>
                                           <div class="item active">

                                                             <!-- aqui va lo que esta drento del slide -->
                                                             <div >
                                                                     <h1 class="num_dia_calendario" align="center"><%out.print(dia); %></h1>
                                                                     <h1 class="dia_semana"><%out.print(diasdelasemana); %></h1><br>
                                                                     <br>
                                                                     <br>
                                                                     <br>
                                                                     <h1 class="finsemana" align="center">Fin de Semana</h1>
                                                                 </div>
                                                         </div> 
                                            <%
                                                }else{
                                                    %>
                                                    <div class="item active">
                                                
                                                <!-- aqui va lo que esta drento del slide -->
                                                <div >
                                                        <h1 class="num_dia_calendario" align="center"><%out.print(dia); %></h1>
                                                        <h1 class="dia_semana"><%out.print(diasdelasemana); %></h1><br>
                                                        
                                                        <table class="tabla_dia">
                                                            <tr>
                                                                <th class="th_tabla_dia" >Platillo</th>
                                                                 
                                                            <script type="text/javascript">>
                                                                     $('#displayNone').click(function(e) {

                                                                    // Resetear, por si acaso has estado jugando con la otra propiedad
                                                                    

                                                                    if( $('hide-me').is(":visible") ) {
                                                                      document.getElementById('hide-me').style.display = 'none'; 
                                                                    } else {
                                                                      document.getElementById('hide-me').style.display = 'block';
                                                                    }   
                                                            </script>
                                                            <style>
                                                                    #hide-me {
                                                                    width: 100px;
                                                                    height: 100px;
                                                                    background: #bf7130;
                                                                    display: block;
                                                                    padding: 10px;
                                                                    margin: 0 15px 0 0;
                                                                    font-size: 14px;
                                                                    font-weight: bold;
                                                                    float: left;
                                                                    text-align: center;
                                                                    background: rgba(0, 0, 0, .15);
}
                                                                
                                                            </style>
                                                                
                                                            </tr> 
                                                            <%
                                                                
                                                                
                                                                for (int x = 0; x < met.Platillos(fecha_bd).size() ; x++) {
                                                                    String nombredelplatillo=String.valueOf(met.Platillos(fecha_bd).get(x));
                                                                    
                                                                    
                                                                        %>
                                                                <tr>
                                                                <td class="tabla_dia_platillo">
                                                                    <h1 class="nombre_platillo"><%out.print(nombredelplatillo); %></h1>
                                                                    <%
                                                                        if (nivel==1||nivel==4) {
                                                                                
                                                                            
                                                                    %>
                                                                    <table class="tabla_ingredientes">
                                                                        <tr>
                                                                            <th rowspan="2">Ingrediente</th>
                                                                            <th colspan="2">Porción</th>
                                                                           
                                                                        </tr> 
                                                                        <tr>
                                                                            
                                                                            <td ><font color="lightgray" size="4">Individual</font></td>
                                                                            <td ><font color="lightgray" size="4">Total</font></td>
                                                                           
                                                                        </tr> 
                                                                        <%
                                                                            
                                                                            
                                                                            ArrayList<beansIngredientes>  cosa = met.Ingredientes(nombredelplatillo);
                                                                            
                                                                            for (int ip = 0; ip < met.Ingredientes(nombredelplatillo).size() ; ip++) {
                                                                                    String ie= cosa.get(ip).getIngrediente();
                                                                                    
                                                                                    double porc=cosa.get(ip).getPorcion();
                                                                                    
                                                                                    String uni =cosa.get(ip).getUnidad();
                                                                                    %>
                                                                                        <tr>
                                                                                        <td><%out.print(ie);%></td>
                                                                                        <td><%
                                                                                            if (porc==0) {
                                                                                                    out.print("Al gusto");
                                                                                            }else{
                                                                                                out.print(porc+" "+uni);  
                                                                                            }
                                                                                                
                                                                                            %>
                                                                                        </td>
                                                                                        <td><%
                                                                                            if (porc==0) {
                                                                                                    if (alumnos==0) {
                                                                                                            out.print(porc+" "+uni);
                                                                                                        }else{
                                                                                                        out.print("Al gusto");
                                                                                                    }
                                                                                                    
                                                                                                }else{
                                                                                                
                                                                                                out.print((porc*alumnos)+" "+uni);
                                                                                            }
                                                                                                
                                                                                            %>
                                                                                        </td>
                                                                                        </tr>
                                                                                    <%
                                                                                    
                                                                                }
                                                                        %>
                                                                        
                                                                         

                                                                    </table>
                                                                </td>
                                                                <%
                                                                }
                                                                %>
                                                                
                                                            </tr>
                                                                        
                                                                        <%
                                                                    }
                                                            %>
                                                             
                                                        </table>
                                                    </div>
                                            </div>     
                                                         <%
                                                }
                                
                        
                        
                        %>
                        
                    </div>
                        
                </div>
            </div>
            
            
        </div>
        
        </div>
        
        
                        
        
        
        
        <script type="text/javascript" src="JS\jssesion.js" ></script> 
        <script  src="JS\jquery.js" ></script> 
        <script src="JS\bootstrap.js" ></script>
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