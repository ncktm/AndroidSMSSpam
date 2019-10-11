package com.technick.smtpsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Settings extends AppCompatActivity {


    private EditText emailConfigIn;
    private EditText passwordConfigIn;
    private EditText slotConfigIn;
    //private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        configureBackButton();
        configureSubmitButton();

        emailConfigIn = (EditText) findViewById(R.id.emailConfig);
        passwordConfigIn = (EditText) findViewById(R.id.passwordConfig);
        slotConfigIn = (EditText) findViewById(R.id.slotConfig);
    }

    private void configureBackButton(){
        Button settingsButton = (Button) findViewById(R.id.backButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void configureSubmitButton()
    {
        Button submit = (Button) findViewById(R.id.submitConfig);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Config con = new Config();
            String inEmail = emailConfigIn.getText().toString();
            String inPassword = passwordConfigIn.getText().toString();
            int inSlot = Integer.parseInt(slotConfigIn.getText().toString());
            con.setEmail(inSlot, inEmail, inPassword);
            System.out.println(con.getEmails());
            }
        });
    }

}
