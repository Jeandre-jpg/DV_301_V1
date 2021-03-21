package com.example.filmsly

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_results_directors_and_writers.*

class ResultsDirectorsAndWriters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_directors_and_writers)


        val userName = intent.getStringExtra(Constants.USER_NAME)
        val wrongAnswers = intent.getIntExtra(Constants.DIRECTORS_WRONG_ANSWERS, 0)

        //check which activity
//        if(wrongAnswers > 0) {
//            //display the flagged layout
//            setContentView(R.layout.activity_flag_result)
//        } else {
//            //pass layout
//            setContentView(R.layout.activity_result)
//        }

        //make full screen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //share preference init
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        //start edit
        editor.apply {
            putString(Constants.USER_NAME, userName)
            putInt(Constants.DIRECTORS_WRONG_ANSWERS, wrongAnswers)

            apply()
        }


        //go back home
        btn_return.setOnClickListener{
            val intent = Intent(this, CategoriesView::class.java)
            startActivity(intent)
            finish()
        }
    }
}
