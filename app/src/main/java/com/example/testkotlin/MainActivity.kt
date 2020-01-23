package com.example.testkotlin

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var viewAdapter: RecyclerView.Adapter<*>
    lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_log_in)

        viewManager = LinearLayoutManager(this)



//
//        val layout: TextInputLayout = findViewById(R.id.textInputLayoutSignIn)
//
//        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_background_error)
//        Handler().postDelayed({
//            layout.hideAnError(R.drawable.shape_background)
//        }, 7000)



    }


}
