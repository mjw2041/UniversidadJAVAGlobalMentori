for ( let contador = 0; contador <= 10; contador ++ ){
    if ( contador % 2 !== 0 ) {
        continue; // ir a la siguiente interaccion        
        console.log("despues del continue");
    } else {
        console.log(" contador " + contador );
    }

}