package com.example.filmsly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_one_famous_words.*

class QuestionOneFamousWords : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one_famous_words)




                //Get Intent Extra information
                val userName = intent.getStringExtra(FamousWords.USER_NAME)

                //get questions
                val questionsList = FamousWords.getQuestions()
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

                        if(answers.text == question.optionOne){
                            wrongAnswers++
                        }
                        //Navigation
                        val intent = Intent(this, QuestionOneFamousWords2::class.java)
                        intent.putExtra(Constants.USER_NAME, userName)
                        intent.putExtra(Constants.WRONG_ANSWERS, wrongAnswers)
                        startActivity(intent)
                        finish()


                    }else{
                        //Give Validation
                        Toast.makeText(this, "Please select your answer", Toast.LENGTH_SHORT).show()
                    }
                }
            }



            private fun Activity(intent: Intent) {


                val questionsList = FamousWords.getQuestions()
                Log.i("QuestionsList ", "${questionsList.size}")
            }
        }
