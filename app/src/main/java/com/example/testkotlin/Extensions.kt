package com.example.testkotlin

import androidx.annotation.DrawableRes
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.setAnError(message: String,
                               @DrawableRes editTextBackground: Int){
    error = message
    isErrorEnabled = true
    editText?.background?.clearColorFilter()
    editText?.setBackgroundResource(editTextBackground)
}

fun TextInputLayout.hideAnError(@DrawableRes editTextBackground: Int){
    error = ""
    isErrorEnabled = false
    editText?.background?.clearColorFilter()
    editText?.setBackgroundResource(editTextBackground)
}