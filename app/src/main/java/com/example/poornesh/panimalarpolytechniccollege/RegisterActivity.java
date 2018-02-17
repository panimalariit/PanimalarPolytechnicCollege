package com.example.poornesh.panimalarpolytechniccollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText uname;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        uname = (EditText) findViewById(R.id.editText1);
        pass = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.button1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validation())
                {

                }
            }
        });

    }

    private Boolean validation() {
        Boolean result = false;
        String name = uname.getText().toString().trim();
        String password = pass.getText().toString().trim();
        if (name.isEmpty() && password.isEmpty()) {
            Toast.makeText(this, "please enter all the details!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            result = true;
        }
      return result;
    }
}