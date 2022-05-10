// async define que una funcion va a devolver una promesa
async function miFuncionConPromesa(){
    return 'saludos con promesa y async';    
}

miFuncionConPromesa().then(valor=> console.log(valor));

