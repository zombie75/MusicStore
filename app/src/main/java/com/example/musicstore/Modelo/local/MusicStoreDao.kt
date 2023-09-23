package com.example.musicstore.Modelo.local


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.musicstore.Modelo.local.entities.InstrumentDetailEntity
import com.example.musicstore.Modelo.local.entities.InstrumentEntity


@Dao
interface MusicStoreDao {

    // insertar lista

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllInstruments(listInstrument: List<InstrumentEntity>)

    @Query("SELECT * FROM instrument_list_table ORDER BY id ASC")
    fun getAllInstruments(): LiveData<List<InstrumentEntity>>

    // Inserta un elemneto

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertInstrumentDetail(instrument: InstrumentDetailEntity)

    @Query("SELECT * FROM instrument_details_table ORDER BY id ASC")
    fun getInstrumentDetailByID(id:String): InstrumentDetailEntity?
}