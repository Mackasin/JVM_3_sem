package com.nki.dzhurynskyi.laboratorywork.lb3.part2;

import com.nki.dzhurynskyi.laboratorywork.lb3.part2.phones.Phone;

public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();
    }

    public void run() {
        Phone[] phones = fillProductsArray();
        System.out.println("Відомості про абонентів, у яких час міських розмов перевищує заданий:");
        filterExceedTimeForTownCalls(400, phones);
        System.out.println("Відомості про абонентів, які користувались міжміським зв’язком:");
        usedLongDistanceCommunication(phones);
        System.out.println("Відомості про абонентів чий номер рахунку знаходиться у вказаному діапазоні:");
        accNumbInRange(300, 500, phones);

    }

    public Phone[] fillProductsArray() {
        return new Phone[]{
                new Phone(1, "Олександров", "Олександр", "Олександрович", 456, 400.56, 300.6),
                new Phone(2, "Максимов", "Максим", "Максимович", 564, 20.5, 20.5),
                new Phone(3, "Іванов", "Іван", "Іванович", 355, 200.1, 30.7),
                new Phone(4, "Крисяк", "Андрій", "Петрович", 666, 1000.15, 0.0)
        };
    }

    public void accNumbInRange(int x1, int x2, Phone[] phones) {
        for (int i = 0; i < phones.length; i++) {
            if (x1 <= phones[i].getAccountNumber() && x2 >= phones[i].getAccountNumber()) {
                forPrint(i, phones);
            }
        }
    }

    public void usedLongDistanceCommunication(Phone[] phones) {
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getTimeForLongDistanceCalls() != 0) {
                forPrint(i, phones);
            }
        }
    }

    public void filterExceedTimeForTownCalls(int notExceed, Phone[] phones) {
        for (int i = 0; i < phones.length; i++) {
            if (notExceed < phones[i].getTimeForTownCalls()) {
                forPrint(i, phones);
            }
        }
    }

    private void forPrint(int i, Phone[] phones) {

        System.out.println("ID: " + phones[i].getId() + '\n'
                + "Прізвище: " + phones[i].getSurname() + '\n' +
                "Ім'я: " + phones[i].getName() + '\n' +
                "По батькові :" + phones[i].getMiddleName() + '\n' +
                "Номер рахунку: " + phones[i].getAccountNumber() + '\n' +
                "Час міських розмов: " + phones[i].getTimeForTownCalls() + '\n' +
                "Час міжміських розмов: " + phones[i].getTimeForLongDistanceCalls() + '\n');
    }
}
