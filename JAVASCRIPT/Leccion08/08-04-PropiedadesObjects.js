let persona = {
    nombre : 'Juan',
    apellido: 'Perez',
    email:'jPerez@mail.com',
    edad: 28,
    nombreCompleto: function () {
        return this.nombre + " " + this.apellido
    }
}

console.log(persona);

console.log(persona.nombre);

console.log(persona['nombre']);

// for in

for ( nombrePropiedad in persona) {
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}