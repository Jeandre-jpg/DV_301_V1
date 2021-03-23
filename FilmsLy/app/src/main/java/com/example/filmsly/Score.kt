package com.example.filmsly

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_results_directors_and_writers.*

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        //declare animation
        val wordsCorrectAnswers = sharedPref.getInt(Constants.HIGH_SCORE_WORDS, 0)
        val actorsCorrectAnswers = sharedPref.getInt(Constants.HIGH_SCORE_ACTORS, 0)
        val directorsCorrectAnswers = sharedPref.getInt(Constants.HIGH_SCORE_DIRECTORS, 0)

        val words_high = findViewById<TextView>(R.id.words_high)
        val actors_high = findViewById<TextView>(R.id.actors_high)
        val directors_high = findViewById<TextView>(R.id.directors_high)


        words_high.text = "$wordsCorrectAnswers"
        actors_high.text = "$actorsCorrectAnswers"
        directors_high.text = "$directorsCorrectAnswers"


        btn_return.setOnClickListener{
            val intent = Intent(this, CategoriesView::class.java)
            startActivity(intent)
            finish()
        }
    }
}