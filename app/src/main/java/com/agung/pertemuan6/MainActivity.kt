package com.agung.pertemuan6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.recyleView)
        recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        val items=fetchData()
        val adapter=PersonAdapter(items)
        recyclerView.adapter=adapter
        val recyclerView2:RecyclerView=findViewById(R.id.recyleView)
        recyclerView2.layoutManager=LinearLayoutManager(this@MainActivity)
        recyclerView2.adapter=adapter

    }
    fun fetchData():ArrayList<String>{
        val list =ArrayList<String>()
        for (i in 0 until 10){
            list.add("item $i")
        }
        return list
    }
}