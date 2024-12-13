package com.nayab.myfirstapp

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
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
        //Custom dialog
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)
        btlogout=findViewById(R.id.btlogout)


        btlogout.setOnClickListener()
        {
            var dialog=Dialog(this@ActivityLogout)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

            dialog.setContentView(R.layout.custom_alert_dialog)
            var yes=dialog.findViewById<MaterialButton>(R.id.btnyes)
            var no=dialog.findViewById<MaterialButton>(R.id.btnNo)
            yes.setOnClickListener()
            {
                Toast.makeText(this@ActivityLogout, "Okay Yes ...", Toast.LENGTH_SHORT).show()
                 dialog.dismiss()
            }
            no.setOnClickListener()
            {
                Toast.makeText(this@ActivityLogout, "No Clicked...", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            /*var dialogBuilder=AlertDialog.Builder( this@ActivityLogout)
            dialogBuilder.setTitle("Alert...!")
            dialogBuilder.setMessage("Are you sure you want to Logout ?")
            dialogBuilder.setCancelable(false)
            dialogBuilder.setPositiveButton("yes"){_,_ ->
                Toast.makeText(this@ActivityLogout, "Okay...", Toast.LENGTH_SHORT).show()
            }
            dialogBuilder.setNeutralButton("No"){_,_ ->
                Toast.makeText(this@ActivityLogout, "Okieee", Toast.LENGTH_SHORT).show()
            }
            dialogBuilder.create().show()*/
        }

    }
}