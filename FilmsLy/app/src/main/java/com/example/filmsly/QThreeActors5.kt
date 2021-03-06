package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.filmsly.R.layout.activity_question_three_actors_and_who_they_play_5
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play.*
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_2.*
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.*
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.btn_next
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.iv_icon
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.pb_progressBar
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.rb_answer_four
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.rb_answer_one
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.rb_answer_three
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.rb_answer_two
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.rg_options
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.tv_progress
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_5.tv_question

class QThreeActors5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_three_actors_and_who_they_play_5)

        var actorsCorrectAnswers: Int = intent.getIntExtra(Constants.ACTORS_CORRECT_ANSWERS, 0)
        //get questions from constants
        val questionsList = Constants.getActors()

        //set question number and array
        val questionNumber: Int = 5
        val question = questionsList[questionNumber - 1]

        //set UI elements to question 1
        tv_question.text = question.question
        rb_answer_one.text = question.optionOne
        rb_answer_two.text = question.optionTwo
        rb_answer_three.text = question.optionThree
        rb_answer_four.text = question.optionFour

        pb_progressBar.progress = questionNumber
        tv_progress.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton


        btn_next.setOnClickListener{
            var id = rg_options.checkedRadioButtonId

            if(id != -1){
                //capture answer
                answers = findViewById(id)
                if (answers.text === question.optionTwo){
                    actorsCorrectAnswers++
                    Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show()
                }
                val intent = Intent(this, ResultsActors::class.java)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
                intent.putExtra(Constants.ACTORS_CORRECT_ANSWERS, actorsCorrectAnswers)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show()
            }
        }

    }
}



