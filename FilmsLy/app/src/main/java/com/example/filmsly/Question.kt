package com.example.filmsly

data class Question (
        val id: Int,
        val question: String,
        val icon: Int,
        val optionOne: String,
        val optionTwo: String,
        val optionThree: String,
        val optionFour: String
)
