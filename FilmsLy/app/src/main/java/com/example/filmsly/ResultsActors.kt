package com.example.filmsly

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_results_actors.*

class ResultsActors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_actors)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val wordsWrongAnswers = intent.getIntExtra(Constants.ACTORS_WRONG_ANSWERS, 0)
        val wordsCorrectAnswers = intent.getIntExtra(Constants.ACTORS_CORRECT_ANSWERS, 0)

        //check which activity
        val score = findViewById<TextView>(R.id.et_score)
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)




//       score.text.set( "$wordsCorrectAnswers")



            val editor = sharedPref.edit()
            editor.putString(Constants.ACTORS_CORRECT_ANSWERS, score.text.toString())



        //make full screen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        //start edit
//        editor.apply {
//            putString(Constants.USER_NAME, userName)
//            putInt(Constants.ACTORS_WRONG_ANSWERS, wordsWrongAnswers)
//            putInt(Constants.ACTORS_CORRECT_ANSWERS, wordsCorrectAnswers)
//
//            apply()
//        }


        //go back home
        btn_return.setOnClickListener{
            val intent = Intent(this, CategoriesView::class.java)
            startActivity(intent)
            finish()
        }
    }
}
