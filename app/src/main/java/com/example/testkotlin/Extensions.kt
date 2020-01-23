package com.example.testkotlin

import android.content.res.ColorStateList
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.setAnError(message: String,
                               @DrawableRes editTextBackground: Int){
    error = message
    isErrorEnabled = true
    editText?.background?.clearColorFilter()
    editText?.setBackgroundResource(editTextBackground)
    //setPasswordVisibilityToggleTintList(AppCompatResources.getColorStateList(context, R.color.colorError))
}

fun TextInputLayout.hideAnError(@DrawableRes editTextBackground: Int){
    error = ""
    isErrorEnabled = false
    editText?.background?.clearColorFilter()
    editText?.setBackgroundResource(editTextBackground)
    //setPasswordVisibilityToggleTintList(AppCompatResources.getColorStateList(context, R.color.white))

}