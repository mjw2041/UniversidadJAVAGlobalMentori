/*  LLama la funcion por un lapso de tiempo con un periodo determinado */

let reloj = () => {
    let fecha = new Date();
    console.log(`${fecha.getHours()} : ${fecha.getMinutes()} : ${fecha.getSeconds()} `);
}

setInterval(reloj, 1000);