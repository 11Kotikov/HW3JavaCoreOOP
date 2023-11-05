package org.example;

public class Worker extends BaseWorker{
    double fixedMonthlySalary;
    public Worker(String name, double fixedMonthlySalary) {
        super(name);
        this.fixedMonthlySalary = fixedMonthlySalary;
        calculationOfTheAverageMonthlySalary();
    }

    @Override
    public void calculationOfTheAverageMonthlySalary() {
        setSalary(fixedMonthlySalary);
    }

    @Override
    public int compareTo(BaseWorker averageMonthlySalary) {
        return (int) (this.getSalary() - averageMonthlySalary.getSalary());
    }
}
