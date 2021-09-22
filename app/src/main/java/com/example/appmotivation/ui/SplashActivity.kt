package com.example.appmotivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.example.appmotivation.R
import com.example.appmotivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_aplash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplash)
        mSecurityPreferences = SecurityPreferences((this))
        btn_save.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.btn_save) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = text_edit_name.text.toString()

        if (name != "") {
            mSecurityPreferences.storeString("name", name)
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            Toast.makeText(this, "Informe seu nome", Toast.LENGTH_SHORT).show()
        }
    }
}