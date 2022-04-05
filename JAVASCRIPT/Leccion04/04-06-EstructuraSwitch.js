let numero = -4;
let numeroTexto = "Valor Desconocido";

switch ( numero ) {
    case 1:
        numeroTexto = "UNO";
        break;
    case 2: 
        numeroTexto = "DOS";
        break;
    case 3:
        numeroTexto = "TRES";
        break;
    case 4:
        numeroTexto = "CUATRO";
        break;         
    default:
        numeroTexto = "Caso no Encontrado"
        break;  
};

console.log( numero + " ---> " + numeroTexto);