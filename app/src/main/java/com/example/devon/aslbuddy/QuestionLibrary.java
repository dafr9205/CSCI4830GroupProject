package com.example.devon.aslbuddy;



public class QuestionLibrary {

    public static int[] images = new int [] {
            R.drawable.dquiz, R.drawable.aquiz, R.drawable.fquiz, R.drawable.rquiz,R.drawable.rquiz
    };

    public static String mQuestions [] = {
            "Is this the ASL hand symbol for B, C, or D?",
            "Is this the ASL hand symbol for A, B, or C?",
            "Is this the ASL hand symbol for D, E, or F?",
            "Is this the ASL hand symbol for Q, R, or S?",
            "extra question"
    };

    private String mChoices [] [] = {
            {"B","C","D"},
            {"A","B","C"},
            {"D","E","F"},
            {"Q","R","S"},
            {"_","_","_"},
    };

    private String mCorrectAnswers[] = {"D","A","F","R","_"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
