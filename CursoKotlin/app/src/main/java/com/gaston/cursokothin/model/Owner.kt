package com.gaston.cursokothin.model


/*
Modificadores de acceso o visibilidad

public: tiene acceso desde todo el proyecto
private: Solamente desde el archivo donde fue creado.
internal: accesible desde el modulo donde fue creado.
protected: puede ser accedido desde el mismo archivo funciona igual que private pero puede tener subclases dentro del mismo.

las clases sin modificador de acceso son por defecto public.

Variables
//    var --> mutable
//    val --> inmutable

kotlin genera automaticamente getters y setters es decir no se necesitan

*/

class Owner (username:String){

    // Crear variables estaticas
    companion object{
        private const val DEFAULT_NAME = "No Name"
    }

    var username = username
    var displayName= DEFAULT_NAME
        get() = field   // para detallar los getter
        set(value) { field = value}

    init {
        //para inicializar las variables.

    }

    //Segundo constructor
    constructor(username: String, displayName: String): this(username){
        // Inicializar variables

        this.displayName = displayName

    }

    fun concatenar(a: String, b:String): String{
        return a + b
    }

}

