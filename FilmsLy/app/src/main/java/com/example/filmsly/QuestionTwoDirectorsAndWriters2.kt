package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.filmsly.R.layout.activity_question_two_directors_and_writers_2
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.*

class QuestionTwoDirectorsAndWriters2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_two_directors_and_writers_2)


        btn_next.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionTwoDirectorsAndWriters3::class.java))
        })
    }
}
