package com.agung.pertemuan6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(private val persons:ArrayList<String> ) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

     class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

          val textView:TextView
          init{
               textView=itemView.findViewById(R.id.nameTextView)
          }
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
          val view=LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false)
          return PersonViewHolder(view)
     }

     override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
          holder.textView.text=persons[position]
     }

     override fun getItemCount(): Int {
          return persons.size
     }


}