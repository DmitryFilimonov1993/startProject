package com.example.testkotlin

import android.graphics.Color
import android.view.*
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class RolesRecyclerAdapter(private val listRole: List<String>) :
    RecyclerView.Adapter<RolesRecyclerAdapter.RoleViewHolder>() {

    /**
     * String as selected role
     */

    init {
        setHasStableIds(true)
    }


    internal lateinit var onRoleSelected: (String) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RoleViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_role, parent, false)
    )

    override fun onBindViewHolder(holder: RoleViewHolder, position: Int) {

        val role = listRole[position]


        holder.apply {

            textView.text = role
            itemView.apply {
                tag = position
                setOnClickListener {
                    val tagPos = it.tag as Int
                    if (::onRoleSelected.isInitialized)
                    {
                        onRoleSelected.invoke(listRole[tagPos])
                    }

                }
            }
        }
    }

    override fun getItemCount() = listRole.size
    override fun getItemId(position: Int) = position.toLong()

    class RoleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: AppCompatTextView = itemView.findViewById(R.id.textRole)
    }
}
