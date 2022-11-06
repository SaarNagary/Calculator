package com.example.myfirstprogramhit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    int number1;
    int number2;
    String command;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textViewResult);

    }


    public void buttonFunctionNumber(View view) {

        if(view instanceof Button)
        {
            Button b = (Button) view;
            String str = b.getText().toString();
            result.append(str);
        }
    }

    public void operatorFunction(View view){
        if(view instanceof Button)
        {
            String str1 = result.getText().toString();
            number1 = Integer.parseInt(str1);
            Button b = (Button) view;
            command = b.getText().toString();
            result.setText("");
            switch(str1)
            {

                case "+":
                    command = "+";
                    break;
                case "-":
                    command = "-";
                    break;
                case "*":
                    command = "*";
                    break;
                case "/":
                    command = "/";
                    break;

            }

        }
    }

                /*Button b = (Button) view;
                String str = b.getText().toString();
                result.append(str);
            if(str.equals("+") | str.equals("-") | str.equals("*") | str.equals("/"))
             {
                // number1 = Float.parseFloat(result.getText().toString());
             }*/




    public void comparsionFunction(View view) {

            if(view instanceof Button){
                int res = 0;
                String str2 = result.getText().toString();
                number2 = Integer.parseInt(str2);

                switch(command)
                {
                    case "+":
                        res = number1 + number2;
                        break;
                    case "-":
                        res = number1 - number2;
                        break;
                    case"/":
                        res = number1 / number2;
                        break;
                    case "*":
                        res = number1 * number2;
                }
                result.setText(String.valueOf(res));
            }
        /*Button b = (Button) view;
        String str = b.getText().toString();
        result.append(str);*/

        /* if(str.equals("="))
        {

            number2 = Float.parseFloat(result.getText().toString());
        }
        switch(command)
        {
            case "+":
                result.setText((number1+number2);;
                break;
            case "-":
                result.setText(number1-number2);
                break;
            case "*":
                result.setText(number1*number2);
                break;
            case "/":
                result.setText(number1/number2);
                break;
        }

         */



    }
}