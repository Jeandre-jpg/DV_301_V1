package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.filmsly.R.layout.activity_question_three_actors_and_who_they_play_3
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_3.*

class QuestionThreeActorsAndWhoTheyPlay3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_three_actors_and_who_they_play_3)


        btn_next.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionThreeActorsAndWhoTheyPlay4::class.java))
        })
    }
}