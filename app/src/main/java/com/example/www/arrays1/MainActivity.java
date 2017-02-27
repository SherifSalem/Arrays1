package com.example.www.arrays1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    int total =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void process (String[] strings) {

    String[] input = new String[]{"44 55 66 64 54"};
        String[] vals = input.split(" ");
    int[] score = new int[vals.length];

    for (int i=0;i<score.length;i++){
        score[i] = Integer.parseInt(vals[i]);
        total += score[i];
    }
double avaerage = (double) total/score.length;
    System.out.println("The average was "+ avaerage);


    for (i=0;i<score.length;i++){
        if (score[i]<avaerage){
            System.out.println("The score of "+score[i]+ "was below the average");
        }
    }

        }
    }


