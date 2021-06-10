package ru.sbt.lessontask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Logic logic = new Logic(10,10);

        int seatNumber = 0;
        int rowNumber = 0;


        logic.initArr();
        logic.showArr();

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Выберите место в зале");
                seatNumber = scanner.nextInt();
                rowNumber = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Данные введены неправильно");
            }
        }
        logic.buyTicket(seatNumber, rowNumber);
        logic.showArr();
    }
}
