package org.example;

public class Freelancer extends BaseWorker {
    private double hourlyPayment;

    @Override
    public void calculationOfTheAverageMonthlySalary() {
        double averageMonthlySalary = 20.8 * 8 * hourlyPayment;
        setSalary(averageMonthlySalary);
    }

    public Freelancer(String name, double hourlyPayment) {
        super(name);
        this.hourlyPayment = hourlyPayment;
        calculationOfTheAverageMonthlySalary();
    }

    @Override
    public int compareTo(BaseWorker averageMonthlySalary) {
        return (int) (getSalary() - averageMonthlySalary.getSalary());
    }
}
