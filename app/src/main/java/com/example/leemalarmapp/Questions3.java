package com.example.leemalarmapp;

public class Questions3 {


    public String myQuestions[] ={
            "What is the meaning of apologize ?",
            "What is the meaning of defend ?",
            "What is the meaning of strange ?",
            "What is the meaning of improve ?",
            "What is the meaning of recover ?",
    };
    private String myChoices[][] ={
            {"ozur dilemek","sinirlenmek","gormezden gelmek"},
            {"saldirmak", "savunmak", "teslim olmak"},
            {"samimi","kizgin","garip"},
            {"ara vermek","bozmak","gelistirmek"},
            {"hastalanmak","iyilesmek","bayilmak"}
    };
    private String correctAnswers[] = {"ozur dilemek","savunmak","garip","gelistirmek","iyilesmek"};
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
