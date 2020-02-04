package by.Katya.entity;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private double num1;
    private double num2;
    private String action;


    public Calculator(double num1, double num2, String action) {
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
    }

    public Calculator() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }


    public double sum() {
        double result = num1 + num2;
        return result;
    }

    public double sub() {
        double result = num1 - num2;
        return result;
    }

    public double div() {
        if (num2 != 0) {
            double result = num1 / num2;
        }
        return 0;
    }

    public double mult() {
        double result = num1 * num2;
        return result;
    }

}
