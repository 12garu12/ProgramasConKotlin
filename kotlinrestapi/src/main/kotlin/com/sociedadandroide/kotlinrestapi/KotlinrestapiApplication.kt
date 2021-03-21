package com.sociedadandroide.kotlinrestapi

import com.sociedadandroide.kotlinrestapi.dao.PersonaRepository
import com.sociedadandroide.kotlinrestapi.model.Persona
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@SpringBootApplication
class KotlinrestapiApplication:CommandLineRunner{

    @Autowired
    val personaRepository: PersonaRepository? = null

    override fun run(vararg args: String?) {

        /*val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        val persona1 = Persona(4567576556, "Gaston", "Saillen", LocalDate.of(1994, 5, 23))
        val persona2 = Persona(4567576556, "John", "Doe", LocalDate.parse("23-08-1999", formatter))

        personaRepository!!.save(persona1)
        personaRepository!!.save(persona2)*/


    }
}

fun main(args: Array<String>) {
    runApplication<KotlinrestapiApplication>(*args)
}
