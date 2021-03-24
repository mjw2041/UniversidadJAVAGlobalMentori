function validarForma ( forma) {
    var usuario = forma.usuario;
    if (usuario.value === "" || usuario.value === "Escribir usuario"){
        alert("Debe Proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if (password.value === "" || password.value.length < 3){
        alert("Debe Proporcionar un password mayor a 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologia = forma.tecnologia;
    var checkSeleccionado = false;    
    for ( var i=0; tecnologia.length > i; i++ ){
        alert (tecnologia[i].checked);
        if ( tecnologia[i].checked) {
            checkSeleccionado = true;
        }            
    }
    if (!checkSeleccionado) {
        alert ("Debe ingresar una tecnologia");
        return(false);
    }
    
    
    var genero = forma.genero;
    var radioSelaccionado = false;
    
    for ( var i=0; genero.length > i; i++) {
        if (genero[i].checked ){
            radioSelaccionado = true;
        }
    }
    
    if ( !radioSelaccionado ) {
        alert ("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
       
    if (ocupacion.value === "" ){
        alert("Debe Seleccionar una ocupacion");        
        return false;
    }
    /// Formulacion Valido
    alert( "Enviado Datos al Servidor");
    return true;
        
}  


