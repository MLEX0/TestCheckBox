package com.example.testCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class OneQuestion extends AppCompatActivity {

    CheckBox cbAns1;
    CheckBox cbAns2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_question);

        cbAns1 = findViewById(R.id.checkAnswerOne);
        cbAns2 = findViewById(R.id.checkAnswerTwo);

        // По сути, делаем из CheckBox RadioButton
        cbAns1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean cbAns1isChecked) {
                if(cbAns1isChecked)
                {
                    cbAns2.setChecked(false);
                }
            }
        });

        cbAns2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean cbAns2IsChecked) {
                if(cbAns2IsChecked)
                {
                    cbAns1.setChecked(false);
                }
            }
        });
    }


    public void answer1OnClick(View view) {

        //Проверяем ответ, который выбрал пользователь
        if(cbAns1.isChecked())
        {
            // Сохраняем ответ в статическую переменную другого класса
            AnswersData.setAnsw1(0);

        }
        else if(cbAns2.isChecked())
        {
            AnswersData.setAnsw1(1);
        }

        //Переходим на другое окно с дальнейшем закрытием
        Intent TwoQuestionIntent = new Intent(OneQuestion.this, TwoQuestion.class);
        startActivity(TwoQuestionIntent);
        finish();
    }

}
