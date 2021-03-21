package com.example.filmsly

object ActorsAndWhoTheyPlay {
    const val USER_NAME : String = "username"
    const val WRONG_ANSWERS : String = "wrongAnswers"
    fun getQuestions(): ArrayList<Question>{
    val questionsList = ArrayList<Question>()

    val question1 = Question( 1,
            "Who voices the character of Lightning McQueen in Cars?",
        R.drawable.popcorn,
            "Owen Wilson",
            "Brad Pitt",
            "Vince Vaughn",
            "Jim Carrey"
    )

    val question2 = Question(
            2,
            "The lead actor in Kindergarten Cop was played by whom?",
        R.drawable.popcorn,
            "Michael Cera",
            "Bradley Cooper",
            "David Schwimmer",
            "Arnold Schwarzenegger"
    )

    val question3 = Question(
            3,
            "Who voices Scar in the Lion King?",
        R.drawable.popcorn,
            "Jeremy Irons",
            "Paul Hogan",
            "Jared Leto",
            "Brad Pitt"
    )

        val question4 = Question(
                4,
                "Which famous Comedian played the character Truman in The Truman Show?",
                R.drawable.popcorn,
                "Will Ferrel",
                "Kevin Hart",
                "Jim Carrey",
                "Jack Black"
        )

        val question5 = Question(
                5,
                "Which character played the starring role in the 2017 film: I, Tonya?",
                R.drawable.popcorn,
                "Margot Robbie",
                "Brie Larson",
                "Emma Stone",
                "Mila Kunis"
        )

        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)


    return questionsList


}

}