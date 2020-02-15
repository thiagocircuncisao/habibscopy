package com.thiagocircuncisao.habibscopy.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.thiagocircuncisao.habibscopy.R
import com.thiagocircuncisao.habibscopy.ui.login.LoginFragment

class MainActivity : AppCompatActivity(), MainActivityViewable {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
