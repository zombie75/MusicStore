package com.example.musicstore.Modelo.local.database



import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.musicstore.Modelo.local.entities.InstrumentDetailEntity
import com.example.musicstore.Modelo.local.entities.InstrumentEntity
import com.example.musicstore.Modelo.local.MusicStoreDao


@Database(entities = [InstrumentEntity::class, InstrumentDetailEntity::class], version = 1,
    exportSchema = false)
abstract class InstrumentsDataBase : RoomDatabase(){

    // representacion del dao
    abstract fun getMusicStoreDao() : MusicStoreDao

    companion object{

        @Volatile
        private var
                INSTANCE : InstrumentsDataBase? = null
        fun getDataBase(context: Context) : InstrumentsDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    InstrumentsDataBase::class.java, "instruments_db")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

}