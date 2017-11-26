package com.company;

public class Main {

    public static void main(String[] args) {
        int m = 30;
        int n = 30;
        char wallsHor = (char) (0x25A4);
        char wallsVer = (char) (0x25A5);
        char barrier = (char) (0x25A0);
        char whiteDiamond = (char) (0x25C7);
        char blackDiamond = (char) (0x25C6);
        char space = ' ';
        char[][] field;
        field = new char[n][m];

        // 11 17

        // Заполнили поле пустыми клетками
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[1].length; j++) {
                field[i][j] = whiteDiamond;
            }
        }

        // Добавили горизонтальные стены
        for (int i = 0; i < field[1].length; i++) {
            field[0][i] = wallsHor;
            field[n - 1][i] = wallsHor;
        }

        // Добавили вертикальные стены
        for (int i = 0; i < field.length; i++) {
            field[i][0] = wallsVer;
            field[i][m - 1] = wallsVer;
        }

        for (int i = 13; i < 16; i++) {
            field[i][11] = wallsVer;
            field[i][17] = wallsVer;
        }

        // Добавили горизонтальные стены
        for (int i = 11; i < 18; i++) {
            field[13][i] = wallsHor;
            field[15][i] = wallsHor;
        }

        field[13][14] = whiteDiamond;
        field[15][14] = whiteDiamond;

//Верхний квадрат
        for (int i = 12; i < 16; i++) {
            field[4][i] = wallsHor;
        }
        for (int i = 1; i < 4; i++) {
            field[i][12] = wallsHor;
            field[i][15] = wallsVer;
        }
////////
        //Правый квадрат
        for (int i = 12; i < 16; i++) {
            field[4][i] = wallsHor;
        }
        for (int i = 1; i < 4; i++) {
            field[i][12] = wallsHor;
            field[i][15] = wallsVer;
        }
////////
        //Левый квадрат
        for (int i = 12; i < 16; i++) {
            field[4][i] = wallsHor;
        }
        for (int i = 1; i < 4; i++) {
            field[i][12] = wallsHor;
            field[i][15] = wallsVer;
        }
////////
        // Нижний квадрат
        for (int i = 12; i < 16; i++) {
            field[26][i] = wallsHor;
        }
        for (int i = 1; i < 4; i++) {
            field[i][18] = wallsHor;
            field[i][15] = wallsVer;
        }
////////
        for (int i = 12; i < 17; i++) {
            field[14][i] = blackDiamond;
        }

        // Вывели на экран лабиринт
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
