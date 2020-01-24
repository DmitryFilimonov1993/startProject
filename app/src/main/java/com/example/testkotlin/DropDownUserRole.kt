package com.example.testkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DropDownUserRole(var context: Context?,var view: View?) : PopupMenu(context, view) {

    init{

        setupView()
    }

    fun setupView(){

       var view : View = LayoutInflater.from(context).inflate(R.layout.pop_up_window_layout, null)
       var recycler = view.findViewById<RecyclerView>(R.id.recyclerView1)
        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        var list: UserRole
        recycler.adapter = CustomAdapter(list.initList())


   }
}