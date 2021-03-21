package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.filmsly.R.layout.activity_question_two_directors_and_writers_4
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers.*
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.*
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.btn_next
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.iv_icon
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.pb_progressBar
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.rb_answer_four
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.rb_answer_one
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.rb_answer_three
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.rb_answer_two
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.rg_options
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.tv_progress
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers_4.tv_question

class QuestionTwoDirectorsAndWriters4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_two_directors_and_writers_4)

        //get questions
        val questionsList = DirectorsAndWriters.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")


        //set question number and array

        val currentPosition = 1
        val questionNumber: Int = 4
        val question: Question = questionsList[questionNumber - 1]

        //set Ui elements to question 1

        tv_question.text = question.question
        iv_icon.setImageResource(question.icon)
        rb_answer_one.text = question.optionOne
        rb_answer_two.text = question.optionTwo
        rb_answer_three.text = question.optionThree
        rb_answer_four.text = question.optionFour



        pb_progressBar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + pb_progressBar.max


        //set a btn on click listener
        var answers: RadioButton
        var wrongAnswers: Int = 0
        var correctAnswers: Int = 0
        btn_next.setOnClickListener {
            var id: Int = rg_options.checkedRadioButtonId
            if (id != -1) {
                //Capture answer
                answers = findViewById(id)



                if (answers.text == question.optionFour) {
                    correctAnswers++
                    Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show()

                } else {
                    wrongAnswers++
                    Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show()
                }


                val intent = Intent(this, QuestionTwoDirectorsAndWriters5::class.java)
                intent.putExtra(Constants.DIRECTORS_WRONG_ANSWERS, wrongAnswers)
                intent.putExtra(Constants.DIRECTORS_CORRECT_ANSWERS, correctAnswers)
                startActivity(intent)
                finish()


            }
        }}


    private fun Activity(intent: Intent) {


        val questionsList = DirectorsAndWriters.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")
    }
}

