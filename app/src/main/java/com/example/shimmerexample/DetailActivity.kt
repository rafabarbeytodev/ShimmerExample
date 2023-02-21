package com.example.shimmerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.isVisible
import com.example.shimmerexample.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //Simulamos un retraso en la carga del falso recycler de 5 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            showData()
        },4000)

    }

    private fun showData() {
        mBinding.viewLoading.isVisible = false
        mBinding.viewContainer.isVisible = true
    }
}