package com.example.filmsly

object DirectorsAndWriters {
    const val USER_NAME : String = "username"
    const val WRONG_ANSWERS : String = "wrongAnswers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question( 1,
                "James Wan directed which of these films in 2013?",
                R.drawable.ic_logo,
                "Frozen",
                "World War Z",
                "Fast and Furious 6",
                "The Conjuring"
        )

        val question2 = Question(
                2,
                "The 2013 movie, The Great Gatsby, is based on a novel written by whom?",
                R.drawable.ic_logo,
                "Oscar Wilde",
                "F. Scott Fitzgerald",
                "James Joyce",
                "George R. R. Martin"
        )

        val question3 = Question(
                3,
                "Who is the author of the novel, Gone Girl, that was adapted into a movie in 2014?",
                R.drawable.ic_logo,
                "Jodi Picoult",
                "Stephanie Meyer",
                "Markus Zusak",
                "Gillian Flynn"
        )

        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)

        return questionsList


    }

}