package com.example.andrea.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreA, scoreB;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void scoreThree(View view){
        scoreA=scoreA+3;
        display(scoreA);
    }

    public void scoreTwo(View view){
        scoreA=scoreA+2;
        display(scoreA);
    }

    public void scoreFreeThrow(View view){
        scoreA=scoreA+1;
        display(scoreA);
    }

    public void scoreThreeB(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    public void scoreTwoB(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void scoreFreeThrowB(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    public void display (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }

    public void displayB (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
