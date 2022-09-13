package com.nki.dzhurynskyi.laboratorywork.architect;

import java.util.Scanner;

public class TernaryToBinary {

    public static void main(String[] args) {
        TernaryToBinary prog = new TernaryToBinary();
        prog.run();
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

    public void binaryToDecimal(String a) {
        int decNumber = ternaryToDecimal(a);
        String temp = "";
        while (decNumber != 0) {

            int l = decNumber % 2;
            temp = l + temp;
            decNumber /= 2;
        }
        System.out.println(temp);
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt(3)) {
            String a = sc.nextLine();
            System.out.println(ternaryToDecimal(a));
            binaryToDecimal(a);
        } else {
            System.out.println("wrong parameters");
            System.exit(0);
        }
    }
}
