package com.example.filmsly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuestionTwoDirectorsAndWriters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two_directors_and_actors_who_they_play)

        val questionsList = DirectorsAndWriters.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")
    }
}