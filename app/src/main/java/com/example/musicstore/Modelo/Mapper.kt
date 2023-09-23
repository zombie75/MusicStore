package com.example.musicstore.Modelo


import com.example.musicstore.Modelo.local.entities.InstrumentDetailEntity
import com.example.musicstore.Modelo.local.entities.InstrumentEntity
import com.example.musicstore.Modelo.remoto.frominternet.InstrumentsDetail
import com.example.musicstore.Modelo.remoto.frominternet.Instruments


fun fromInternetToInstrumentEntity(instrumentList: List<Instruments>): List<InstrumentEntity>{

    return instrumentList.map {

        InstrumentEntity(

            id= it.id,
            nombre = it.nombre,
            origen = it.origen,
            imagenLink = it.imagenLink,
            precio = it.precio


        )


    }

}

fun fromInternetToInstrumentDetailEntity(Instruments: InstrumentsDetail): InstrumentDetailEntity{


    return InstrumentDetailEntity(
        id= Instruments.id,
        nombre = Instruments.nombre,
        origen = Instruments.origen,
        imagenLink = Instruments.imagenLink,
        descripcion = Instruments.descripcion,
        añoCreacion= Instruments.añoCreacion,
        precio= Instruments.precio


    )


}