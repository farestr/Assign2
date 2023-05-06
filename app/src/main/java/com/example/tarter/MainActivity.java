package com.example.tarter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.MotionEffect;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1 ;
    TextView tv2 ;
    TextView tv3 ;

    Spinner sp1;
    Spinner sp2;
    Spinner sp3;

    Button b;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QA[] QAARR;

        AddQ qa = new AddQ();

        QAARR = qa.GetAnswer();

        tv1 = findViewById(R.id.question1);
        tv2 = findViewById(R.id.question2);
        tv3 = findViewById(R.id.question3);

        sp1 = findViewById(R.id.answer1_spinner);
        sp2 = findViewById(R.id.answer2_spinner);
        sp3 = findViewById(R.id.answer3_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.number, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.number, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.number, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(adapter3);


        b = findViewById(R.id.answer1);
        b2 = findViewById(R.id.answer2);


        tv1.setText(QAARR[0].getQuestion());
        tv2.setText(QAARR[1].getQuestion());
        tv3.setText(QAARR[2].getQuestion());

        sp1.setPrompt(QAARR[0].getAns());
        sp2.setPrompt(QAARR[1].getAns());
        sp3.setPrompt(QAARR[2].getAns());

        b.setOnClickListener(e -> {

            String answer0 = sp1.getSelectedItem().toString();
            String answer1 = sp2.getSelectedItem().toString();
            String answer2 = sp3.getSelectedItem().toString();


            if ((answer0.equals(QAARR[0].getAns()) && answer1.equals(QAARR[1].getAns())) || (answer0.equals(QAARR[0].getAns()) && answer2.equals(QAARR[2].getAns())) || (answer1.equals(QAARR[1].getAns()) && answer2.equals(QAARR[2].getAns()))) {
                Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
            }

        });



        b2.setOnClickListener(e -> {

            AddQ qa1 = new AddQ();
            QA[] QAARR1;

            QAARR1 = qa1.GetAnswer();


            tv1.setText(QAARR1[0].getQuestion());
            tv2.setText(QAARR1[1].getQuestion());
            tv3.setText(QAARR1[2].getQuestion());

            sp1.setPrompt(QAARR1[0].getAns());
            sp2.setPrompt(QAARR1[1].getAns());
            sp3.setPrompt(QAARR1[2].getAns());



        });

      }
    }