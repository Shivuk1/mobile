package com.example.week1ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button  button1 = findViewById(R.id.button);
        /*TextView tx1 = findViewById(R.id.textView2);
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           tx1.setText("New Value");
                                       }
                                   }
        );*/

    }
    public void disable(View v){
        //v.setEnabled(false);
        //TextView tx1 = findViewById(R.id.textView2);
        //tx1.setText("Hi I am new");
        Toast.makeText(getApplicationContext(),"Nesara Kashyap," +
                " email:NesaraK@gmail.com",Toast.LENGTH_SHORT).show();
    }
}