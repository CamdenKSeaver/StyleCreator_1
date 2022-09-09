package com.example.stylecreator;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

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
     text = findViewById(R.id.namet);
       name = findViewById(R.id.answer);
        int count = count(text.getText().toString());
        name.setText("Your Name, " + text.getText().toString() + ", has " + count + " Letters");

        //name.setText("camden");


}

public String backwards(String str){
        String a ="";
        for(int i = str.length()-1;i>-1;i--){
            a += str.substring(i,i+1);
        }
        return a;
}

public void NameBackwards(View view){
    text = findViewById(R.id.namet);
    name = findViewById(R.id.answer);

    name.setText("Your Name, " + text.getText().toString() + ", backwards is " + backwards(text.getText().toString()).toLowerCase(Locale.ROOT) );
}
}