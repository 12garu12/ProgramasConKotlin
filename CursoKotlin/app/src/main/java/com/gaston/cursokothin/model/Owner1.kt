package com.gaston.cursokothin.model

/*
var displayName: String = DEFAULT_NAME --> en el constructor esta inicializado por default
var username: String = "" --> si se le asignan valores vacios en el contructor se creara tambien un constructor vacio.

* */

data class Owner1(var username: String = "", var displayName: String = DEFAULT_NAME) {

    companion object{
        private const val DEFAULT_NAME = "No Name"
    }

}