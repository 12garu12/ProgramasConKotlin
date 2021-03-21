package com.gaston.cursokothin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gaston.cursokothin.funciones.saludar2
import com.gaston.cursokothin.model.Owner
import com.gaston.cursokothin.model.Owner1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val owner: Owner = Owner("UnNombre", "Cualquier nombre para mostrar")
        val owner2 = Owner("Garu")
        val owner3 = Owner("Gastsail", "Gaston Sailen")
        val owner4 = Owner1() // tiene un constructor vacio

        if (owner == owner3){
            // es porque tienen el mismo hashCode
            owner.hashCode() == owner3.hashCode()
        }

        if (owner.equals(owner3)){
            // true
        }

        if (owner === owner3){
            //false
        }else{
            //true
        }

        owner2.concatenar("Juan", "Esteban")

        saludar("Andrés")

        saludar2("Andrea")


        //Listas de solo lectura
        val list: List<Int> = listOf(1, 2, 3, 4, 5)

        owner.username = "gastsail"
        owner.displayName = "Gaston Sailen"

        var list2 = mutableListOf<Owner>()

        list2.add(owner)


        // Bucle for
        val nombres = listOf("Gaston", "Lucas", "Matias")

        for (nombre in nombres){
            Log.d("nombre: ", "" + nombre[2])
        }

        for ((indice, valor) in nombres.withIndex()){
            Log.d("$indice", valor)
        }

        // Bucle while
        var x = 0
        while (x < 10 ){
            Log.d("x: ", "" + x)
            x++
        }


    }

    //FUNCIONES
    fun saludar(nombre: String): String{
        return "Hola $nombre"
    }



}