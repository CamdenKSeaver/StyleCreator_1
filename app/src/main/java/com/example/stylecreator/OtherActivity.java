package com.example.stylecreator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_layout2);
    }

    TextView hello;
    TextView spanish;
    TextView french;
    TextView german;
    TextView polish;




        public void sayHello1(View view){
            hello = findViewById(R.id.a);
                    hello.setText("Hello");

        }
    public void sayHello2(View view){
        spanish = findViewById(R.id.b);
        spanish.setText("Hola");

    }
    public void sayHello3(View view){
        french = findViewById(R.id.c);
        french.setText("Bonjour");

    }
    public void sayHello4(View view){
        german = findViewById(R.id.d);
        german.setText("Hallo");

    }
    public void sayHello5(View view){
        polish = findViewById(R.id.e);
        polish.setText("Witam");

    }
}



