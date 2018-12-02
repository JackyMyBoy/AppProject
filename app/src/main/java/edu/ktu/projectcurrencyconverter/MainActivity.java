package edu.ktu.projectcurrencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Calculator(View view){
        Intent startSecondActivity = new Intent(this, SecondActivity.class);
        startActivity(startSecondActivity);
    }

    void convertUsdToEur()
    {
        EditText usd=(EditText) findViewById(R.id.usd_input);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText eur=(EditText) findViewById(R.id.eur_input);
        eur.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Integer.parseInt(usd.getText().toString());
        double result = a*0.88365;
        eur.setText(String.valueOf(result));
    }

    void convertEurToUsd()
    {
        EditText usd=(EditText) findViewById(R.id.usd_input);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText eur=(EditText) findViewById(R.id.eur_input);
        eur.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Integer.parseInt(eur.getText().toString());
        double result = a/0.88365;
        usd.setText(String.valueOf(result));
    }

    public void click_eur_usd(View view)
    {
        convertEurToUsd();
        Button button=(Button) findViewById(R.id.eur_to_usd);
        button.setEnabled(false);
    }

    public void click_clean(View view)
    {
        Button button1=(Button) findViewById(R.id.usd_to_eur);
        button1.setEnabled(true);
        Button button2=(Button) findViewById(R.id.eur_to_usd);
        button2.setEnabled(true);
        EditText usd=(EditText) findViewById(R.id.usd_input);
        EditText eur=(EditText) findViewById(R.id.eur_input);
        usd.setText("");
        eur.setText("");
    }

    public void click_usd_eur(View view)
    {
        convertUsdToEur();
        Button button=(Button) findViewById(R.id.usd_to_eur);
        button.setEnabled(false);
    }
}
