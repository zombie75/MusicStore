package com.example.musicstore.Modelo.local.entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "instrument_details_table")
data class InstrumentDetailEntity (

    @PrimaryKey
    @NonNull

    val id : String,
    val nombre : String,
    val origen : String,
    val imagenLink : String,
    val descripcion : String,
    val añoCreacion : Int,
    val precio : Int

    )
