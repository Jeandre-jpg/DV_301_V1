package com.example.filmsly

object Constants {
    const val USER_NAME: String = "userName"
    const val WORDS_CORRECT_ANSWERS: String = "wordsCorrectAnswers"
    const val HIGH_SCORE_WORDS: String = "highScoreWords"
    const val ACTORS_CORRECT_ANSWERS: String = "actorsCorrectAnswers"
    const val HIGH_SCORE_ACTORS: String = "highScoreActors"
    const val DIRECTORS_CORRECT_ANSWERS: String = "directorsCorrectAnswers"
    const val HIGH_SCORE_DIRECTORS: String = "highScoreDirectors"

    fun getFamousWords(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        val question1 = Question(1,
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

    fun getDirectorsWriters(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(1,
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

    fun getActors(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question( 1,
                "Who voices the character of Lightning McQueen in Cars?",
                R.drawable.popcorn,
                "Owen Wilson",//true
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
                "Arnold Schwarzenegger"//true
        )

        val question3 = Question(
                3,
                "Who voices Scar in the Lion King?",
                R.drawable.popcorn,
                "Jeremy Irons",//true
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
                "Jim Carrey",//true
                "Jack Black"
        )

        val question5 = Question(
                5,
                "Which character played the starring role in the 2017 film: I, Tonya?",
                R.drawable.popcorn,
                "Brie Larson",
                "Margot Robbie",//true
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
