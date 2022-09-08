package com.example.stylecreator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText text;
    TextView name;

    public int count(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i,i+1).equals(" ")){

            }
                else
                    count++;

        }
        return count;
    }
    public void countLetters(View view){
     //text = findViewById(R.id.namet);
       name = findViewById(R.id.answer);
       // int count = count((String) text.getText());
      //  name.setText("Your Name, " + text.getText() + " has " + count + " Letters");

        name.setText("camden");

    }
}