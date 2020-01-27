package com.example.testkotlin

import android.os.Bundle
import android.os.Handler
import android.view.View

import android.view.WindowManager

import android.widget.PopupWindow

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.transition.FragmentTransitionSupport

import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listUser = listOf("User", "Manager", "HR", "Developer", "Testo", "Admin")
        val listUserEmpty : List<String>? = null


       var fragment : SignInFragment? = null
        var fragmentTransition : FragmentTransaction = supportFragmentManager.beginTransaction()
}

    private fun listUserInit(list: List<String>?, view: View){

        if(null == list)
        {
            val layout: TextInputLayout = findViewById(R.id.textInputLayoutChooseRole)
            layout.isEnabled = false
            view as AppCompatEditText
            view.setText("")
            layout.setAnError("Error validate of role", R.drawable.shape_background_error)
            Handler().postDelayed({
                layout.hideAnError(R.drawable.shape_background)
                layout.isEnabled = true
            }, 7000)


        }
        else {
            view as AppCompatEditText
            view.setText(list[0])
        }

    }
}