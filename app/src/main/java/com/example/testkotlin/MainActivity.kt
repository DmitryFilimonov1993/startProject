package com.example.testkotlin

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val layout: TextInputLayout = findViewById(R.id.textInputLayout)
        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_error)
        Handler().postDelayed({
            layout.hideAnError(R.drawable.shape)
        }, 2000)

//       val spinner : Spinner = findViewById(R.id.spinner)
//        ArrayAdapter.createFromResource(this,R.array.users,android.R.layout.simple_spinner_item).also {
//           adapter ->  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//           spinner.adapter = adapter
//       }


    }
}
