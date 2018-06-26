<%-- 
    Document   : agregarUsu.jsp
    Created on : 1/06/2018, 04:20:49 AM
    Author     : HP
--%>

<%@page import="beans.metodo"%>
<%@page import="beans.Emp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        
        int nivel=0;
        try{
        session = request.getSession();
            String y;
            y=""+session.getAttribute("levelac");

             nivel=Integer.parseInt(y);
             if (nivel==4) {
                     
                 
        
        
            
        
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Usuario</title>
        <link href="SRC/iwachu.ico" rel="icon">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link rel="stylesheet" href="CSS/bootstrap.css">
        <link rel="stylesheet" href="adcss.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        
        <link rel="stylesheet" href="CSS/edityguardar.css">
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
                        <a href="#" onclick="asitencia()">
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
        
        
        
        
        
        
        <div align="center">
            <h1 class="titedit">Agregar Usuario: </h1><br>
        
        <form action="agregarUsu2" method="post">
            <table class="tablaedit">
                
            <tr>
                <td>
                <span class="input input--haruki">
					<input class="input__field input__field--haruki" type='text' name='usuarioAgre' maxlength='35' pattern='^[a-zA-Z ]+([a-zA-Z ]+)*$' required id="input-1" />
					<label class="input__label input__label--haruki" for="input-1">
						<span class="input__label-content input__label-content--haruki">Usuario</span>
					</label>
				</span>
                </td>
            </tr>
            <tr>
                <td>
                <span class="input input--haruki">
					<input class="input__field input__field--haruki" type='text' name='passwordAgre' maxlength='35' pattern='^[a-zA-Z ]+([a-zA-Z ]+)*$' required id="input-2" />
					<label class="input__label input__label--haruki" for="input-1">
						<span class="input__label-content input__label-content--haruki">Password</span>
					</label>
				</span>
                </td>
                
            </tr>
            <tr>
                <td>
                    <section class="content bgcolor-1">
                    <div class="sel sel--black-panther">
                    <select name="rolAgre" >
                        <option selected="selected" >Rol</option>
                        <option value="Cheff">Cheff</option>
                        <option value="Maestro">Maestro</option>
                        <option value="Tutor">Tutor</option>
                                    
                    </select>
                    <hr class="rule">
                    </div>  
                    </section>
                </td>
            </tr>
            
            <tr >
                <td colspan="2" align="center" >
                    
                    <input type="submit" value=" Guardar " class="guardar" >
                </td>
            </tr>
            
            
        </table>
        </form>
                
        </div>        
        <script  src="JS\jquery.js" ></script> 
        <script src="JS\bootstrap.js" ></script>
        <script src="JS\classie.js" ></script>
        <script>
        $('.sel').each(function() {
          $(this).children('select').css('display', 'none');

          var $current = $(this);

          $(this).find('option').each(function(i) {
            if (i == 0) {
              $current.prepend($('<div>', {
                class: $current.attr('class').replace(/sel/g, 'sel__box')
              }));

              var placeholder = $(this).text();
              $current.prepend($('<span>', {
                class: $current.attr('class').replace(/sel/g, 'sel__placeholder'),
                text: placeholder,
                'data-placeholder': placeholder
              }));

              return;
            }

            $current.children('div').append($('<span>', {
              class: $current.attr('class').replace(/sel/g, 'sel__box__options'),
              text: $(this).text()
            }));
          });
        });

        // Toggling the `.active` state on the `.sel`.
        $('.sel').click(function() {
          $(this).toggleClass('active');
        });

        // Toggling the `.selected` state on the options.
        $('.sel__box__options').click(function() {
          var txt = $(this).text();
          var index = $(this).index();

          $(this).siblings('.sel__box__options').removeClass('selected');
          $(this).addClass('selected');

          var $currentSel = $(this).closest('.sel');
          $currentSel.children('.sel__placeholder').text(txt);
          $currentSel.children('select').prop('selectedIndex', index + 1);
        });
    </script>
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
