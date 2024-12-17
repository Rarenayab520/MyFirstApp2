package com.nayab.myfirstapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nayab.myfirstapp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button.setOnClickListener(){

                var useremail=Email.text.toString()
                var userpassword=Password.text.toString()
                //for email checking
                if (useremail=="nayab@gmail.com")
                {
                    //for password checking
                    if (userpassword=="123")
                    {
                        //for new screen opening after login
                        var Intent= Intent(this@MainActivity , Activity_card_view :: class.java)
                        startActivity( Intent)
                        Toast.makeText(this@MainActivity,"Login Successfully", Toast.LENGTH_SHORT).show()
                    }
                    else
                    {
                        Toast.makeText(this@MainActivity,"Password is incorrect", Toast.LENGTH_SHORT).show()
                    }
                }
                else
                {
                    Toast.makeText(this@MainActivity,"OPSSS....!! Account not Created...", Toast.LENGTH_SHORT).show()
                }


            }

        }

        }
    }
