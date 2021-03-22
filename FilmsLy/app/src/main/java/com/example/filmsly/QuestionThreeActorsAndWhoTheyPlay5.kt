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

class QuestionThreeActorsAndWhoTheyPlay5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_three_actors_and_who_they_play_5)


        //get questions
        val questionsList = ActorsAndWhoTheyPlay.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")

        //set question number and array

        val currentPosition = 1
        val questionNumber: Int = 5
        val question: Question = questionsList[questionNumber - 1]

        //set Ui elements to question 1

        tv_question.text = question.question
        iv_icon.setImageResource(question.icon)
        rb_answer_one.text = question.optionOne
        rb_answer_two.text = question.optionTwo
        rb_answer_three.text = question.optionThree
        rb_answer_four.text = question.optionFour



//        pb_progressBar.progress = currentPosition
//        tv_progress.text = "$currentPosition" + "/" + pb_progressBar.max


        //set a btn on click listener
        var answers: RadioButton
        var wrongAnswers: Int = 0
        var correctAnswers: Int = 0
        btn_next.setOnClickListener {
            var id: Int = rg_options.checkedRadioButtonId
            if (id != -1) {
                //Capture answer
                answers = findViewById(id)




                if (answers.text == question.optionTwo) {
                    correctAnswers++
                    Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show()

                } else {
                    wrongAnswers++
                    Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show()
                }


                val intent = Intent(this, ResultsActors::class.java)
                intent.putExtra(Constants.ACTORS_WRONG_ANSWERS, wrongAnswers)
                intent.putExtra(Constants.ACTORS_CORRECT_ANSWERS, correctAnswers)
                startActivity(intent)
                finish()


            }
        }}


    private fun Activity(intent: Intent) {


        val questionsList = FamousWords.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")


    }
}


