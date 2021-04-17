/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Madhu Babu Arla 
 */
public class Answer3 {
     public static void main(String[] args) {
        System.out.println("question number 3 by Madhu Babu Arla");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Loan());
        objects.add(new Date());
        objects.add("called from String class");
        objects.add(new Circle());
        for (Object o: objects){
            System.out.println(o.toString());
        }
    }
}

class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private final Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", loanAmount=" + loanAmount +
                ", loanDate=" + loanDate +
                '}';
    }
    
}
