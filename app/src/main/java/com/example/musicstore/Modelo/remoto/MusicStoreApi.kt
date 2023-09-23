package com.example.musicstore.Modelo.remoto

import com.example.musicstore.Modelo.remoto.frominternet.Instruments
import com.example.musicstore.Modelo.remoto.frominternet.InstrumentsDetail
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface MusicStoreApi {

    @GET("MusicStore")
    suspend fun fetchInstrumentsList(): Response<List<Instruments>>

    @GET("MusicStore/{id}")
    suspend fun fetchInstrumentDetail(@Path("id")id:String): Response<List<InstrumentsDetail>>
}