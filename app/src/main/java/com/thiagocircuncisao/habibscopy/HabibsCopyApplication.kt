package com.thiagocircuncisao.habibscopy

import android.app.Application
import android.content.Context
import com.thiagocircuncisao.habibscopy.model.Client

class HabibsCopyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Client.pref = getSharedPreferences("appPrefs", Context.MODE_PRIVATE)
    }
}