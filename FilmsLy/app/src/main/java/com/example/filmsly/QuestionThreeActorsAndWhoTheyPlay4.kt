package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.filmsly.R.layout.activity_question_three_actors_and_who_they_play_4
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_4.*

class QuestionThreeActorsAndWhoTheyPlay4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_three_actors_and_who_they_play_4)


        btn_next.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionThreeActorsAndWhoTheyPlay5::class.java))
        })
    }
}