
import java.util.Scanner;

// Comentario Simple
// Mi primera Clase Java
public class HolaMundo {
    /*       
       La funcion main nos permite ejecutar el programa 
    */
    public static void main ( String args []) {
        /*
           System.out.println(); permite imprimir linea en la consola
        */
        System.out.println("Hola desde Java");

        /*
           definicion de variable, 
           tipo nombre = Valor
           Ej,
           int miPrimeraVariableEntere = 10;

           
           var ---> La variable adquiere el tipo segun su asignacion.         
           int ---> Variable numerica entera
           String ---> Varible tipo Cadena
        
        
           alt + shift + f --->  formatea el codigo
           ctrl + space -->  Muestra la variables 
           ctrl + clck ---> Nos lleva a lugar donde se definio la variable
           sout<tab> ---> System.out.println("");
           soutv<tab> ---> System.out.println("") de la ultima variable;           
           shift + F6 ---> Run Programa
           Ctrl +  Mayuscula + F5  ---> Debug File
           Ctrl +  Mayuscula + F7  ---> Add Watch
           Ctrl + espacio ---> Aparecen las variables que creamos
                               o los archivos
           
           F8 ---> paso a la siguiente linea en modo debug
           Para agregar una linea de ruptura apretar el boton derecho en el 
           numero de linea y click en breakpoint          
        */

        int miPrimeraVariable = 10;

        System.out.println("miPrimeraVariable (antes)" + miPrimeraVariable);

        /* Modificar el valor de la variable */

        miPrimeraVariable = 5;
        System.out.println("miPrimeraVariable (despues)" + miPrimeraVariable );

        String miPrimeraCadena = "Saludos";                   
        System.out.println("miPrimeraCadena ( antes )" + miPrimeraCadena );                    

        miPrimeraCadena = "Adios";
        System.out.println("miPrimeraCadena (despues )" + miPrimeraCadena );

        var miSegundaVariable  = 10;
        System.out.println("miSegundaVariable " + miSegundaVariable);           

        var miSegundaCadena = "Mi Segunda Cadena";           
        System.out.println("miSegundaCadena = " + miSegundaCadena);

        /* Nombre de Variables Permitidos */
        var miVariable = 10;
        var _miVariable = 11;
        var $miVariable = 12;

        var áVariable = 13; // No se recomienda 
        // var #miVariable = 2; // no se permite utilizar caracteres especiales                                 
        
        /** 
         *  Concatenacion de variables
         *  + ---> concatena Variables STRING
         *  + ---> suma dos variables del tipo numerica
         *  La concatenacion se hace de izquierda a Derecha
         */
                 
        
        var apellidoNombre = "Weihmüller Maximiliano";
        var titulo = "Licenciado";
        
        var union = titulo + " " + apellidoNombre;
        System.out.println("union = " + union);
        
        var i = 10;
        var j = 20;
        
        System.out.println("i + j ");
        System.out.println(i + j); /// Se realiza la suma de los numero
        System.out.println("i + j union ");
        System.out.println(i + j  + " " + union ); // Evaluacion de izq a derecha, raliza una suma
        
        System.out.println("union + i + j");
        System.out.println(union + " " + i + j ); // contexto cadena. todo es una cadena
        
        System.out.println("union + ( i + j )");
        System.out.println(union + " " + ( i + j) ); // uso de parantesis, modifican la prioridad.
        
        /* Clase 11 Caracteres Especiales 
           \  Caracter Escape
           \n Salto de Linea 
           \t Tabulador 
           \b Retroceso
           \' Comillas Simples
        */
        
        var nombre = "Karla";
        
        System.out.println("Nueva Linea: \n" + nombre );
        
        System.out.println("Tabulador: \t" + nombre );
        
        System.out.println("Retroces:  \b" + nombre );
        
        System.out.println("Retroceso:  \b\b\b" + nombre );
        
        System.out.println("Comillas Simples:  \' " + nombre + " \'" );
                        
        System.out.println("Comillas Dobles  \" " + nombre + " \"" );
        
        /*
           Clase 12 Clase Scanner
           Esta clase permite dentro de otras cosas permitir el ingreso de datos
           por medio de teclado
           Scanner <nombre de la variable > = new Scanner(System.in);
           .nextLine() Permite leer una linea completa de la consola
        
           
           
        */
        System.out.println("Estcribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Ingrese el titulo universitario: ");
        var tituloUniversitario = consola.nextLine();
        System.out.println("tituloUniversitario = " + tituloUniversitario + " " + usuario);
               
        /**
         *  Resolucion Ejercicio
         */
                               
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Escriben el titulo del libro");
        var tituloLibro = ingreso.nextLine();
        
        System.out.println("Escriben el titulo del libro");
        var autorLibro = ingreso.nextLine();
        
        System.out.println(tituloLibro + " fue escrito por " + autorLibro);  
        
        /**
         *  Clase 14 
         *  Tipo Primitivos Enteros
         *    Byte  8 bits
         *    Short 16 bits
         *    int   32 bits ( es el mas usados )
         *    long  64 bits
         * 
         *    Definicion de variables 
         *    <tipo> <nombreVariable> = <valorVaiable>
         *    
         *    MIN_VALUE ---> Devuelve el valor minimo que se le puede dar 
         *                   a un tipo de variable 
         * 
         *    MAX_VALUE ---> Devuelve el valor maximo que se le puede dar 
         *                   a un tipo de variable 
         * 
         *    (tipoVarible) valorVariable --->  convierte el valorVariable a 
         *                  tipoVariable 
         * 
         *    L al final convierte una literal de 32 bits a 64 bits, 
         *         se utilza cuando quiero almacenar convertir un int   
         * 
         *    D al final convierte una literal a formato Double, 
         * 
         *    F al final convierte una literal a formato Float, 
         *         
         */   
         
         
          
         byte varByte = 10;
         System.out.println("varByte = " + varByte); 
         
         varByte = (byte) 129;
         System.out.println("varByte (byte) = " + varByte); 
                         
         System.out.println("Valor minimo BYTE: " + Byte.MIN_VALUE);
         System.out.println("Valor máximo BYTE: " + Byte.MAX_VALUE);
         
         short varShort = 10;
         System.out.println("varShort = " + varShort);
         
         varShort = (short) 32900;
         System.out.println("varShort (short) = " + varShort); 
         
         
         System.out.println("Valor minimo SHORT: " + Short.MIN_VALUE);
         System.out.println("Valor máximo SHORT: " + Short.MAX_VALUE);
         
         
         int varInteger = 10;
         System.out.println("varInteger = " + varInteger);
         
         varInteger = (int) 2147483700L;
         System.out.println("varInteger (Integer) = " + varInteger); 
         
         System.out.println("Valor minimo INTEGER: " + Integer.MIN_VALUE);
         System.out.println("Valor máximo INTEGER: " + Integer.MAX_VALUE);
         
         
         long varLong = 10;
         System.out.println("varLongr = " + varLong);
         
         varLong = (long) 9223372036854775808D;
         System.out.println("varLong (Long) = " + varLong); 
         
         
         System.out.println("Valor minimo LONG: " + Long.MIN_VALUE);
         System.out.println("Valor máximo LONG: " + Long.MAX_VALUE);
         
         /*
         *  Clase 16 
         *  Tipo Primitivos Flotantes
               float  --> 32 Byte 
               Double --> 64 Bite   
               Utilizan notacion cientifica   
         
            Para asignarle un valor a una variable flotante tenemos que 
                 a> utilizar el (float)
                 b> Agregar un F al final del numero
            dado que el numero con coma es Double por definicion                  
         
            Este tipo de asignacion --> varFloat = (float) <valor>;
              puede perder preciosion si esto ocurre el compilador devuelve 
              el valor Infinity
         * 
         */
         
         // float varFloat = 10.0F;
         
         float varFloat = (float)10.0;
         System.out.println("varFloat = " + varFloat);
         
         varFloat = (float) 3.4028236E38D;
         System.out.println("varLong (Long) = " + varFloat); 
                                      
         System.out.println("Valor minimo FLOAT: " + Float.MIN_VALUE);
         System.out.println("Valor máximo FLOAT: " + Float.MAX_VALUE);
         
         double varDouble = 10.25;
         System.out.println("varDouble = " + varDouble);
         
         System.out.println("Valor minimo DOUBLE: " + Double.MIN_VALUE);
         System.out.println("Valor máximo DOUBLE: " + Double.MAX_VALUE);
         
         /**
          *  Clase 17 Palabra reservada VAR
          *  
          *  Cuando se usa la palabra VAR para definir una variable este es del 
          *  tipo INT si el nro es entero, si el numero tiene coma es de tipo 
          *  double.          
          *  Para definir una variable del tipo FLOAT con VAR, tenemos 
          *  que agregar una F al final del numero a asignar
          */
         
         var numeroEntero = 10;
         System.out.println("numeroEntero = " + numeroEntero);
         
         var numeroDoble = 10.25;
         System.out.println("numeroDoble = " + numeroDoble);
         
         var numeroFLOAT = 10.25F;
         System.out.println("numeroFLOAT1 = " + numeroFLOAT);
         
         /**
          *   Claee 18 Variables Char
          *   Se pueden almacenar solo un caracter, se definen com la
          *   palabra char
          *   Con el comando \n indicamos que lo que continua es un codigo 
          *   unicode
          *   Si la asigno un numero, la variable va a contener el simbolo
          *   que representa ese numero en la tabla.
          *   Si utilizo el oomando var se puede asignar por los metodos 
          *   simbolo y unicode. 
          *   Si asigno un valor char a una variables decimal, esta va a 
          *   contener el numero que representa ese caracter
          * 
          */
         
          char varChar = 'a';
          System.out.println("varChar = " + varChar);
          
          varChar = '\u0021';
          System.out.println("varChar (unicode) = " + varChar);
          
          varChar = 33;
          System.out.println("varChar (decimal) = " + varChar);
          
          varChar = '!';
          System.out.println("varChar (simbolo) = " + varChar);
          
          var varChar1 = '\u0021';
          System.out.println("varChar1 (unicode)= " + varChar1);
          
          varChar1 = '!';
          System.out.println("varChar (simbolo) = " + varChar1);
          
          int varEnteraSimbolo = '!';
          System.out.println("varEnteraSimbolo = " + varEnteraSimbolo);
          
          /**
           *  Clase 19 
           *  Varibales Booleana
           * 
           *  Se definen con la palabra boolean,  los posibles valores son 
           *  true y false
           */
          
          boolean varBoolean = true;
          System.out.println("varBoolean = " + varBoolean);
          
          varBoolean = false;
          System.out.println("varBoolean = " + varBoolean);
          
          if ( varBoolean == true ) { 
              System.out.println("La bandera es verdadera" );
          } else {
              System.out.println("La bandera es falsa" );
          }                                                                                                                                    
          
          var edad = 30;
          var esAdulto = edad >= 18;
          if (esAdulto) {
              System.out.println(" Eres Mayor de edad" );
          } else {
              System.out.println(" Eres Menor de edad" );
          }
          /**
           *   Clase 20, 21
           *   Coversion tipo primitivos
           *   integer.parseInt --- Convierte String to Integer
           *   Double.parseDouble --- Convierte String to Double
           *   String.valueOf(edadInteger) --- Covierte Cualquier tipo a String
           * 
           *   La clase scanner ingresa un valor del tipo string
           *   por eso la tenemos que convertir a un tipo numerico
           *   string.value
           *   <nombreCadena>.charAt(indice) --- Devuelve el caracter posicion
           *   indice de <nombreCadena>
           *   
           *   
           */
          
          var edadInteger = Integer.parseInt("20");
          
          System.out.println("edadInteger = " + ( edadInteger + 1));
          
          var valorPI = Double.parseDouble("3.1416");
          System.out.println("edadInteger = " +  valorPI );                                           
          
          /// Pedir valor
          System.out.println("Proporciona tu edsd");
          
          var ingresado = new Scanner(System.in);
                             
          edadInteger = Integer.parseInt(ingresado.nextLine());
          System.out.println("edadInteger = " + edadInteger);
          
          var edadTexto = String.valueOf(edadInteger);
          System.out.println("edadTexto = " + edadTexto);
          
          var caracter = "Hola Mundo".charAt(5);
          System.out.println("caracter = " + caracter);
          
          System.out.println("Ingrese un caracter");
          caracter = ingresado.nextLine().charAt(0);
          
          System.out.println("caracter = " + caracter);
          
          /*
             Ejercicio Clase 22
          */
          
          
          /**
           *  Clase 23 Operadores Aritmerico
           *  Se puede definir varias variable separadas por coma, 
           *  no se puede utilizar var.
           *  Cuando el resultado de la division se guarda en varuable int
           *  se guarda sin los valores de la coma, realiza un trunc
          */
          
          int a=3, b=2;
          
          var resultado = a+ b;
          
          var resultadoFloat = 3.5;
                                                
          System.out.println("resultado suma = " + resultado);
          
          resultado = a - b;
          
          System.out.println("resultado resta = " + resultado);
          
          resultado = a * b;
          
          System.out.println("resultado multiplicacion = " + resultado);
          
          resultado = a / b;
          
          System.out.println("resultado division = " + resultado);
          
          resultadoFloat = 3D / b;
          
          System.out.println("resultado division Float = " + resultadoFloat);
          
          resultado = a % b;
          
          System.out.println("resultado modulo = " + resultado);
          
          /* Verifica si una variable es par */
          
          if ( a % 2 == 0) {
              System.out.println("Es par");
          } else {
              System.out.println("Es Impar");
          }          
    }
}
