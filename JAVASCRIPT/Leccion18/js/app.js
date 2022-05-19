console.log("Aplicacion Calculadore")

function sumar () {   
    const forma = document.getElementById('forma');
    let operandoA = forma['operandoA'];
    let operandoB = forma['operandoB'];

    let resultado = parseInt(operandoA.value) + parseInt(operandoB.value);
    if ( isNaN(resultado)) {
        resultado = 'La operación no incluye número';
    }
    console.log("resultado: " +  resultado)
    document.getElementById('resultado').innerHTML = `Resultado: ${resultado}` ;

}

