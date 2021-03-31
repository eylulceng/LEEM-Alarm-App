package com.example.leemalarmapp;

public class Questions5 {


    public String myQuestions[] ={
            "What is the meaning of ally ?",
            "What is the meaning of distinguish ?",
            "What is the meaning of encounter ?",
            "What is the meaning of gesture ?",
            "What is the meaning of occasion ?",
    };
    private String myChoices[][] ={
            {"dusman","rakip","muttefik"},
            {"ayirt etmek", "benzetmek", "kavramak"},
            {"saymak","karsilasmak","ayrilmak"},
            {"jest","kotuluk","hediye"},
            {"karsilasmak","firsat","yok saymak"}
    };
    private String correctAnswers[] = {"muttefik","ayirt etmek","karsilasmak","jest","firsat"};
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
