package com.thiagocircuncisao.habibscopy.ui.splash

import com.thiagocircuncisao.habibscopy.model.Client
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class SplashPresenter(private val view: SplashFragmentViewable) {

    fun init() {
        waitLoading()
    }

    private fun waitLoading() {
        GlobalScope.launch(Dispatchers.IO) {
            TimeUnit.SECONDS.sleep(5L)
            if (!Client.isLogged) view.openLogin()
            else view.openHome()
        }
    }
}
