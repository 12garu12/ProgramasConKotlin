package com.gaston.cursokothin.model


/*
Modificadores de acceso o visibilidad

public: tiene acceso desde todo el proyecto
private: Solamente desde el archivo donde fue creado.
internal: accesible desde el modulo donde fue creado.
protected: puede ser accedido desde el mismo archivo funciona igual que private pero puede tener subclases dentro del mismo.

las clases sin modificador de acceso son por defecto public.

*/

class Owner (username:String){

    init {
        //para inicializar las variables.

    }

    //Segundo constructor
    constructor(username: String, display: String): this(username){
        // Inicializar variables

    }


}