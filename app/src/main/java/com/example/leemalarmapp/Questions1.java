package com.example.leemalarmapp;

public class Questions1 {


    public String myQuestions[] ={
            "What is the meaning of bottle ?",
            "What is the meaning of pencilcase ?",
            "What is the meaning of careful ?",
            "What is the meaning of computer ?",
            "What is the meaning of school ?",
    };
    private String myChoices[][] ={
            {"Masa","Klavye","Sise"},
            {"Kalem", "Defter", "Kalemkutusu"},
            {"Eglenceli","Dikkatli","Mutsuz"},
            {"Telefon","Bilgisayar","Tablet"},
            {"Ev","Isyeri","Okul"}
    };
    private String correctAnswers[] = {"Sise","Kalemkutusu","Dikkatli","Bilgisayar","Okul"};
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
