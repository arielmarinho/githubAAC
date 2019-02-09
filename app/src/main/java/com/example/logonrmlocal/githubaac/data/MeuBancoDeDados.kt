package com.example.logonrmlocal.githubaac.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverter
import android.arch.persistence.room.TypeConverters
import com.example.logonrmlocal.githubaac.data.local.converter.DateConverter
import com.example.logonrmlocal.githubaac.data.local.dao.UserDao
import com.example.logonrmlocal.githubaac.data.local.entity.User

@Database(entities = [User::class], version = 1)
@TypeConverters(DateConverter::class)
abstract  class MeuBancoDeDados: RoomDatabase(){
    //abstract class nao consigo gerar uma nova instancia do banco de dados
    abstract fun userDao(): UserDao

    companion object {
        private val INSTANCE : MeuBancoDeDados? = null
    }
}