package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.filmsly.R.layout.activity_question_two_directors_and_writers_2
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play.*
import kotlinx.android.synthetic.main.activity_question_three_actors_and_who_they_play_2.*
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers.*
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers.pb_progressBar
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers.tv_progress
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.btn_next
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.iv_icon
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.rb_answer_four
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.rb_answer_one
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.rb_answer_three
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.rb_answer_two
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.rg_options
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_2.tv_question

class QTwoDirectors2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_two_directors_and_writers_2)

        var directorsCorrectAnswers: Int = intent.getIntExtra(Constants.DIRECTORS_CORRECT_ANSWERS, 0)

        //get questions from constants
        val questionsList = Constants.getDirectorsWriters()

        //set question number and array
        val questionNumber: Int = 2
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
                    directorsCorrectAnswers++
                    Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show()
                }
                val intent = Intent(this, QTwoDirectors3::class.java)
                intent.putExtra(Constants.DIRECTORS_CORRECT_ANSWERS, directorsCorrectAnswers)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show()
            }
        }

    }
}

