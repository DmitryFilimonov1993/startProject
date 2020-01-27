package com.example.testkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.PopupWindow
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputLayout

class SignInFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_login, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listUser = listOf("User", "Manager", "HR", "Developer", "Testo", "Admin")
        val listUserEmpty: List<String>? = null


        val editViewUserRole: AppCompatEditText = view.findViewById(R.id.editRole)

        editViewUserRole.setOnClickListener {

            context?.let {

                PopupWindow().apply {

                    width = view.findViewById<TextInputLayout>(R.id.textInputLayoutChooseRole).width
                    softInputMode = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE

                    init(it, listUser){
                        editViewUserRole.setText(it)
                        this@apply.dismiss()
                    }

                    showAsDropDown(
                        editViewUserRole,
                        0,
                        resources.getDimensionPixelSize(R.dimen.gap_from_ed_text)
                    )
                }
            }
        }
    }
}