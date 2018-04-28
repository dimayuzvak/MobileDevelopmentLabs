package com.example.dmitr.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

//Вікно містить два тестові поля, групу опцій (вибір операції) та кнопку «ОК».
//Вивести результат обчислення обраної операції над введеними даними

public class InputActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    EditText num1;
    EditText num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.text_view_selected);

        Button buttonApply = findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = findViewById(R.id.edit_text_number1);
                num2 = findViewById(R.id.edit_text_number2);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                Float f1 = Float.parseFloat(num1.getText().toString());
                Float f2 = Float.parseFloat(num2.getText().toString());


                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                //textView.setText("Your choice: " + radioButton.getText());
                String btn = radioButton.getText().toString();
                if(btn.equals("Add"))
                    textView.setText(String.valueOf(n1+n2));
                if(btn.equals("Subtract"))
                    textView.setText(String.valueOf(n1-n2));
                if(btn.equals("Multiply"))
                    textView.setText(String.valueOf(n1*n2));
                if(btn.equals("Divide"))
                    textView.setText(String.valueOf(f1/f2));

            }
        });
    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),
                Toast.LENGTH_SHORT).show();
    }
}