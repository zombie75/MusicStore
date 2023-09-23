package com.example.musicstore.Modelo.remoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        private const val BASE_URL = "https://caso-music-mariocanedo.vercel.app/"
        // parantestear
        lateinit var retrofitInstance : Retrofit
        fun retrofitInstance():MusicStoreApi{

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(MusicStoreApi::class.java)

        }

    }
}
