package com.example.simpleaddbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
                EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);
                TextView resultTextView = (TextView)findViewById(R.id.resultTextView);

                int number1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int number2 = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = number1 + number2;

                resultTextView.setText(result + "");
            }
        });
    }
}
