package com.nayab.myfirstapp


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /// enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        email=findViewById(R.id.Email)
        password=findViewById(R.id.Password)
        button=findViewById(R.id.button)


        button.setOnClickListener(){

            var useremail=email.text.toString()
            var userpassword=password.text.toString()
            if (useremail=="nayab@gmail.com")
            {
                if (userpassword=="123")
                {
                    Toast.makeText(this@MainActivity,"Login Successfully", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(this@MainActivity,"Password is incorrect", Toast.LENGTH_SHORT).show()
                }
            }
            else
            {
                Toast.makeText(this@MainActivity,"OPSSS....!!Account not Created...", Toast.LENGTH_SHORT).show()
            }


        }
       /// ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
       ///     val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
           /// v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
         ///   insets
        }
    }
