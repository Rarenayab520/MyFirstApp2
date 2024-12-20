package com.nayab.myfirstapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivitySplash : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)
        sharedPreferences=getSharedPreferences("MyAppPrefrence",Context.MODE_PRIVATE)
        var LoggedIN=sharedPreferences.getBoolean("LoggedIN",false)

        Handler(Looper.getMainLooper()).postDelayed({

            if(LoggedIN==true)
            {
                startActivity(Intent(this@ActivitySplash,Activity_card_view::class.java))
                finish()
            }
            else
            {
                startActivity(Intent(this@ActivitySplash,MainActivity::class.java))
                finish()
            }

        }, 3000)








    }
}