package com.example.simone.activity_save_pref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class start_activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity);
    }

    public void radio_1_click(View view)
    {
        RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton radio4 = (RadioButton)findViewById(R.id.radioButton4);
        radio2.setChecked(false);
        radio3.setChecked(false);
        radio4.setChecked(false);
    }

    public void radio_2_click(View view)
    {
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
        RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton radio4 = (RadioButton)findViewById(R.id.radioButton4);
        radio1.setChecked(false);
        radio3.setChecked(false);
        radio4.setChecked(false);
    }

    public void radio_3_click(View view)
    {
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
        RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton radio4 = (RadioButton)findViewById(R.id.radioButton4);
        radio1.setChecked(false);
        radio2.setChecked(false);
        radio4.setChecked(false);
    }

    public void radio_4_click(View view)
    {
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
        RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
        radio1.setChecked(false);
        radio2.setChecked(false);
        radio3.setChecked(false);
    }
}
