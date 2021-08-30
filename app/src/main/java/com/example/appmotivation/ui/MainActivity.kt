package com.example.appmotivation.ui

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appmotivation.R
import com.example.appmotivation.infra.MotivationConstants
import com.example.appmotivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSharedPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSharedPreferences = SecurityPreferences(this)
        textName.text = "Olá, " + mSharedPreferences.getString(MotivationConstants.KEY.PERSON_NAME)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        btnNova.setOnClickListener(this)
        img_infinito.setOnClickListener(this)
        img_sorriso.setOnClickListener(this)
        img_sol.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id

        val litaFiltro = listOf(R.id.img_infinito, R.id.img_sol, R.id.img_infinito)

        if (id == R.id.btnNova) {
            handlerFrase()
        } else {
            handlerFilter(id)
        }
    }

    private fun handlerFilter(id: Int) {
        img_infinito.setColorFilter(resources.getColor(R.color.white))
        img_sol.setColorFilter(resources.getColor(R.color.white))
        img_sorriso.setColorFilter(resources.getColor(R.color.white))


        when (id) {

            R.id.img_sol -> {
                img_sol.setColorFilter(resources.getColor(R.color.purple_200))
            }
            R.id.img_sorriso -> {
                img_sorriso.setColorFilter(resources.getColor(R.color.purple_200))
            }
            R.id.img_infinito -> {
                img_infinito.setColorFilter(resources.getColor(R.color.purple_200))
            }

        }


    }


    private fun handlerFrase() {

    }
}