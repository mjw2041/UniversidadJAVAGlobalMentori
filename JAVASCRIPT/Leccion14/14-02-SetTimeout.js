// Llamadas asincronas con el uso SetTimeout
function miFuncionCallBack(){
    console.log('Saludo asincrono despues de 3 segundos');
}

setTimeout(miFuncionCallBack, 3000);

/*setTimeout( function () { console.log('Saludo asincrono despues de 6 segundos)}, 6000); */

setTimeout( function(){ console.log('Saludo asincrono despues de 6 segundos')},6000 )

setTimeout( () => console.log( 'Saludo asincrono despues de 10 segundos'), 9000);

