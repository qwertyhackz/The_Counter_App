package com.example.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView counter_text,welcome_text;
 Button btn, btn2;
 int counter=0;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  btn=findViewById(R.id.btn);
  btn2=findViewById(R.id.btn2);
  counter_text = findViewById(R.id.counter_text);
welcome_text= findViewById(R.id.welcome_text);


// Adding the functions

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
counter_text.setText(" "+increaseCounter());
    }
}

);
  btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          counter_text.setText(" "+decreaseCounter());
      }
  });



 }
  public int increaseCounter(){
        return ++counter;

    }

    public int decreaseCounter(){
        return --counter;

}}







