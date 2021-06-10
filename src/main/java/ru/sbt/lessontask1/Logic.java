package ru.sbt.lessontask1;

public class Logic {
    public Logic(int row, int seat) {
        this.row = row;
        this.seat = seat;
        arr = new String[row][seat];
    }

    int row;
    int seat;
    int quantitySeat = 0;
    String[][] arr;

    public void showArr() {
        System.out.println();
        for (int i = 0; i < seat; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Всего мест в зале " + quantitySeat);
    }

    public void initArr() {
        for (int i = 0; i < seat; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = "=";
                if (i == 0) {
                    arr[i][j] = String.valueOf(j);
                }
                if (j == 0) {
                    arr[i][j] = String.valueOf(i);
                }
                quantitySeat++;
            }
        }

    }

    public void buyTicket(int seatNumber, int rowNumber) {
        if (quantitySeat < 60) {
            arr[seatNumber][rowNumber] = "10";
        }
        if (quantitySeat >= 60) {
            if (rowNumber <= row / 2) {
                arr[seatNumber][rowNumber] = "8";
            } else {
                if (seatNumber % 2 == 0) {
                    arr[seatNumber][rowNumber] = "4";
                } else {
                    arr[seatNumber][rowNumber] = "5";
                }
            }
        }
    }
}
