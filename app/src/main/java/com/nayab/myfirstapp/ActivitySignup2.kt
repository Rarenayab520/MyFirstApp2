package com.nayab.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.remote.FirebaseClientGrpcMetadataProvider
import com.nayab.myfirstapp.databinding.ActivitySignup2Binding

class ActivitySignup2 : AppCompatActivity() {
    private lateinit var binding:ActivitySignup2Binding
    private val database = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivitySignup2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

       button.setOnClickListener()
       {
           var modelUser=ModelUser()
           modelUser.email=Email.text.toString()
           modelUser.password=Password.text.toString()

           database.collection("Username").add(modelUser)
               .addOnSuccessListener {
                   Toast.makeText(this@ActivitySignup2, "Account created Successfully", Toast.LENGTH_SHORT).show()
               }
               .addOnFailureListener {
                   Toast.makeText(this@ActivitySignup2, "Opss...Something went wrong...!!", Toast.LENGTH_SHORT).show()
               }
       }


        }
    }
}