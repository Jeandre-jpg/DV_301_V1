package com.example.filmsly

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_results_actors.*
import kotlinx.android.synthetic.main.activity_results_directors_and_writers.*
import kotlinx.android.synthetic.main.activity_results_directors_and_writers.btn_return
import kotlinx.android.synthetic.main.activity_results_directors_and_writers_2.*

class ResultsDirectorsAndWriters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_directors_and_writers)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get values
        val directorsCorrectAnswers = intent.getIntExtra(Constants.DIRECTORS_CORRECT_ANSWERS, 0)

        if (directorsCorrectAnswers >= 2){
            setContentView(R.layout.activity_results_directors_and_writers)
            et_score1_.text = "${directorsCorrectAnswers}/5"
        } else {
            setContentView(R.layout.activity_results_directors_and_writers_2)
            et_score2_.text = "${directorsCorrectAnswers}/5"
        }
        //get shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //store highest score in sharedPrefs
        var highScore = sharedPref.getInt(Constants.HIGH_SCORE_DIRECTORS, 0)
        if (directorsCorrectAnswers > highScore) {

            val editor = sharedPref.edit()

            editor.apply {
                putInt(Constants.HIGH_SCORE_DIRECTORS, directorsCorrectAnswers)
                apply()
            }
        }

        //go back to categories
        btn_return.setOnClickListener{
            val intent = Intent(this, CategoriesView::class.java)
            startActivity(intent)
            finish()
        }
    }
}