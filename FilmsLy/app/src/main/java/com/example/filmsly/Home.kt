package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_start

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        //Start button Click
        btn_start.setOnClickListener {

            //Check if name is empty
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your username", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,CategoriesView::class.java).apply {
                    // putExtra(EXTRA_MESSAGE, et_name.text.toString())
                    intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                }
                startActivity(intent)
                finish()
            }
        }


    }
}