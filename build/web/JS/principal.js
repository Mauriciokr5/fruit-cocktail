/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*window.onload=function(){
    //document.getElementById('I').innerHTML=window.location.href.length;
    var url = window.location.href;
    var fin =(url.charAt(window.location.href.length-2))+(url.charAt(window.location.href.length-1));
    document.getElementById('I').innerHTML=fin;
    /*if (fin.equals("IS")) {
        iniciosesion();

    }
};*/
function Inicio(){

    document.getElementById('I').style.display = 'block';
    document.getElementById('QS').style.display = 'none';
    document.getElementById('IS').style.display = 'none';
    
}

function quienes_somos(){
       
    document.getElementById('I').style.display = 'none';
    document.getElementById('QS').style.display = 'block';
    document.getElementById('IS').style.display = 'none';
}

function iniciosesion(){
    document.getElementById('I').style.display = 'none';
    document.getElementById('QS').style.display = 'none';
    document.getElementById('IS').style.display = 'block';
}

//administrador
function menus(){
    
    document.getElementById('adm').style.display = 'none';
    document.getElementById('asis').style.display = 'none';
    document.getElementById('men').style.display = 'block';
}
function administrador(){
    document.getElementById('adm').style.display = 'block';
    document.getElementById('men').style.display = 'none';
    document.getElementById('asis').style.display = 'none';
}
function asitencia(){
    document.getElementById('men').style.display = 'none';
    document.getElementById('asis').style.display = 'block';
    document.getElementById('adm').style.display = 'none';
}

function validarn(e) {

	var teclado=(document.all) ? e.eyCode : e.which;
	if (teclado==8) return true;

	var patron = /[0-9\d]/;
	var tec = String.fromCharCode(teclado);
	return patron.test(tec);
}
