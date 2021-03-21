package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_two_directors_and_writers.*

class QuestionTwoDirectorsAndWriters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two_directors_and_writers)

        //Get Intent Extra information
        val userName = intent.getStringExtra(DirectorsAndWriters.USER_NAME)

        //get questions
        val questionsList = DirectorsAndWriters.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")

        //set question number and array

        val questionNumber: Int = 1
        val question: Question = questionsList[questionNumber - 1]

        //set Ui elements to question 1

        tv_question.text = question.question
        iv_icon.setImageResource(question.icon)
        rb_answer_one.text = question.optionOne
        rb_answer_two.text = question.optionTwo
        rb_answer_three.text = question.optionThree
        rb_answer_four.text = question.optionFour

        pb_progressBar.progress = questionNumber
        tv_progress.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a btn on click listener
        var answers: RadioButton
        var wrongAnswers: Int = 0
        btn_next.setOnClickListener{
            var id: Int = rg_options.checkedRadioButtonId
            if (id != -1){
                //Capture answer
                answers = findViewById(id)

                //Check if answer is yes
                if (answers.text == question.optionOne){
                    wrongAnswers++
                }
                //Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                //TODO: Navigation
                val intent = Intent(this, QuestionTwoDirectorsAndWriters2::class.java)
                intent.putExtra(FamousWords.USER_NAME, userName)
                intent.putExtra(FamousWords.WRONG_ANSWERS, wrongAnswers)
                startActivity(intent)
                finish()
            }else{
                //Give Validation
                Toast.makeText(this, "Please select your answer", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun Activity(intent: Intent) {


        val questionsList = DirectorsAndWriters.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")
    }
}