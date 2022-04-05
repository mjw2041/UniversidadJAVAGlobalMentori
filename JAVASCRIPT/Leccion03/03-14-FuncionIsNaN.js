let miNumero = "18x";

let edad = Number(miNumero);

console.log(edad);

if (isNaN(edad )) {
    console.log(miNumero + " No es un numero");
} else {
    if (edad >= 18 ) {
        console.log("Tiene " + edad +  " Puede votar");
    } else {
        console.log("Tiene " + edad + " Muy Joven para votar")
    }
}

if ( isNaN(edad)) {
    console.log(miNumero + " No es un numero");
} else {    
    let resultado = ( edad >= 18) ?" Puede votar" :" Muy joven para votar";
    console.log("Tiene " + edad + resultado);    
}