let promesa = new Promise ((resolver)=> {    
    console.log("Inicio Promesa");
    setTimeout( ()=> resolver('Saludo con promesa y timeout'), 3000);
    console.log("Fin Promesa");
})

promesa.then(valor=>console.log(valor));


let promesa2 = new Promise ((resolver, rechazar)=> {    
    let valor = 9;
    if ( valor > 10) {
        setTimeout( ()=> resolver('Se resolvio el saludo con promesa y timeout'), 3000);
    } else {
        setTimeout( ()=> rechazar('Se rechazo, el saludo con promesa y timeout'), 3000);
    }
    
})

promesa2.then(valor=>console.log(valor)) /* funcion flecha */
       .catch(valor=>console.log(valor));
