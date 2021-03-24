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
import kotlinx.android.synthetic.main.activity_results_actors.btn_return
import kotlinx.android.synthetic.main.activity_results_actors_2.*

class ResultsActors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_actors)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get values
        val actorsCorrectAnswers = intent.getIntExtra(Constants.ACTORS_CORRECT_ANSWERS, 0)
        if (actorsCorrectAnswers <= 2){
            setContentView(R.layout.activity_results_actors)
            et_score1.text = "${actorsCorrectAnswers}/5"
        } else {
            setContentView(R.layout.activity_results_actors_2)
            et_score2.text = "${actorsCorrectAnswers}/5"
        }
        //get shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //store highest score in sharedPrefs
        var highScore = sharedPref.getInt(Constants.HIGH_SCORE_ACTORS, 0)
        if (actorsCorrectAnswers > highScore) {

            val editor = sharedPref.edit()

            editor.apply {
                putInt(Constants.HIGH_SCORE_ACTORS, actorsCorrectAnswers)
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