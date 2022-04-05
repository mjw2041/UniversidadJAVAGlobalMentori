let miNumero = "20";
console.log(miNumero + " " + typeof(miNumero)); 

let edad = Number(miNumero);
console.log(edad + " " + typeof(edad)); 

if (edad >= 18 ) {
    console.log("Tiene " + edad +  " Puede votar");
} else {
    console.log("Tiene " + edad + " Muy Joven para votar")
}

let resultado = ( edad >= 18) ?" Puede votar" :" Muy joven para votar";
console.log("Tiene " + edad + resultado);
