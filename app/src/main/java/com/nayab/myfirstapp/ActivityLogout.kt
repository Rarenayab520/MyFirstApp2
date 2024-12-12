package com.nayab.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class ActivityLogout : AppCompatActivity() {

    private lateinit var  btlogout:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        //alert dialog
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)
        btlogout=findViewById(R.id.btlogout)


        btlogout.setOnClickListener()
        {
            var dialogBuilder=AlertDialog.Builder( this@ActivityLogout)
            dialogBuilder.setTitle("Alert...!")
            dialogBuilder.setMessage("Are you sure you want to Logout ?")
            dialogBuilder.setPositiveButton("yes"){_,_ ->
                Toast.makeText(this@ActivityLogout, "Okay...", Toast.LENGTH_SHORT).show()
            }
            dialogBuilder.setNeutralButton("No"){_,_ ->
                Toast.makeText(this@ActivityLogout, "Okieee", Toast.LENGTH_SHORT).show()
            }
            dialogBuilder.create().show()
        }

    }
}