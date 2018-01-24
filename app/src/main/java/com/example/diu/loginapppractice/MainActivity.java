package com.example.diu.loginapppractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button button;
    private static User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.login);
        loginOnClickListner();
    }

    //login onClickListnerMethod
    public void loginOnClickListner(){

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String username1=username.getText().toString();
                        String password1=password.getText().toString();
                        user=new User(username1,password1);


                        if(user.verifyLogin()){
                            Toast.makeText(MainActivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(".ProfileActivity");
                            startActivity(intent);


                        }
                        else {
                            Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
