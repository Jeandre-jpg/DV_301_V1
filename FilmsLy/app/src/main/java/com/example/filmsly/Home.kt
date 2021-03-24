package com.example.filmsly

import android.R
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_start

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.filmsly.R.layout.activity_home)

        btn_start.setOnClickListener {
            if(et_name.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                var intent = Intent(this, CategoriesView::class.java)
                overridePendingTransition(com.example.filmsly.R.anim.slide_from_right, com.example.filmsly.R.anim.slide_to_left)
                val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()

                editor.apply{
                    putString(Constants.USER_NAME, et_name.text.toString())
                    apply()
                }

                startActivity(intent)
                finish()
            }
        }


    }
}