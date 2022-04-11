let mes = 11;
let estacion = "Estacion desconocida";

switch ( mes ) {
   case 1: case 2:  case 12:
       estacion = "Verano";
       break;
   case 3: case 4:  case 5:
       estacion = "Otoño";
       break;    
   case 3: case 4:  case 5:
       estacion = "Otoño";
       break;    
   case 6: case 7:  case 8:
        estacion = "Primavera";
        break;           
  case 9: case 10:  case 11:
        estacion = "Verano";
        break;               
  default:          
        estacion = "Valor Desconocido";
        break;               
}

console.log(mes + " Estacion " + estacion);

