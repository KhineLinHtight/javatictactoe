import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class TicTacToe {
    static int number;
    static char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '=', '+', '=', '+', '=' }, { ' ', '|', ' ', '|', ' ' },
            { '=', '+', '=', '+', '=' }, { ' ', '|', ' ', '|', ' ' } };

    public static void main(String[] args) {

        for (char[] g : gameBoard) {

            System.out.println(g);

        }

        do {
            scanner();
        } while (number < 10);

        System.out.println("Thanks You");

    }

    public static void scanner() {
        Scanner go = new Scanner(System.in);
        System.out.println("Enter Your Number(1-9)");
        number = go.nextInt();

        System.out.println(number);

        switch (number) {
            case 1:
                gameBoard[0][0] = 'x';
                break;1
            case 2:
                gameBoard[0][2] = 'x';
                break;
            case 3:
                gameBoard[0][4] = 'x';
                break;
            case 4:
                gameBoard[2][0] = 'x';
                break;
            case 5:
                gameBoard[2][2] = 'x';
                break;
            case 6:
                gameBoard[2][4] = 'x';
                break;
            case 7:
                gameBoard[4][0] = 'x';
                break;
            case 8:
                gameBoard[4][2] = 'x';
                break;
            case 9:
                gameBoard[4][4] = 'x';
                break;
            default:

        }

        for (char[] g : gameBoard) {

            System.out.println(g);

        }
    }

    public static void scannerTwo() {
        Scanner go = new Scanner(System.in);
        System.out.println("Enter Your Number(1-9)");
        number = go.nextInt();

        System.out.println(number);

        switch (number) {
            case 1:
                gameBoard[0][0] = 'x';
                break;1
            case 2:
                gameBoard[0][2] = 'x';
                break;
            case 3:
                gameBoard[0][4] = 'x';
                break;
            case 4:
                gameBoard[2][0] = 'x';
                break;
            case 5:
                gameBoard[2][2] = 'x';
                break;
            case 6:
                gameBoard[2][4] = 'x';
                break;
            case 7:
                gameBoard[4][0] = 'x';
                break;
            case 8:
                gameBoard[4][2] = 'x';
                break;
            case 9:
                gameBoard[4][4] = 'x';
                break;
            default:

        }

        for (char[] g : gameBoard) {

            System.out.println(g);

        }
    }
}
