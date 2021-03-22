package com.example.filmsly


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.filmsly.R.layout.activity_question_one_famous_words_2
import kotlinx.android.synthetic.main.activity_question_one_famous_words.*
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.*
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.btn_next
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.iv_icon
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.pb_progressBar
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.rb_answer_four
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.rb_answer_one
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.rb_answer_three
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.rb_answer_two
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.rg_options
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.tv_progress
import kotlinx.android.synthetic.main.activity_question_one_famous_words_2.tv_question

class QuestionOneFamousWords2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_question_one_famous_words_2)

        //get questions
        val questionsList = FamousWords.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")

        //set question number and array

        val currentPosition = 1
        val questionNumber: Int = 2
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




                if (answers.text == question.optionOne) {
                    correctAnswers++
                    Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show()

                } else {
                    wrongAnswers++
                    Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show()
                }


                val intent = Intent(this, QuestionOneFamousWords3::class.java)
                intent.putExtra(Constants.WORDS_WRONG_ANSWERS, wrongAnswers)
                intent.putExtra(Constants.WORDS_CORRECT_ANSWERS, correctAnswers)
                startActivity(intent)
                finish()


            }
        }}


    private fun Activity(intent: Intent) {


        val questionsList = FamousWords.getQuestions()
        Log.i("QuestionsList ", "${questionsList.size}")


    }
}


