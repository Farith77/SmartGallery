package com.dreamapps.smartgallery.data.local
// configuracion de la DB vectorial

import android.content.Context
import io.objectbox.BoxStore
import com.dreamapps.smartgallery.data.local.entities.MyObjectBox

object ObjectBoxManager {
    lateinit var store: BoxStore
        private set

    fun init(context: Context) {
        // MyObjectBox es una clase generada automáticamente tras compilar
        store = MyObjectBox.builder()
            .androidContext(context.applicationContext)
            .build()
    }
}