package com.example.testkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.PopupWindow
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun PopupWindow.init(context : Context, listUser : List<String>, userSelectedListener: CustomAdapter.RoleSelectedListener){

    val view : View = LayoutInflater.from(context).inflate(R.layout.pop_up_window_layout,null)
    val recyclerView : RecyclerView = view.findViewById(R.id.recyclerPopupView)

    height = if (listUser.size < 4) WindowManager.LayoutParams.WRAP_CONTENT else
        context.resources.getDimensionPixelSize(R.dimen.height_popup_window)
    isFocusable = true
    recyclerView.setHasFixedSize(true)
    recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
    val adapter = CustomAdapter(listUser, userSelectedListener)

    recyclerView.adapter = adapter
    contentView = view
}