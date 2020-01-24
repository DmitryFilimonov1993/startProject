package com.example.testkotlin

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_log_in.*


class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_log_in)

        var color = ResourcesCompat.getColor(resources, R.color.orange, null)
        iconBack.setColorFilter(color)

//        editRole.setOnClickListener {  }
//
//
//        fun showUserRole(){
//
//           val menu = DropDownUserRole(this)
//            menu.
//        }
//        val itemDecor = DividerItemDecoration(baseContext, DividerItemDecoration.VERTICAL)
//        itemDecor.setDrawable(ContextCompat.getDrawable(baseContext, R.drawable.divider)!!)
//        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.addItemDecoration(itemDecor)
//        recyclerView.adapter = CustomAdapter(items)

//        val layout: TextInputLayout = findViewById(R.id.textInputLayoutSignIn)
//
//        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_background_error)
//        Handler().postDelayed({
//            layout.hideAnError(R.drawable.shape_background)
//        }, 7000)

    }
}
