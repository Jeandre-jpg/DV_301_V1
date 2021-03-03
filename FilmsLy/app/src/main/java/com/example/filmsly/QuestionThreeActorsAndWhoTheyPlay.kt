package com.example.filmsly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuestionThreeActorsAndWhoTheyPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three_actors_and_who_they_play)

        val questionsList = ActorsAndWhoTheyPlay.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")
    }
}