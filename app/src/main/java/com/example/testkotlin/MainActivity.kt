package com.example.testkotlin

import android.content.Context
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.PopupWindow

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

        fun initList():List<UserRole>{
            val items = listOf(
                UserRole("Admin"),
                UserRole("Manager"),
                UserRole("Developer"),
                UserRole("Developer"),
                UserRole("Dima"),
                UserRole("Ilya"),
                UserRole("Maxim"),
                UserRole("Natalya"),
                UserRole("Tany"),
                UserRole("Arnold"),
                UserRole("dave"),
                UserRole("Trata"),
                UserRole("Cran"),
                UserRole("Cfa"),
                UserRole("Andrey"),
                UserRole("Stepan"),
                UserRole("Petr"))
            return items
        }

        fun getPixel(dp: Int):Int{
            return dp* resources.displayMetrics.density as Int
        }

//        recyclerView.addItemDecoration(itemDecor)



        loginButton.setOnClickListener {



            val window = PopupWindow(this)



            window.init(this, initList())

            window.width = resources.getDimensionPixelSize(R.dimen.pop_up_width)
            window.height = resources.getDimensionPixelSize(R.dimen.pop_up_height)


            window.showAsDropDown(editRole)
            //window.showAsDropDown(editRole)
}



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


//        val layout: TextInputLayout = findViewById(R.id.textInputLayoutSignIn)
//
//        layout.setAnError("Pizdec, vse slomalos", R.drawable.shape_background_error)
//        Handler().postDelayed({
//            layout.hideAnError(R.drawable.shape_background)
//        }, 7000)

    }

}

