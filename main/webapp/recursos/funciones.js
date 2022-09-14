function validarForm(form){
    var usuario = form.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario" ){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = form.password;
    if(password.value == "" || password.value.length < 3){
        alert("debe proporcionar un password de al menos 3 elementos");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = form.tecnologia;
    var checkboxSeleccionado = false;
    for (var i = 0; i < tecnologias.length; i++) {
        if(tecnologias[i].checked){
            checkboxSeleccionado = true;
            
        }
    }
    if(!checkboxSeleccionado){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    
    var generos = form.genero;
    var radioSeleccionado = false;
    for (var i = 0; i < generos.length; i++) {
        if(generos[i].checked){
            radioSeleccionado= true;
        }
    }
    if(!radioSeleccionado){
        alert("debe seleccionar un género");
        return false;
    }
    
   var ocupacion = form.ocupacion;
   if(ocupacion.value == ""){
       alert("debe seleccionar una ocupacion");
       return false; 
   }
    
 // si llegados a este punto, nunca hemos hecho return 'false' significa que el 
 // formulario es válido
 alert("formulario valido, enviando datos al servidor");
 return true;
    
}