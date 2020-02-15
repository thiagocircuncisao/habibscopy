package com.thiagocircuncisao.habibscopy.model

import android.content.SharedPreferences
import android.content.SharedPreferences.Editor

object Client {
    lateinit var pref: SharedPreferences

    var isLogged: Boolean
        get() = pref.getBoolean("isLogged", false)
        set(isLogged) = pref.edit().putBoolean("isLogged", isLogged).apply()
}