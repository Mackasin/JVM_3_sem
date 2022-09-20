package com.nki.dzhurynskyi.laboratorywork.architect;

import java.util.Scanner;

public class TernaryToBinary {
    int a1 = 0, b1 = 0, l;

    public static void main(String[] args) {
        TernaryToBinary program = new TernaryToBinary();
        program.run();
    }

    public int ternaryToDecimal(String a) {
        int decNumber = 0;
        char[] res = a.toCharArray();
        for (int i = a.length() - 1; i >= 0; i--) {
            int powerOfNumb = a.length() - i - 1;
            if (res[i] == '1') {
                decNumber += 1 * Math.pow(3, powerOfNumb);
            } else if (res[i] == '2') {
                decNumber += 2 * Math.pow(3, powerOfNumb);
            } else {
                decNumber += 0 * Math.pow(3, powerOfNumb);
            }
        }
        return decNumber;
    }

    public void decimalToBinary(int decNumber) {
        StringBuilder temp = new StringBuilder();

        while (decNumber != 0) {

            int l = decNumber % 2;
            temp.insert(0, l);
            decNumber /= 2;
        }
        System.out.println(temp);
    }

    public int binaryToDecimal(String a) {
        int decNumber = 0;
        char[] res = a.toCharArray();
        for (int i = a.length() - 1; i >= 0; i--) {
            int powerOfNumb = a.length() - i - 1;
            if (res[i] == '1') {
                decNumber += 1 * Math.pow(2, powerOfNumb);
            } else {
                decNumber += 0 * Math.pow(2, powerOfNumb);
            }
        }
        return decNumber;
    }

    public void decimalToTernary(int decNumber) {
        StringBuilder temp = new StringBuilder();
        while (decNumber != 0) {
            int l = decNumber % 3;
            temp.insert(0, l);
            decNumber /= 3;
        }
        System.out.println(temp);
    }

    private void ternary(Scanner sc) {
        System.out.print("Enter the numbers:");
        if (sc.hasNextInt(3)) {
            String a = sc.next();
            a1 = ternaryToDecimal(a);
        } else {
            System.out.println("Wrong data!\n");
            System.exit(0);
        }
        if (sc.hasNextInt(3)) {
            String b = sc.next();
            b1 = ternaryToDecimal(b);
        } else {
            System.out.println("Wrong data!\n");
            System.exit(0);
        }
    }


    private void binary(Scanner sc) {
        System.out.print("Enter the numbers:");
        if (sc.hasNextInt(2)) {
            String a = sc.next();
            a1 = binaryToDecimal(a);
        } else {
            System.out.println("Wrong data!\n");
            System.exit(0);
        }
        if (sc.hasNextInt(2)) {
            String b = sc.next();
            b1 = binaryToDecimal(b);
        } else {
            System.out.println("Wrong data!\n");
            System.exit(0);
        }
    }


    private void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1-Convert from ternary to binary systems
                    2-Addition in ternary system
                    3-Addition in binary system
                    4-Subtraction in ternary system
                    5-Subtraction in binary system
                    0-exit
                    Please choose function:""");

            while (true) {
                if (sc.hasNextInt()) {
                    l = sc.nextInt();
                    if (l < 0 || l > 5) {
                        System.out.println("Wrong data! please try again");
                        sc.nextLine();
                    } else break;
                } else {
                    System.out.println("Wrong data! please try again");
                    sc.nextLine();
                }
            }

            switch (l) {
                case 1 -> {
                    System.out.print("Enter the number:");
                    if (sc.hasNextInt(3)) {
                        String a = sc.next();
                        int decNumber = ternaryToDecimal(a);
                        System.out.print("Result:");
                        decimalToBinary(decNumber);
                    } else {
                        System.out.println("Wrong data!");
                        System.exit(0);
                    }

                }

                case 2 -> {
                    ternary(sc);
                    int sum = a1 + b1;
                    decimalToTernary(sum);
                }
                case 3 -> {
                    binary(sc);
                    int sum = a1 + b1;
                    System.out.print("Result:");
                    decimalToBinary(sum);
                }
                case 4 -> {
                    ternary(sc);
                    if (a1 >= b1) {
                        int sum = a1 - b1;
                        System.out.print("Result:");
                        decimalToBinary(sum);
                    } else {
                        System.out.println("The result is less than zero\n");
                    }
                }
                case 5 -> {
                    binary(sc);
                    if (a1 >= b1) {
                        int sum = a1 - b1;
                        System.out.print("Result:");
                        decimalToBinary(sum);
                    } else {
                        System.out.println("The result is less than zero\n");
                    }
                }
                case 0 -> System.exit(0);

            }
        }
    }
}
