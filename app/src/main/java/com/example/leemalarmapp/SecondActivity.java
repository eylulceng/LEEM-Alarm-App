package com.example.leemalarmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

   // Intent caller = new Intent();
    //float rating = caller.getFloatExtra("nbStars",0);
    Button answer1;
    Button answer2;
    Button answer3;
    TextView score, question;

    private Questions1 myQuestions = new Questions1();
    private Questions2 myQuestions2 = new Questions2();
    private Questions3 myQuestions3 = new Questions3();
    private Questions4 myQuestions4 = new Questions4();
    private Questions5 myQuestions5 = new Questions5();

    private String myAnswer;
    public int myScore = 0;

    private int myQuestionsLenght = 5;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        myScore = 0;
        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score: " +myScore);

        updateQuestion(r.nextInt(myQuestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer1.getText() == myAnswer){
                    myScore++;
                    score.setText("Score: "+ myScore);
                    updateQuestion(r.nextInt(myQuestionsLenght));
                }
                else {
                    gameOver();
                }
                if(myScore == 3){
                    WinGame();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer2.getText() == myAnswer){
                    myScore++;
                    score.setText("Score: "+ myScore);
                    updateQuestion(r.nextInt(myQuestionsLenght));
                }
                else {
                    gameOver();
                }
                if (myScore == 3){
                    WinGame();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer3.getText() == myAnswer){
                    myScore++;
                    score.setText("Score: "+ myScore);
                    updateQuestion(r.nextInt(myQuestionsLenght));
                }
                else{
                    gameOver();
                }
                if(myScore == 3) {
                    WinGame();
                }

            }
        });
    }
    private void updateQuestion(int num){
        Intent caller = getIntent();
        float rating = caller.getFloatExtra("nbStars",0f);
        if(rating == 1.0f) {
            question.setText(myQuestions.getQuestion(num));
            answer1.setText(myQuestions.getChoice1(num));
            answer2.setText(myQuestions.getChoice2(num));
            answer3.setText(myQuestions.getChoice3(num));

            myAnswer = myQuestions.getCorrectAnswer(num);
        }
        else if(rating == 2.0f){
            question.setText(myQuestions2.getQuestion(num));
            answer1.setText(myQuestions2.getChoice1(num));
            answer2.setText(myQuestions2.getChoice2(num));
            answer3.setText(myQuestions2.getChoice3(num));

            myAnswer = myQuestions2.getCorrectAnswer(num);
        }
        else if(rating == 3.0f) {

            question.setText(myQuestions3.getQuestion(num));
            answer1.setText(myQuestions3.getChoice1(num));
            answer2.setText(myQuestions3.getChoice2(num));
            answer3.setText(myQuestions3.getChoice3(num));

            myAnswer = myQuestions3.getCorrectAnswer(num);
        }
        else if(rating == 4.0f) {
            question.setText(myQuestions4.getQuestion(num));
            answer1.setText(myQuestions4.getChoice1(num));
            answer2.setText(myQuestions4.getChoice2(num));
            answer3.setText(myQuestions4.getChoice3(num));

            myAnswer = myQuestions4.getCorrectAnswer(num);
        }
        else if (rating == 5.0f){
            question.setText(myQuestions5.getQuestion(num));
            answer1.setText(myQuestions5.getChoice1(num));
            answer2.setText(myQuestions5.getChoice2(num));
            answer3.setText(myQuestions5.getChoice3(num));

            myAnswer = myQuestions5.getCorrectAnswer(num);
        }
    }
    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SecondActivity.this);
        alertDialogBuilder
                .setMessage("Opps! Your score is " +myScore)
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("CHANGE MY LEVEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    private void WinGame(){
        int sc = myScore;
        Intent goToThird = new Intent();
        goToThird.setClass(this, ThirdActivity.class);
        goToThird.putExtra("score",sc);
        startActivity(new Intent(getApplicationContext(),ThirdActivity.class));


    }
}