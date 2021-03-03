package com.example.filmsly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.widget.TextView

class QuestionOneFamousWords : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one_famous_words)

                val questionsList = FamousWords.getQuestions()
                Log.i("QuestionsList ", "${questionsList.size}")
            }
        }