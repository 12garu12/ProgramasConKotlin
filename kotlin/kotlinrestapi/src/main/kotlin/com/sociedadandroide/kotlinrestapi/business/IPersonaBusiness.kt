package com.sociedadandroide.kotlinrestapi.business

import com.sociedadandroide.kotlinrestapi.model.Persona

interface IPersonaBusiness {

    fun list(): List<Persona>

    fun load(idPersona:Long): Persona

    fun save(persona:Persona): Persona

    fun remove(idPersoan:Long)

}