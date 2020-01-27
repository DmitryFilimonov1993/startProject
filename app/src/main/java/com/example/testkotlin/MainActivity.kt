package com.example.testkotlin

import android.content.Context
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.os.Bundle
import android.text.Editable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.PopupWindow

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.fragment_log_in.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_log_in)

        val listUser = listOf("User", "Manager", "HR", "Developer", "Testo", "Admin")

        var editViewUserRole : AppCompatEditText = findViewById(R.id.editRole)

        editViewUserRole.setOnClickListener {

            val popupWindow = PopupWindow()

            popupWindow.width = findViewById<TextInputLayout>(R.id.textInputLayoutChooseRole).width
            popupWindow.softInputMode = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE
            popupWindow.init(this, listUser, object :CustomAdapter.RoleSelectedListener{
                override fun onUserSelected(position: Int, listRole: List<String>) {
                    editViewUserRole.setText(listRole[position])
                    popupWindow.dismiss()
                }
            })
            popupWindow.showAsDropDown(editViewUserRole,0,resources.getDimensionPixelSize(R.dimen.gap_from_ed_text))
        }

}

//        val itemDecor = DividerItemDecoration(baseContext, DividerItemDecoration.VERTICAL)
//        itemDecor.setDrawable(ContextCompat.getDrawable(baseContext, R.drawable.divider)!!)


//        val layout: TextInputLayout = findViewById(R.id.textInputLayoutSignIn)
//
//        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_background_error)
//        Handler().postDelayed({
//            layout.hideAnError(R.drawable.shape_background)
//        }, 7000)

}

