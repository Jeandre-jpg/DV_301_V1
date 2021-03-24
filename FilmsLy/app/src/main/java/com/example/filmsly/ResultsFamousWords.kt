package com.example.filmsly

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_results_famous_words.*
import kotlinx.android.synthetic.main.activity_results_famous_words.btn_return
import kotlinx.android.synthetic.main.activity_results_famous_words_2.*

class ResultsFamousWords : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_famous_words)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get values
        val wordsCorrectAnswers = intent.getIntExtra(Constants.WORDS_CORRECT_ANSWERS, 0)

        if (wordsCorrectAnswers <= 2){
            setContentView(R.layout.activity_results_famous_words)
            et_score_1.text = "${wordsCorrectAnswers}/5"
        } else {
            setContentView(R.layout.activity_results_famous_words_2)
            et_score2.text = "${wordsCorrectAnswers}/5"
        }

        //get shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //store highest score in sharedPrefs
        var highScore = sharedPref.getInt(Constants.HIGH_SCORE_WORDS, 0)
        if (wordsCorrectAnswers > highScore) {

            val editor = sharedPref.edit()

            editor.apply {
                putInt(Constants.HIGH_SCORE_WORDS, wordsCorrectAnswers)
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

