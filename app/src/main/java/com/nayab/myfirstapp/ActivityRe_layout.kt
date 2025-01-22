package com.nayab.myfirstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.FirebaseApp
import com.nayab.myfirstapp.databinding.ActivityReLayoutBinding

class ActivityRe_layout : AppCompatActivity() {

    private lateinit var binding:ActivityReLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityReLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {




        }

    }
}