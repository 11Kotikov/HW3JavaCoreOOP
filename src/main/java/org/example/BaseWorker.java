package org.example;

public abstract class BaseWorker implements Comparable <BaseWorker> {
     private String name;
     private double salary;

     public BaseWorker (String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }

     public double getSalary() {
          return salary;
     }
     public void setSalary(double salary) {
          this.salary = salary;
     }

     public abstract void calculationOfTheAverageMonthlySalary();

}
