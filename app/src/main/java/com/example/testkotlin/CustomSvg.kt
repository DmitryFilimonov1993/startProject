package com.example.testkotlin

import android.graphics.PorterDuff
import androidx.appcompat.widget.AppCompatImageView

class CustomSvg {
    fun AppCompatImageView.setSvgColor(color: Int){
        this.setColorFilter(color, PorterDuff.Mode.SRC_IN)
    }
}