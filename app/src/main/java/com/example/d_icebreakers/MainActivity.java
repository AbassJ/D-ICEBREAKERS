package com.example.d_icebreakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int scoreNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_button_click (View view)
    {
        int diceNum = randomNumGen();
        EditText userIn = this.findViewById(R.id.input);
        TextView output = this.findViewById(R.id.diceNum);
        TextView score = this.findViewById(R.id.Score);
        String UserInput = userIn.getText().toString();

        int guessNum = Integer.parseInt(UserInput);

        if (guessNum == diceNum)
        {
            scoreNum++;
            score.setText("Score: " + Integer.toString(scoreNum));
            output.setText(Integer.toString(diceNum) + " Correct guess! ");
        } else
        {
            score.setText("Score: " + Integer.toString(scoreNum));
            output.setText("    " + Integer.toString(diceNum) + " Wrong Guess!");
        }
    }

    public void on_button_click1(View view)
    {
        TextView output = this.findViewById(R.id.questions);
        int diceNum = randomNumGen();

        if (diceNum == 1)
        {
            output.setText("If you could go anywhere in the world where would you go?");
        }
        else if (diceNum == 2)
        {
            output.setText("if you were stranded on a desert island, what three things would you take with you?");
        }
        else if (diceNum == 3)
        {
            output.setText("if you could eat only one food for the rest of your life what would it be?");
        }
        else if (diceNum == 4)
        {
            output.setText("if you won 1 million dollars, what is the first thing you would buy?");
        }
        else if (diceNum == 5)
        {
            output.setText("if you could spend the day with one fictional character, who would it be?");
        }
        else if (diceNum == 6)
        {
            output.setText("if you found a magic lantern and a genie gave you three wishes, what would you wish?");
        }
    }

    public int randomNumGen()
    {
        Random ran = new Random();
        int diceNum = ran.nextInt(6 + 1 - 1) + 1;

        return diceNum;
    }

    public void on_button_click2(View view)
    {
        Intent tutorialPage = new Intent (this, tutorials.class);
        startActivity(tutorialPage);
    }
}