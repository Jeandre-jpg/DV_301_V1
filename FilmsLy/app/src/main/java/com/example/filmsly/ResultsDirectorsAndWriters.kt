package com.example.filmsly

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_results_bad.*
import kotlinx.android.synthetic.main.activity_results_bad.btn_return
import kotlinx.android.synthetic.main.activity_results_good.*

class ResultsDirectorsAndWriters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_good)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get values
        val directorsCorrectAnswers = intent.getIntExtra(Constants.DIRECTORS_CORRECT_ANSWERS, 0)
        if (directorsCorrectAnswers <= 2){
            setContentView(R.layout.activity_results_bad)
            et_score1.text = "${directorsCorrectAnswers}/5"
        } else {
            setContentView(R.layout.activity_results_good)
            et_score2.text = "${directorsCorrectAnswers}/5"
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