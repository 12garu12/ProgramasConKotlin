package com.sociedadandroide.kotlinrestapi.dao

import com.sociedadandroide.kotlinrestapi.model.Persona
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonaRepository:JpaRepository<Persona, Long>