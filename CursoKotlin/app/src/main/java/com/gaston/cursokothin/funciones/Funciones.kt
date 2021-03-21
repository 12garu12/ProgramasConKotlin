package com.gaston.cursokothin.funciones

// Funcion top level ---> osea una función a nivel de paquete
fun saludar2(nombre: String): String{
    return "Como estas $nombre"
}

class Funciones {

    // Member  ---> considerada función miembro
    fun saludar(nombre:String): String{
        return "Hola $nombre"
    }

    // funcion de una sola linea
    fun suma(a:Int, b:Int) = a + b


}