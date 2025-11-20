package com.example.aplikasiandroidpertamastar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PendaftaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pendaftaran)
        val backlogin = findViewById<Button>(R.id. btnCancel)

        backlogin.setOnClickListener {
            val intentLogin = Intent(this, MainActivity::class.java)
            startActivity(intentLogin)
            finish()0
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pendaftaran)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}