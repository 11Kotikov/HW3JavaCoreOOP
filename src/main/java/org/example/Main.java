package org.example;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        List<BaseWorker> workers = new ArrayList<>();
        workers.add(new Worker("Albert Einstein", 10000));
        workers.add(new Freelancer("Max Planck", 50));
        workers.add(new Worker("Marie Curie", 10000));
        workers.add(new Freelancer("Niels Bohr", 60));
        workers.add(new Worker("Isaac Newton", 10000));
        workers.add(new Freelancer("Alexander Lodygin", 70));

        Collections.sort(workers); //сортировка зп от меньшей к большей

        MyDreamedWorkersList myDreamedWorkers = new MyDreamedWorkersList(workers);

        for (BaseWorker worker : myDreamedWorkers) {
            System.out.println("Name: " + worker.getName() + ", Salary: " + worker.getSalary());
        }

    }
}