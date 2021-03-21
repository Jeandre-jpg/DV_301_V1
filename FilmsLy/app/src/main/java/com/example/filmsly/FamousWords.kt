package com.example.filmsly


object FamousWords {
    const val USER_NAME : String = "username"
    const val WRONG_ANSWERS : String = "wrongAnswers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()


        val question1 = Question( 1,
                "-You cant handle the truth- is a famous quote from which drama?",
           R.drawable.theater,
                "A few Good Men",//true
                "Men of Honour",
                "Play Misty for me",
                "Black Hawk Down"
        )

        val question2 = Question(
                2,
                "-There's a passage I got memorized. Ezekiel 25:17- is spoken by " +
                "Samuel L. Jackson in which film?",
            R.drawable.theater,
                "Pulp Fiction",//true
                "Reservoir Dogs",
                "Taxi Driver",
                "Casino"
        )

        val question3 = Question(
                3,
                "Which 2014 science-fiction film had the tag-line: -Live Die. Repeat?-",
            R.drawable.theater,
                "Dracula Untold",
                "Guardians of the Galaxy",
                "Interstellar",
                "Edge of Tomorrow"//true
        )

        val question4 = Question(
                4,
                "-Nobody puts Baby in a corner- is from what movie?",
                R.drawable.theater,
                "Flashdance",
                "Dirty Dancing",//true
                "Footloose",
                "Ghost"
        )

        val question5 = Question(
                5,
                "-Whoever said orange is the new pink was seriously disturbed.- is a quote from which iconic film?",
                R.drawable.theater,
                "The Princess Diaries",
                "Killers",
                "Legally Blonde",//true
                "The Social Network"
        )

        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)

        return questionsList


    }

}