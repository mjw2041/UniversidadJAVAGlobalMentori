console.log("Listado de Persona");

const personas = [
    new Persona ('Juan', 'Perez'),
    new Persona ('Karla', 'Lara'),
    new Persona ('Maria', 'Juarez')
];

function mostrarPersona() {
    console.log('Mostar Persona...');
    let texto = '';
    for ( let persona of personas ) {
        console.log( persona);
        texto +=`<li> ${persona.nombre} ${persona.apellido}</li>`;
    }

    document.getElementById('personas').innerHTML = texto;
}

function agregarPersona () {
    const forma = document.getElementById('forma');
    const nombre = forma['nombre'];
    const apellido = forma['apellido'];
    console.log(nombre.value);
    if ( nombre.value != '' && apellido.value != '') {
        const persona = new Persona(nombre.value, apellido.value);
        console.log(persona);
        personas.push(persona);
        mostrarPersona();
    } else {
        console.log('No hay informacion que agregar');
    }
    
    
}