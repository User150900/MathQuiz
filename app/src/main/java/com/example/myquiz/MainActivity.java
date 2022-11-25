package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView problem;
    TextView text1;
    TextView text2;
    TextView text3;
    MathGenerator mathGenerator = new MathGenerator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        MathGenerator mathGenerator = new MathGenerator();
        String s = mathGenerator.getProblem();
        problem.setText(mathGenerator.getProblem());
        problem.setText(s);


    }

    private void setupUI() {
        problem = findViewById(R.id.problem);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);

    }

    private int getRandom(int max, int min) {
        int random = (int) (Math.random() * (max - min) + min);
        Log.d("DEBUGGER_TAG", "max: " + max + " min: " + min + " ramdom: " + random);
        return random;
    }

    private void generateAnswers() {
        int position = mathGenerator.getRandom(4, 1);
        if (position == 1) {
            text1.setText(mathGenerator.getResult());
            text2.setText(mathGenerator.getNoiseResult());
            text3.setText(mathGenerator.getNoiseResult());
        }
        else if (position == 2){
            text1.setText(mathGenerator.getNoiseResult());
            text2.setText(mathGenerator.getResult());
            text3.setText(mathGenerator.getNoiseResult());
        }
        else if (position == 4){
            text1.setText(mathGenerator.getNoiseResult());
            text2.setText(mathGenerator.getNoiseResult());
            text3.setText(mathGenerator.getResult());
        }
    }
}