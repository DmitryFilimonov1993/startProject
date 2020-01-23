package com.example.testkotlin

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_recycler)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(init)


 fun init() : List<UserRole> {
            val items = listOf(
                UserRole("Admin"),
                UserRole("Manager"),
                UserRole("Developer"),
                UserRole("Petr")

            )
            return items
        }






//
//        val layout: TextInputLayout = findViewById(R.id.textInputLayoutSignIn)
//
//        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_background_error)
//        Handler().postDelayed({
//            layout.hideAnError(R.drawable.shape_background)
//        }, 7000)



    }


}
