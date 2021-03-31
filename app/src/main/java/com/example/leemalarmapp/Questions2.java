package com.example.leemalarmapp;

public class Questions2 {


    public String myQuestions[] ={
            "What is the meaning of accept ?",
            "What is the meaning of decide ?",
            "What is the meaning of expensive ?",
            "What is the meaning of jump ?",
            "What is the meaning of safe ?",
    };
    private String myChoices[][] ={
            {"reddetmek","kabul etmek","itiraz etmek"},
            {"karar vermek", "onaylamak", "sinirlenmek"},
            {"kaliteli","ucuz","pahali"},
            {"kosmak","yurumek","ziplamak"},
            {"guvenli","tehlikeli","korkunc"}
    };
    private String correctAnswers[] = {"kabul etmek","karar vermek","pahali","ziplamak","guvenli"};
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
