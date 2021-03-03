package com.example.filmsly


object FamousWords {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question( 1,
                "- You cant handle the truth - is a famous quote from which drama?",
                R.drawable.ic_logo,
                "A few Good Men",
                "Men of Honour",
                "Play Misty for me",
                "Black Hawk Down"
        )

        val question2 = Question(
                2,
                "- There's a passage I got memorized. Ezekiel 25:17 - is spoken by " +
                "Samuel L. Jackson in which film?",
                R.drawable.ic_logo,
                "Pulp Fiction",
                "Reservoir Dogs",
                "Taxi Driver",
                "Casino"
        )

        val question3 = Question(
                3,
                "Which 2014 science-fiction film had the tag-line: Live Die. Repeat?",
                R.drawable.ic_logo,
                "Dracula Untold",
                "Guardians of the Galaxy",
                "Interstellar",
                "Edge of Tomorrow"
        )

        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)

        return questionsList


    }

}