let persona = {
    nombre : 'Juan',
    apellido: 'Perez',
    email:'jPerez@mail.com',
    edad: 28,

    nombreCompleto: function() {
            return this.nombre + " " + this.apellido;
    }
}

console.log(" Nombre Completo " + persona.nombreCompleto());