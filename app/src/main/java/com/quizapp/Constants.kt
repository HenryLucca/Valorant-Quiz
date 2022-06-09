package com.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Qual o nome desse jogo ?",
            R.drawable.questao1,
            "League of Legends",
            "Valorant",
            "Runeterra",
            "CS:GO",
            2
            )
        val que2 = Question(
            2,
            "Qual o nome desse agente ?",
            R.drawable.questao2,
            "Jett",
            "Phoenix",
            "Sage",
            "TL Beto",
            1
        )
        val que3 = Question(
            3,
            "Qual a empresa criadora do Valorant ?",
            R.drawable.questao3,
            "Valve",
            "Vandalismo Jogos",
            "Riot Games",
            "Lacrifilm",
            3
        )
        val que4 = Question(
            4,
            "Qual o nome deste mapa ?",
            R.drawable.questao4,
            "Split",
            "Bind",
            "Olinda",
            "Icebox",
            1
        )
        val que5 = Question(
            5,
            "Qual a nacionalidade deste agente ?",
            R.drawable.questao5,
            "Bélgica",
            "Uganda",
            "Brasil",
            "Japão",
            4
        )
        val que6 = Question(
            6,
            "(dificil) Qual agente é conhecido pelas explosões ?",
            R.drawable.questao6,
            "Yoru",
            "Jett",
            "Raze",
            "TL Beto",
            3
        )
        val que7 = Question(
            7,
            "(dificil) Qual o nome real do agente Breach ?",
            R.drawable.questao7,
            "Erik Torsten",
            "Joseph Climber",
            "Cristiano Ronaldo",
            "Vincent Fabron",
            1
        )
        val que8 = Question(
            8,
            "Qual o nome do maior tier de ranking do Valorant ?",
            R.drawable.questao8,
            "Ferro",
            "Desafiante",
            "Imortal",
            "Radiante",
            4
        )
        val que9 = Question(
            9,
            "Qual o nome da bomba do Valorant ?",
            R.drawable.questao9,
            "Bomba",
            "C4",
            "Fourtreer",
            "Spike",
            4
        )
        val que10 = Question(
            10,
            "Qual o material os atacantes do Valorant buscam ?",
            R.drawable.questao10,
            "RP",
            "Nicotina",
            "Radianita",
            "Tanzaninta",
            3
        )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }




}