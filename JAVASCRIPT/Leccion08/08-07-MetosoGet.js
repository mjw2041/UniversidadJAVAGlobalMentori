let persona = {
    nombre : 'Juan',
    apellido: 'Perez',
    email:'jPerez@mail.com',
    edad: 28,
    get nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}

console.log("Nombre Completo " + persona.nombreCompleto );
