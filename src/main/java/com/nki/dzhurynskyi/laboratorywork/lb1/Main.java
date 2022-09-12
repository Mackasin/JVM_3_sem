package com.nki.dzhurynskyi.laboratorywork.lb1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    private double calculateS(double x) {
            return 1 - x + (pow(x, 2) / 2) - (pow(x, 3) / 6) + (pow(x, 4) / 24);
    }

    private double calculateF(double x, double y) {
            return x * (sin(pow(x, 3)) + pow(cos(y), 2));
        }


    private void print(double x, double y, double s, double f) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("s = " + s);
        System.out.println("f = " + f);
    }

    private void printDate() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEEE HH:mm:ss")));
    }

    private void run() {
        double x = 0.135;
        double y = 0.225;
        double s = calculateS(x);
        double f = calculateF(x, y);
        print(x, y, s, f);
        printDate();
    }
}