package com.nayab.myfirstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActtivity : AppCompatActivity() {
    private  lateinit var rvUser:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recyclerview_acttivity)
        rvUser=findViewById(R.id.rvUsers)
        var listUser=ArrayList<ModelUser>()
        listUser.add(ModelUser("Coach", "Noob eik kam karo..!"))
        listUser.add(ModelUser("Hadiii", "kesi ho ?"))
        listUser.add(ModelUser("Nayab", "kidr ho ?"))
        listUser.add(ModelUser("Noob", "Alhamdulilah"))
        listUser.add(ModelUser("Rare", "How are you?"))
        rvUser.layoutManager=LinearLayoutManager(this@RecyclerviewActtivity)
        rvUser.adapter=Adapter(listUser)
        //1 Recycler view
        //2 item design
        //3  list->type(class) pass-> Adapter
        //4 rv frontend layout
        //5 list pass Adapter set
        //6 Adapter class ->oncreateviewholder(viewholder)  onbindviewholder(data set ) item getcount

    }
}