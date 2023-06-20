package com.example.tarter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddQ {
    private List<QA> QAns;

    public AddQ() {
        QAns = new ArrayList<>();
        QAns.add(new QA("What is the highest mountain peak in the world?", "Mount Everest"));
        QAns.add(new QA("Which river is the longest in the world?", "The Nile"));
        QAns.add(new QA("What is the capital city of Australia?", "Canberra"));
        QAns.add(new QA("What is the largest desert in the world?", "The Sahara Desert"));
        QAns.add(new QA("What is the name of the largest ocean on Earth?", "The Pacific Ocean"));
        QAns.add(new QA("Which continent is the largest by land area?", "Asia"));
        QAns.add(new QA("What is the name of the largest lake in Africa?", "Lake Victoria"));
        QAns.add(new QA("What is the name of the river that runs through London?", "The River Thames"));
    }

    public QA[] getRandomQuestions(int count) {
        Random rand = new Random();
        List<QA> randomQuestions = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int randomIndex = rand.nextInt(QAns.size());
            randomQuestions.add(QAns.get(randomIndex));
            QAns.remove(randomIndex);
        }

        return randomQuestions.toArray(new QA[0]);
    }
}
