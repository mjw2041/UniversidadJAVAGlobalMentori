// promesas, await, async y setTimeout
async function funcionConPromesaAwaitTimeout () {
    console.log('inicio funcion');
    let mipromesa = new Promise( resolver => {
        setTimeout (() => resolver('promesa con await y timeout'),3000);
    });
    console.log(await mipromesa);
    console.log('fin de la funcion');
}

funcionConPromesaAwaitTimeout();