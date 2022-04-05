let hora = -1;
let saludo

if ( hora >= 6 && hora <= 11 ) {
    saludo = "Buenos dias";
} else if ( hora >= 12 && hora <=  18 ) {
    saludo = "Buenas Tardes";
} else if ( hora >= 19 && hora <= 24 ) {
    saludo = "Buenas noches";
} else if ( hora >= 0 && hora <= 6 ) {
    saludo = "Durmiendo";
} else  {
    saludo = "Desconocido";
};

console.log ( " Hora " + hora + " " + saludo);


