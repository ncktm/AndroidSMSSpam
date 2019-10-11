package com.technick.smtpsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText phoneNumInput;
    private EditText gatewayInput;
    private EditText attackNumInput;
    private Button buttonSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNumInput = (EditText) findViewById(R.id.phoneIn);
        gatewayInput = (EditText) findViewById(R.id.gatewayIn);
        attackNumInput = (EditText) findViewById(R.id.numOfAttack);


        buttonSend = (Button) findViewById(R.id.fireButton);
        //listener
        buttonSend.setOnClickListener(this);

        configureSettingsButton();

    }

    private void sendEmail() {
        //Getting content for email
      String email = phoneNumInput.getText().toString().trim() +"@"+gatewayInput.getText().toString().trim();
        //String email = "6122085289@txt.att.net";
        String subject = "automated message";
        String message = "sent from message cannon";

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
    }

    @Override
    public void onClick(View view) {

        int limit = Integer.parseInt(attackNumInput.getText().toString()); int holder = 0; int emailIndx = 0;
        for (int i = 0; i < limit; i++)
        {
            System.out.println("line 69");
            sendEmail();
            if(emailIndx <= 5) {
                SendMail.switchEmail(emailIndx++);
            }
            else {
                SendMail.switchEmail(1);
                emailIndx = 1;
            }

            }


        }


    private void configureSettingsButton(){
    Button settingsButton = (Button) findViewById(R.id.settingsButton);
    settingsButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, Settings.class));
            System.out.println("HERERERERERERERERERERE");
        }
    });
    }

}
