package com.example.filmsly

object DirectorsAndWriters {
    const val USER_NAME : String = "username"
    const val WRONG_ANSWERS : String = "wrongAnswers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question( 1,
                "James Wan directed which of these films in 2013?",
            R.drawable.cinema,
                "Frozen",
                "World War Z",
                "Fast and Furious 6",
                "The Conjuring"//true
        )

        val question2 = Question(
                2,
                "The 2013 movie, The Great Gatsby, is based on a novel written by whom?",
           R.drawable.cinema,
                "Oscar Wilde",
                "F. Scott Fitzgerald",//true
                "James Joyce",
                "George R. R. Martin"
        )

        val question3 = Question(
                3,
                "Who is the author of the novel, Gone Girl, that was adapted into a movie in 2014?",
            R.drawable.cinema,
                "Jodi Picoult",
                "Stephanie Meyer",
                "Markus Zusak",
                "Gillian Flynn"//true
        )

        val question4 = Question(
                4,
                "Which director named his pets after characters from his films: Transformers and Armageddon?",
                R.drawable.cinema,
                "Brett Ratner",
                "Quentin Tarantino",
                "Wes Anderson",
                "Michael Bay" //true
        )

        val question5 = Question(
                5,
                "Robert Rodriguez was an uncredited director on which 1994 Quentin Tarantino film?",
                R.drawable.cinema,
                "Pulp Fiction",//true
                "Jackie Brown",
                "Kill Bill",
                "Hostel"
        )

        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)

        return questionsList


    }

}