package com.example.android.baseballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*Declaring and initializing global variables. */
    int balls = 0;
    int strikes = 0;
    int outs = 0;
    int teamAScore = 0;
    int teamBScore = 0;
    int inning = 1;
    String inningString = "Inning: " + inning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Adds 1 run to Team A's score then displays total runs.
     */
    public void plusOneRunTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Subtracts 1 run from Team A's Score then displays total runs (for corrections).
     */
    public void minusOneRunTeamA(View view) {
        if (teamAScore > 0) {
            teamAScore = teamAScore - 1;
            displayForTeamA(teamAScore);
        }
    }

    /**
     * Adds 1 run to Team B's Score then displays total runs.
     */
    public void plusOneRunTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    /**
     * Subtracts 1 run from Team B's score then displays total runs (for corrections).
     */
    public void minusOneRunTeamB(View view) {
        if (teamBScore > 0) {
            teamBScore = teamBScore - 1;
            displayForTeamB(teamBScore);
        }
    }

    /**
     * Adds 1 to the number of balls then displays the number of balls.
     */
    public void ballsPlusOne(View view) {
        if (balls < 4) {
            balls = balls + 1;
            displayBalls(balls);
        }
    }

    /**
     * Subtracts one from the number of balls then displays the number of balls.
     */
    public void ballsMinusOne(View view) {
        if (balls > 0) {
            balls = balls - 1;
            displayBalls(balls);
        }
    }

    /**
     * Clears the number of strikes to zero then displays number of strikes.
     */
    public void ballsClear(View view) {
        balls = 0;
        displayBalls(balls);
    }

    /**
     * Adds 1 to number of strikes then displays number of strikes.
     */
    public void strikesPlusOne(View view) {
        if (strikes < 3) {
            strikes = strikes + 1;
            displayStrikes(strikes);
        }
    }

    /**
     * Subtracts one from tnumber of strikes then displays number of strikes.
     */
    public void strikesMinusOne(View view) {
        if (strikes > 0) {
            strikes = strikes - 1;
            displayStrikes(strikes);
        }
    }

    /**
     * Clears the number of strikes to zero then displays number of strikes.
     */
    public void strikesClear(View view) {
        strikes = 0;
        displayStrikes(strikes);
    }

    /**
     * Adds 1 to the number of outs then displays the number of outs.
     */
    public void outsPlusOne(View view) {
        if (outs < 3) {
            outs = outs + 1;
            displayOuts(outs);
        }
    }

    /**
     * Subtracts one from the number of outs then displays the number of outs.
     */
    public void outsMinusOne(View view) {
        if (outs > 0) {
            outs = outs - 1;
            displayOuts(outs);
        }
    }

    /**
     * Clears the number of outs to zero then displays the number of outs.
     */
    public void outsClear(View view) {
        outs = 0;
        displayOuts(outs);
    }


    /**
     * Adds 1 to inning then displays the current inning.
     */
    public void inningPlusOne(View view) {
        inning = inning + 1;
        inningString = "Inning: " + inning;
        displayInning(inningString);
    }

    /**
     * Subtracts one from inning then displays the current inning.
     */
    public void inningMinusOne(View view) {
        if (inning > 1) {
            inning = inning - 1;
            inningString = "Inning: " + inning;
            displayInning(inningString);
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of balls.
     */
    public void displayBalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.balls_count);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of strikes.
     */
    public void displayStrikes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.strikes_count);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of outs.
     */
    public void displayOuts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outs_count);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the current inning.
     */
    public void displayInning(String currentInning) {
        TextView scoreView = (TextView) findViewById(R.id.current_inning);
        scoreView.setText(String.valueOf(currentInning));
    }

    public void resetScores(View v) {
        teamAScore = 0;
        teamBScore = 0;
        balls = 0;
        strikes = 0;
        outs = 0;
        inning = 1;
        inningString = "Inning: 1";
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
        displayBalls(balls);
        displayStrikes(strikes);
        displayOuts(outs);
        displayInning(inningString);
    }
}
