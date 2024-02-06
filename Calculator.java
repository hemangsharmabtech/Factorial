package assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

class Calculator {
    private ArrayList<Double> numbers;

    public Calculator() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(double number) {
        numbers.add(number);
    }

    public double add() {
        return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double subtract() {
        return numbers.stream().reduce((a, b) -> a - b).orElse(0.0);
    }

    public double multiply() {
        return numbers.stream().reduce(1.0, (a, b) -> a * b);
    }

    public double divide() {
        return numbers.stream().reduce((a, b) -> a / b).orElse(0.0);
    }

    public double squareRoot() {
        return Math.sqrt(numbers.get(0));
    }

    public double power() {
        return Math.pow(numbers.get(0), numbers.get(1));
    }

    public double mean() {
        double sum = add();
        return sum / numbers.size();
    }

    public double variance() {
        double mean = mean();
        double sumSquaredDifferences = numbers.stream().mapToDouble(num -> Math.pow(num - mean, 2)).sum();
        return sumSquaredDifferences / numbers.size();
    }
}


