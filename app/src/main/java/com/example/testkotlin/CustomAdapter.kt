package com.example.testkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var listRole: List<String>, var roleSelectedListener: RoleSelectedListener?) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textView : AppCompatTextView? = null
        init {
            textView = itemView.findViewById(R.id.textRole)
        }
    }

    override fun getItemCount() = listRole.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val textRole = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_recycler, parent, false)
        return ViewHolder(textRole)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textView?.text = listRole[position]

        holder.itemView.setOnClickListener {
            if (null != roleSelectedListener)
                roleSelectedListener?.onUserSelected(position, listRole)
        }
    }
    interface RoleSelectedListener {
        fun onUserSelected(position: Int, listRole: List<String>)
    }
}