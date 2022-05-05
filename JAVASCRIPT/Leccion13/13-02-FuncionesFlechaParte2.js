const miFuncionFlecha = ( ) => {
    console.log("Saludos desde mi funcion Flecha");
}
miFuncionFlecha();

const mifuncionFlechaRed = () => console.log("Saludos desde mi funcion flecha red");
mifuncionFlechaRed();

const saludar = () => { return "saludo desde mi funcion flecha con return" };
console.log(saludar());

const saludarRed = () => "Saludo desde mi funcion flecha con return reducida"
console.log(saludarRed());

const regresaObjeto = () => ({nombre:"Juan", apellido:"Perez"});
console.log(regresaObjeto());

const funcionConParametro = mensaje => console.log(mensaje); 
funcionConParametro("Saludo con parametros");

const funcionConVariosParametros = (op1,  op2) => ( op1+op2) ; 
console.log(funcionConVariosParametros(1, 3));














