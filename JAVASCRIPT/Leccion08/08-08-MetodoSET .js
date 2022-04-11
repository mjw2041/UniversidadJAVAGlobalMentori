let persona = {
    nombre : 'Juan',
    apellido: 'Perez',
    email:'jPerez@mail.com',
    edad: 28,
    idioma: 'es',
    get lang() {
        return this.idioma.toUpperCase();
    },
    
    set lang( lang ) {
        this.idioma = lang.toUpperCase();
    },
    
    get nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

}

console.log("Lenguaje " + persona.lang );
persona.lang = 'us';
console.log("Lenguaje " + persona.lang );

