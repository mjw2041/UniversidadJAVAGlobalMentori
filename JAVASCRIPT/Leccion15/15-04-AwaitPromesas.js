// Ejmpplo de async await
async function funcionConPromesayAwait () {
    let miPromesa = new Promise( resolver => {
        resolver('Promesa con await'); 
    });

    console.log( await miPromesa);
}


funcionConPromesayAwait();