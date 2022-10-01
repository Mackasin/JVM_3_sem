package com.nki.dzhurynskyi.laboratorywork.lb2;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();
    }

    public double tabulation(double x, double a) {
        double eps = 0.0001;
        if (x > a + eps) {
            return x * sqrt(x - a);
        }
        if (x == a) {
            return x * sin(a * x);
        } else {
            return exp(-a * x) * cos(a * x);
        }
    }

    public int calculateSteps(double x1, int x2, double step) {
        return (int) ((x2 - x1) / step) + 1;
    }

    public double[] xValuesArrayCreate(double x1, int x2, double step) {
        return new double[calculateSteps(x1, x2, step)];
    }

    public double[] yValuesArrayFill(double[] xValues, double a) {
        double[] yValues = new double[xValues.length];
        for (int i = 0; i < yValues.length; i++) {
            yValues[i] = tabulation(xValues[i], a);
        }
        return yValues;
    }

    public double[] xValuesArrayFill(double x1, int x2, double step) {
        double[] xValues = xValuesArrayCreate(x1, x2, step);
        for (int i = 0; i < xValues.length; i++) {

            xValues[i] = x1 + i * step;
        }
        return xValues;
    }

    public int getMinIndex(double[] yValues) {
        int minIndex = 0;
        for (int i = 0; i < yValues.length; i++) {
            if (yValues[i] < yValues[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public double getMinElement(double[] yValues) {
        int minNumber = getMinIndex(yValues);
        return yValues[minNumber];
    }

    public double getMinElementArgument(double[] yValues, double[] xValues) {
        int minNumber = getMinIndex(yValues);
        return xValues[minNumber];
    }

    public int getMaxIndex(double[] yValues) {
        int maxIndex = 0;
        for (int i = 0; i < yValues.length; i++) {
            if (yValues[i] > yValues[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public double getMaxElement(double[] yValues) {
        int maxNumber = getMaxIndex(yValues);
        return yValues[maxNumber];
    }

    public double getMaxElementArgument(double[] yValues, double[] xValues) {
        int maxNumber = getMaxIndex(yValues);
        return xValues[maxNumber];
    }

    public double getSum(double[] yValues) {
        double sum = 0;
        for (int i = 0; i < yValues.length; i++) {
            sum = sum + yValues[i];
        }
        return sum;
    }

    public double getAverage(double[] yValues) {
        double sum = getSum(yValues);
        double average;
        average = sum / yValues.length;
        return average;
    }

    public void run() {
        double a = 2.4;
        double x1 = 1;
        int x2 = 5;
        double step = 0.01;

        double[] xValues = xValuesArrayFill(x1, x2, step);
        double[] yValues = yValuesArrayFill(xValues, a);

        System.out.println("Найбільший елемент масиву значень функції: " + getMaxElement(yValues));
        System.out.println("Аргумент найбільшого елементу масиву значень функції: " + getMaxElementArgument(yValues, xValues));
        System.out.println("Індекс найбільшого елементу масиву значень функції: " + getMaxIndex(yValues));
        System.out.println("\n");

        System.out.println("Найменший елемент масиву значень функції: " + getMinElement(yValues));
        System.out.println("Аргумент найменшого елементу масиву значень функції: " + getMinElementArgument(yValues, xValues));
        System.out.println("Індекс найменшого елементу масиву значень функції: " + getMinIndex(yValues));
        System.out.println("\n");

        System.out.println("Сумма елементів массиву значень функції: " + getSum(yValues));
        System.out.println("Середнє арифметичне елементів значень функції: " + getAverage(yValues));
        System.out.println("\n");

    }
}
