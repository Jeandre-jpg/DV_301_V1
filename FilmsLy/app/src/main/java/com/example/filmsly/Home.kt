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

//        val et_name = findViewById<EditText>(R.id.et_name)

//        //get shared preferences
//        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
//
//        //fab onclick
//        fab_last_user.setOnClickListener {
//            //get values
//            val userName = sharedPref.getString(Constants.USER_NAME, "No User")
//            val wrongAnswers = sharedPref.getInt(Constants.WRONG_ANSWERS, 0)


            //Start button Click
            btn_start.setOnClickListener {

                //Check if name is empty
                if (et_name.text.toString().isEmpty()) {
                    Toast.makeText(this, "Please enter your username", Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(this, CategoriesView::class.java).apply {
                        // putExtra(EXTRA_MESSAGE, et_name.text.toString())
                        intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                    }
                    startActivity(intent)
                    finish()


                }
            }


        }
    }
//}