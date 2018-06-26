<%-- 
    Document   : prueba
    Created on : 12/05/2018, 06:02:11 PM
    Author     : HP
--%>


<%@page import="beans.metodo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        
        
        <title> hi</title>
    </head>
    <body style="background-color: white">
        
        <%
            //Calendar calendario=Calendar.getInstance();
            //Calendar fecha = new GregorianCalendar();
            /*Calendar ultimoDia = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH + 1, 0);
            String fecha_bd=calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+calendario.get(Calendar.DAY_OF_MONTH);
            ArrayList cosa = new ArrayList();
            cosa.add(fecha_bd);
            String honly=(calendario.get(Calendar.YEAR))+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+calendario.get(Calendar.DAY_OF_MONTH);
for (int i = 0; i < 5; i++) {
        
        
    }*/




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
                        out.print(fechabd+" "+random);
                        //met.random(fechabd,random);
                    }


            }
        }
        
    }


//out.print(calendario.);

        int t =1, cant=5, rango=10;
        int arreglo []= new int[rango];
        
       
        





        %>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
      
        <div class="container">
  <div class="page-header">
      <h1></h1>
  </div>
</div>

<div class="container">
  <div id="carousel-example-generic" class="carousel slide">
  <!-- Indicators --> 
  
  
    <!--<li data-target="#carousel-example-generic" data-slide-to="0" class="active">1</li>
    <li data-target="#carousel-example-generic" data-slide-to="1">2</li>
    <li data-target="#carousel-example-generic" data-slide-to="2">3</li>
    <li data-target="#carousel-example-generic" data-slide-to="3">4</li>
    <li data-target="#carousel-example-generic" data-slide-to="4">5</li>
    <li data-target="#carousel-example-generic" data-slide-to="5">6</li>
    <li data-target="#carousel-example-generic" data-slide-to="6">7</li>-->
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="http://placehold.it/1200x500" alt="...">
    </div>
    <div class="item">
      <img src="http://placehold.it/1200x500" alt="...">
    </div>
    <div class="item">
      <img src="http://placehold.it/1200x500" alt="...">
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>

        
        <div class="wrapper typo">This is a custom
  <div class="list"><span class="placeholder">select</span>
    <ul class="list__ul">
      <li><a href="">select</a></li>
      <li><a href="">lorem</a></li>
      <li><a href="">ipsum</a></li>
      <li><a href="">dolor</a></li>
      <li><a href="">sit</a></li>
      <li><a href="">amet</a></li>
    </ul>
  </div>
  <!--
  .select
    select.typo
      - each item in ['lorem', 'ipsum', 'dolor', 'sit', 'amet']
        option.typo 
  -->
</div>
            <style>
                
                .typo, .list a {
  font-size: 60px;
  font-weight: 700;
  font-family: 'Playfair Display', sans-serif;
  color: #585858;
  text-decoration: none;
}
.typo option, .list a option {
  font-size: 30px;
}

.transition {
  transition: all .4s ease-in-out;
}

body {
  text-align: center;
}

.wrapper {
  padding-top: 150px;
  height: 100vh;
  font-size: 60px;
}

.list {
  display: inline-block;
  position: relative;
  margin-left: 6px;
}
.list ul {
  text-align: left;
  position: absolute;
  padding: 0;
  top: 0;
  left: 0;
  display: none;
}
.list ul .active {
  display: block;
}
.list li {
  list-style: none;
}
.list li:first-child a {
  color: #7d40bf;
}
.list a {
  transition: all .4s;
  color: #7b00ff;
  position: relative;
}
.list a:after {
  position: absolute;
  content: '';
  height: 5px;
  width: 0;
  left: 0;
  background: #b066ff;
  bottom: 0;
  transition: all .4s ease-out;
}
.list a:hover {
  cursor: pointer;
  color: #b066ff;
}
.list a:hover:after {
  width: 100%;
}

select {
  display: inline;
  border: 0;
  width: auto;
  margin-left: 10px;
  outline: none;
  -webkit-appearance: none;
  -moz-appearance: none;
  border-bottom: 2px solid #555;
  color: #7b00ff;
  transition: all .4s ease-in-out;
}
select:hover {
  cursor: pointer;
}
select option {
  border: 0;
  border-bottom: 1px solid #555;
  padding: 10px;
  -webkit-appearance: none;
  -moz-appearance: none;
}

.placeholder {
  border-bottom: 4px solid;
  cursor: pointer;
}
.placeholder:hover {
  color: #888888;
}
                
            </style>
            <script>
            
            console.clear();

var el = {};

$('.placeholder').on('click', function (ev) {
  $('.placeholder').css('opacity', '0');
  $('.list__ul').toggle();
});

 $('.list__ul a').on('click', function (ev) {
   ev.preventDefault();
   var index = $(this).parent().index();
   
   $('.placeholder').text( $(this).text() ).css('opacity', '1');
   
   console.log($('.list__ul').find('li').eq(index).html());
   
   $('.list__ul').find('li').eq(index).prependTo('.list__ul');
   $('.list__ul').toggle();   
   
 });


$('select').on('change', function (e) {
  
  // Set text on placeholder hidden element
  $('.placeholder').text(this.value);
  
  // Animate select width as placeholder
  $(this).animate({width: $('.placeholder').width() + 'px' });
  
});
            
            
            
            
            
            
            
            
            
            </script>
        <script type="text/javascript" src="JS\jssesion.js" ></script> 
        <script  src="JS\jquery.js" ></script> 
        <script src="JS\bootstrap.js" ></script>
    </body>
</html>
