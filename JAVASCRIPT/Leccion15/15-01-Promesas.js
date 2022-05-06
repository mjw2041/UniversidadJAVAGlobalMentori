let miPromesa = new Promise( (resolver, recchazar) => { 
    let expresion = true;
    if (expresion) { 
        resolver('Resolvio Correcto');
    }else {
        recchazar('Se produjo un error');
    }
    
}); 

miPromesa.then ( valor => console.log(valor), 
     error => console.log(error));

miPromesa.then(  valor => console.log(valor))
         .catch(  valor => console.log(valor));

         
