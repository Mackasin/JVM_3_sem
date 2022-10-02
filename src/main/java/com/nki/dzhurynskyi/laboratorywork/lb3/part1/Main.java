package com.nki.dzhurynskyi.laboratorywork.lb3.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        Executor executor = new Executor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write text:");
        String text = scanner.nextLine();
        System.out.println("Write s:");
        String s = scanner.next();
        System.out.println("Write t:");
        String t = scanner.next();
        System.out.println("BEFORE: " + text);
        text = executor.modifyString(s, t, text);
        System.out.println("AFTER: " + text);
    }
}
