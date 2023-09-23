package com.example.musicstore.Modelo.local.entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName= "instrument_list_table")
data class InstrumentEntity (

    @PrimaryKey
    @NonNull

    val id : String,
    val nombre : String,
    val origen : String,
    val imagenLink : String,
    val precio : Int

    )
