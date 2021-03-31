package com.example.leemalarmapp;

public class Questions4 {


    public String myQuestions[] ={
            "What is the meaning of convert ?",
            "What is the meaning of persuade ?",
            "What is the meaning of urgent ?",
            "What is the meaning of wealthy ?",
            "What is the meaning of substitude ?",
    };
    private String myChoices[][] ={
            {"donusturmek","onaylamak","takip etmek"},
            {"reddetmek", "ikna etmek", "farzetmek"},
            {"yavas","acil","seri"},
            {"fakir","bozmak","zengin"},
            {"yok etmek","yerine koymak","yok saymak"}
    };
    private String correctAnswers[] = {"donusturmek","ikna etmek","acil","zengin","yerine koymak"};
    public String getQuestion(int a){

        String question = myQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = myChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = myChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = myChoices[a][2];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = correctAnswers[a];
        return answer;
    }

}
