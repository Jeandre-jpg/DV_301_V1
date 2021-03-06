package com.example.filmsly

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_categories_view.*
import kotlinx.android.synthetic.main.activity_categories_view.btn_return


class CategoriesView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_view)


        famousCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QOneFamousWords::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        })

        dandwCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QTwoDirectors::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        })

        actorCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, QThreeActors::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        })
//go back home
        btn_return.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            startActivity(intent)
            finish()
        }
        btn_score.setOnClickListener{
            val intent = Intent(this, Score::class.java)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            startActivity(intent)
            finish()
        }
    }


}


