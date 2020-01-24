package com.example.testkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var items: List<UserRole>, val callback: UserRoleSelectedListener) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.


    override fun getItemCount() = items.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view
        val textRole = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_recycler, parent, false)

        // set some params

        return ViewHolder(textRole)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // get element from your dataset at this position
        // replace the contents of the view with that element

        holder.bind(items[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val role = itemView.findViewById<AppCompatTextView>(R.id.textRole)

        fun bind(item: UserRole) {
            role.text = item.role
            itemView.setOnClickListener {
                if (adapterPosition != RecyclerView.NO_POSITION) callback.onItemSelected(items[adapterPosition])
            }
        }

    }

    interface UserRoleSelectedListener {
        fun onItemSelected(item: UserRole)
    }
}