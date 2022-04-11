let persona = {
    nombre : 'Juan',
    apellido: 'Perez',
    email:'jPerez@mail.com',
    edad: 28,
    nombreCompleto: function () {
        return this.nombre + " " + this.apellido
    }
}

// Agregar propiedad
persona.telefono = 123456;
console.log(persona);

// Cambiar el valor 
persona.telefono = 45454;
console.log(persona);

// Eliminar propiedad
delete persona.telefono;
console.log(persona);
