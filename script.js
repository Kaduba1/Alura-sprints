// Condiciones para el sprint //
/* e --> enter 
o --> ober
i --> imes
a --> ai
u --> ufat*/

function encriptar(){
    /* "i" es para afectar tanto palabras mayusculas como minusculas
    "g" es para toda la linea u oracion
    "m" es para afectar a multiples lineas o parrafos
    Para curarme en salud utilice todas */
    var texto = document.getElementById("text-input1").value.toLowerCase();
    var txtCifrado = texto.replace(/e/igm,"enter");
    var txtCifrado = txtCifrado.replace(/o/igm,"ober");
    var txtCifrado = txtCifrado.replace(/i/igm,"imes");
    var txtCifrado = txtCifrado.replace(/a/igm,"ai");
    var txtCifrado = txtCifrado.replace(/u/igm,"ufat");

    document.getElementById("imgGoku").style.display = "none";
    document.getElementById("texImg").style.display = "none";
    document.getElementById("text2").innerHTML = txtCifrado;
    document.getElementById("copi").style.display = "show";
    document.getElementById("copi").style.display = "inherit";
}

function desencriptar (){
    var texto = document.getElementById("text-input1").value.toLowerCase();
    var txtCifrado = texto.replace(/enter/igm,"e");
    var txtCifrado = txtCifrado.replace(/ober/igm,"o");
    var txtCifrado = txtCifrado.replace(/imes/igm,"i");
    var txtCifrado = txtCifrado.replace(/ai/igm,"a");
    var txtCifrado = txtCifrado.replace(/ufat/igm,"u");

    document.getElementById("imgGoku").style.display = "none";
    document.getElementById("texImg").style.display = "none";
    document.getElementById("text2").innerHTML = txtCifrado;
    document.getElementById("copi").style.display = "show";
    document.getElementById("copi").style.display = "inherit";
}

function copiar(){
    var contenido = document.querySelector(".texto2");
    contenido.select();
    document.execCommand("copy");
    alert("Por ahora todo bien");
}
function pegar(){
    var contenido = document.querySelector(".texto2");
    contenido.select();
    document.execCommand("paste");
}

