package com.example.filmsly

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_categories_view.*
import kotlinx.android.synthetic.main.activity_main.*

class CategoriesView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_view)



        btn_start_cat.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@CategoriesView, QuestionOneFamousWords::class.java))
        })

    }
}