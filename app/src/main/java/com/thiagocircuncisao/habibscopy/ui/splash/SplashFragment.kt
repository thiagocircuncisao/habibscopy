package com.thiagocircuncisao.habibscopy.ui.splash

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.thiagocircuncisao.habibscopy.R
import com.thiagocircuncisao.habibscopy.ui.main.MainActivity

class SplashFragment : Fragment(), SplashFragmentViewable {
    private val presenter: SplashPresenter = SplashPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.init()
    }

    override fun openLogin() {
        findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
    }

    override fun openHome() {
        findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
    }
}
