/// Funcion constructor del tipo persona
function Persona( nombre = "Juan", apellido = "Perez" , email="tot@email.com") {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email
};

NN = new Persona();
console.log(NN);

padre = new Persona("Maxi","Weihmüller", "MWeihmuller@mail" );
console.log(padre);

madre = new Persona("Liliana", "Lucchini", "LLucchini@gmail")
console.log(madre);

padre.nombre = "Gastón";
console.log(padre);
console.log(madre);


