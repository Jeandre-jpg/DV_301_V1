package com.example.filmsly

object ActorsAndWhoTheyPlay {
    const val USER_NAME : String = "username"
    const val WRONG_ANSWERS : String = "wrongAnswers"
    fun getQuestions(): ArrayList<Question>{
    val questionsList = ArrayList<Question>()

    val question1 = Question( 1,
            "Who voices the character of Lightning McQueen in Cars?",
            R.drawable.ic_logo,
            "Owen Wilson",
            "Brad Pitt",
            "Vince Vaughn",
            "Jim Carrey"
    )

    val question2 = Question(
            2,
            "The lead actor in Kindergarten Cop was played by whom?",
            R.drawable.ic_logo,
            "Michael Cera",
            "Bradley Cooper",
            "David Schwimmer",
            "Arnold Schwarzenegger"
    )

    val question3 = Question(
            3,
            "Who voices Scar in the Lion King?",
            R.drawable.ic_logo,
            "Jeremy Irons",
            "Paul Hogan",
            "Jared Leto",
            "Brad Pitt"
    )

    questionsList.add(question1)
    questionsList.add(question2)
    questionsList.add(question3)

    return questionsList


}

}