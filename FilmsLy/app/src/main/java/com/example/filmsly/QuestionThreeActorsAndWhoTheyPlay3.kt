package com.example.filmsly

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_3.*

class QuestionThreeActorsAndWhoTheyPlay3 {
    class QuestionThreeActorsAndWhoTheyPlay3 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_question_three_actors_and_who_they_play_3)

            btn_next.setOnClickListener(View.OnClickListener {
                startActivity(Intent(this, Results::class.java))
            })
        }
    }
}