package com.example.filmsly

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.*

class QuestionTwoDirectorsAndWriters2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two_directors_and_writers_2)


        btn_next.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionTwoDirectorsAndWriters3::class.java))
        })
    }
}