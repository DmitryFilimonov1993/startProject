package com.example.testkotlin

import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)



        //findViewById<TextInputEditText>(R.id.emailInput).clearFocus()

//        val layout: TextInputLayout = findViewById(R.id.textInputLayout)
//
//        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_background_error)
//        Handler().postDelayed({
//            layout.hideAnError(R.drawable.shape_background)
//        }, 7000)

//       val spinner : Spinner = findViewById(R.id.spinner)
//        ArrayAdapter.createFromResource(this,R.array.users,android.R.layout.simple_spinner_item).also {
//           adapter ->  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//           spinner.adapter = adapter
//       }


    }
}
