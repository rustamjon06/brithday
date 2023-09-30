package com.example.brithday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profil_Activity : AppCompatActivity() {
    lateinit var setting: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        setting = findViewById(R.id.profile_settings)

        setting.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }


    }
}