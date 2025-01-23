package com.nayab.myfirstapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var listUser:ArrayList<ModelUser>,var listner:itemclicklistner):RecyclerView.Adapter<Adapter.UserViewHolder>() {

    //1 inner class viewholder
    //1.1 adapter ko inherit karna hey recyclerview adapter
    //2 oncreate item create
    //3 viewholder view binding
    //4 bind
    //5 size return
    interface itemclicklistner
    {
        fun itemclick(modelUser: ModelUser)
    }
    //point 1
    inner class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var username=itemView.findViewById<TextView>(R.id.user_name)
        var message=itemView.findViewById<TextView>(R.id.message_preview)
        var layuser=itemView.findViewById<LinearLayout>(R.id.itemuser)
    }
   //point 2
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
     var itemView=LayoutInflater.from(parent.context).inflate(R.layout.recyclerview,parent,false)
        return UserViewHolder(itemView)
    }
   // point 5
    override fun getItemCount(): Int {
     return listUser.size
    }
   //point 3
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
    // holder.username.text=listUser[position].username
       // holder.message.text=listUser[position].message
        holder.message.text=listUser[position].email
        holder.layuser.setOnClickListener()
        {
            listner.itemclick(listUser[position])
        }
    }

}