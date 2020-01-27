package com.example.testkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.PopupWindow
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun PopupWindow.init(
    context: Context,
    listUser: List<String>,
    onRolesSelectionListener: (String) -> Unit
) {

    isFocusable = true

    val view: View = LayoutInflater.from(context).inflate(R.layout.pop_up_window_layout, null)
    height = if (listUser.size < 4) WindowManager.LayoutParams.WRAP_CONTENT
    else context.resources.getDimensionPixelSize(R.dimen.height_popup_window)
    val recyclerView: RecyclerView = view.findViewById(R.id.recyclerPopupView)
    recyclerView.apply {
        adapter = RolesRecyclerAdapter(listUser).apply {
            onRoleSelected = { role ->
                onRolesSelectionListener.invoke(role)
            }
        }
        layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
    }
    contentView = view
}