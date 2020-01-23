package com.example.testkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var items: List<UserRole>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var role : AppCompatTextView? = null

        init {
            role = itemView.findViewById(R.id.textRole)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder{
        // Create a new view
        val textRole = LayoutInflater.from(parent.context)
                       .inflate(R.layout.item_view_recycler, parent, false) as AppCompatTextView

        // set some params

        return ViewHolder(textRole)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){

        // get element from your dataset at this position
        // replace the contents of the view with that element

        holder.role?.text = items[position].role
    }

    override fun getItemCount() = items.size
}