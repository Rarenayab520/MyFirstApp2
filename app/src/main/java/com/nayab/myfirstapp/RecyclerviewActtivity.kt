package com.nayab.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore

class RecyclerviewActtivity : AppCompatActivity(), Adapter.itemclicklistner {
    private  lateinit var rvUser:RecyclerView
    private  lateinit var btnGetdata:Button
    private val database = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recyclerview_acttivity)
        rvUser=findViewById(R.id.rvUsers)
        //Retrive data from firebase
        btnGetdata=findViewById(R.id.btnGetdata)
        var listUser=ArrayList<ModelUser>()
        btnGetdata.setOnClickListener()
        {
            database.collection("Username").get()
                .addOnSuccessListener { documents->
                        for (document in documents)
                            {
                              listUser.add(document.toObject(ModelUser::class.java))
                            }
                    rvUser.adapter=Adapter(listUser,this@RecyclerviewActtivity)
                }
                .addOnFailureListener {

                }
        }




       // listUser.add(ModelUser("Coach", "Noob eik kam karo..!"))
       // listUser.add(ModelUser("Hadiii", "kesi ho ?"))
       // listUser.add(ModelUser("Nayab", "kidr ho ?"))
       // listUser.add(ModelUser("Noob", "Alhamdulilah"))
        //listUser.add(ModelUser("Rare", "How are you?"))
        rvUser.layoutManager=LinearLayoutManager(this@RecyclerviewActtivity)
        rvUser.adapter=Adapter(listUser,this@RecyclerviewActtivity)

        //1 Recycler view
        //2 item design
        //3  list->type(class) pass-> Adapter
        //4 rv frontend layout
        //5 list pass Adapter set
        //6 Adapter class ->oncreateviewholder(viewholder)  onbindviewholder(data set ) item getcount
    }

    override fun itemclick(modelUser: ModelUser) {
        //Toast.makeText(this@RecyclerviewActtivity,modelUser.username, Toast.LENGTH_SHORT).show()
        startActivity(Intent(this@RecyclerviewActtivity,Activity_card_view::class.java))
    }
}