package com.example.mymarket

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.RadioButton
import com.example.mymarket.Fragements.Inscription
import com.example.mymarket.Fragements.login

class GererComptes: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_comptes)

        val btnLogin = findViewById<TextView>(R.id.btnLogin)
        val btnInscription = findViewById<TextView>(R.id.btnInscription)

     supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, login()).commit()

        findViewById<TextView>(R.id.btnLogin).setOnClickListener {
            btnLogin.setBackgroundResource(R.drawable.toggle_selected)
            btnInscription.setBackgroundResource(R.drawable.toggle_unselected)
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, login()).commit()
        }
        findViewById<TextView>(R.id.btnInscription).setOnClickListener {
            btnInscription.setBackgroundResource(R.drawable.toggle_selected)
            btnLogin.setBackgroundResource(R.drawable.toggle_unselected)
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, Inscription()).commit()
        }

    }
}
