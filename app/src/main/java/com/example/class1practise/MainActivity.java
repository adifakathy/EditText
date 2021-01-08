package com.example.class1practise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText number1,number2;
    private Button addbutton,subbutton,multiplyButtion,divisionButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.number1Id);
        number2 = (EditText) findViewById(R.id.number2Id);
        addbutton = (Button) findViewById(R.id.addButtonId);
        subbutton =(Button) findViewById(R.id.subButtonId);
        multiplyButtion =(Button) findViewById(R.id.multiplyButtonId);
        divisionButton =(Button) findViewById(R.id.divisionButtonId);
        resultTextView = (TextView) findViewById(R.id.resultTextViewId);
         addbutton.setOnClickListener(this);
         subbutton.setOnClickListener(this);
         multiplyButtion.setOnClickListener(this);
        divisionButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        try {

        String firstnumber = number1.getText().toString();
        String secondnumber = number2.getText().toString();

        double num1 = Double.parseDouble(firstnumber);
        double num2 = Double.parseDouble(secondnumber);

        if (view.getId() == R.id.addButtonId) {
            double sum = num1 + num2;
            resultTextView.setText("Resut:" + sum);
        }

        if (view.getId() == R.id.subButtonId) {
            double sub = num1 - num2;
            resultTextView.setText("Resut:" + sub);
        }
            if (view.getId() == R.id.multiplyButtonId) {
                double multiply = num1 * num2;
                resultTextView.setText("Resut:" + multiply);
            }
            if (view.getId() == R.id.divisionButtonId) {
                double division = num1 / num2;
                resultTextView.setText("Resut:" + division);
            }

    }catch (Exception e){
            Toast.makeText(MainActivity.this,"Please Enter Number",Toast.LENGTH_SHORT).show();
        }




    }
}