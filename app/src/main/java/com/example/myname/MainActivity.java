package com.example.myname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editNameId);
        answer = (TextView) findViewById(R.id.answerNameId);

    }

    public void pressed(View view) {
        String n = name.getText().toString();
        String sentence = getString(R.string.sentence) + n + "!!";
        answer.setText(sentence);
    }
}