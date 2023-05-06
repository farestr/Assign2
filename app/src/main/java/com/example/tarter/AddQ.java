package com.example.tarter;

import java.util.ArrayList;
import java.util.Random;

public class AddQ {
    ArrayList<QA> QAns=new ArrayList<>();
    public AddQ() {
        QAns.add(new QA("What is the highest mountain peak in the world?","Mount Everest"));
        QAns.add(new QA("Which river is the longest in the world?","The Nile"));
        QAns.add(new QA("What is the capital city of Australia?","Canberra"));
        QAns.add(new QA("What is the largest desert in the world?","The Sahara Desert"));
        QAns.add(new QA("What is the name of the largest ocean on Earth?","The Pacific Ocean"));
        QAns.add(new QA("Which continent is the largest by land area?","Asia"));
        QAns.add(new QA("What is the name of the largest lake in Africa?","Lake Victoria"));
        QAns.add(new QA("What is the name of the river that runs through London?","The River Thames"));
    }

    public int[] random3(){
        int[] random3=new int[3];
        Random rand = new Random();
        int randomNum = rand.nextInt(8);
        random3[0]=randomNum;
        int randomNum2 = rand.nextInt(8);
        while(randomNum2==randomNum){
            randomNum2 = rand.nextInt(8);
        }
        random3[1]=randomNum2;
        int randomNum3 = rand.nextInt(8);
        while(randomNum3==randomNum||randomNum3==randomNum2){
            randomNum3 = rand.nextInt(8);
        }
        random3[2]=randomNum3;
        return random3;
    }

    public QA[] GetAnswer(){
        int[] random3=random3();
        QA[] QAARR=new QA[3];
        QAARR[0]=QAns.get(random3[0]);
        QAARR[1]=QAns.get(random3[1]);
        QAARR[2]=QAns.get(random3[2]);

        return QAARR;
    }

}
