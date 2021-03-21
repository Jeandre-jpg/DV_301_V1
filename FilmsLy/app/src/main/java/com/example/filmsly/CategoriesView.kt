package com.example.filmsly

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_categories_view.*
import kotlinx.android.synthetic.main.activity_categories_view.btn_return


class CategoriesView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_view)


        famousCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionOneFamousWords::class.java))
        })

        dandwCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionTwoDirectorsAndWriters::class.java))
        })

        actorCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QuestionThreeActorsAndWhoTheyPlay::class.java))
        })
//go back home
        btn_return.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
    }
}

