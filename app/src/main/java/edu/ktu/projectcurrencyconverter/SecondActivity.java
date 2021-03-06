package edu.ktu.projectcurrencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView result;
    private EditText number1, number2;
    private Button add,subtract,divide,multiply;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivitydesign);
        result = (TextView) findViewById(R.id.result);
        number1 = (EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        add = (Button) findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        divide=(Button) findViewById(R.id.divide);
        multiply=(Button)findViewById(R.id.multiply);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1-num2;
                result.setText(String.valueOf(result_num));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1/num2;
                result.setText(String.valueOf(result_num));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1*num2;
                result.setText(String.valueOf(result_num));
            }
        });
    }
}
