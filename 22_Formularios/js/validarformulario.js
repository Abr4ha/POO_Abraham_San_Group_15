function validar(formulario){
    //validar el tamaño del nombre
    if(formulario.nombre.value.length < 5){
        alert("Escriba por lo menos seis caracteres en el campo nombre");
        //colocar cursor en el campo de error
        formulario.nombre.focus();
        return (false);
    }
    //se cambio var a let
    var checkOk ="ABCDEFGHIJKLMNOPKRSTUVWXYZ"+"abcdefghijklmnopkrstuvwxyz";
    var checkStr = formulario.nombre.value;
    var allvalid = true;
    for(var i = 0; i < checkStr.length; i++ ){
        var ch = checkStr.charAt(i);
        for(var j = 0; j < checkOk.length; j++ ){
            if(ch == checkOk.charAt(j))
            break;
        }
        if(j == checkOk.length){
            allvalid = false;
            break;
        }
    }
    if(!allvalid){
        alert("Escribe solo letras en el campo Nombre");
        formulario.nombre.focus();
        return (false);
    }
    if(formulario.edad.value.lenght > 2){
        alert("Escriba solo 2 digitos en el campo edad");
        formulario.nombre.focus();
        return false;
        /* Diferencia entre un metodo y un proceso*/
    }
    var checkOk ="0987654321";
    var checkStr = formulario.edad.value;
    var allvalid = true;
    for(var i = 0; i < checkStr.length; i++ ){
        var ch = checkStr.charAt(i);
        for(var j = 0; j < checkOk.length; j++ ){
            if(ch == checkOk.charAt(j))
            break;
        }
        if(j == checkOk.length){
            allvalid = false;
            break;
        }
    }
    if(!allvalid){
        alert("Escribe solo numeros en el campo Edad");
        formulario.edad.focus();
        return (false);
    }
    //Manejo de expresiones regulares
    //Expreciones regulares en mozilla firefox
    var txt = formulario.correo.value;
    var b = /^[^@\s]+@[^@\.\s]+(\.[^@\.\s]+)$/;
    alert("Email "+(b.test(txt)<?"":"no "+"valido"));
    return b.test(txt);
}