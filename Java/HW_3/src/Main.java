import java.util.Scanner;
import java.util.Random;

public class Main {

    static void way(int[][] field, int endY, int endX) {
        int minMoves = 0;
        while (true) {

            if (field[endY + 1][endX] == 1) break;
            int x1 = field[endY + 1][endX];
            if (x1 == -1 || x1 == -3 || x1 == -5 || x1 == 0) x1 = Integer.MAX_VALUE;
            if (field[endY][endX + 1] == 1) break;
            int x2 = field[endY][endX + 1];
            if (x2 == -1 || x2 == -3 || x2 == -5 || x2 == 0) x2 = Integer.MAX_VALUE;
            if (field[endY - 1][endX] == 1) break;
            int x3 = field[endY - 1][endX];
            if (x3 == -1 || x3 == -3 || x3 == -5 || x3 == 0) x3 = Integer.MAX_VALUE;
            if (field[endY][endX - 1] == 1) break;
            int x4 = field[endY][endX - 1];
            if (x4 == -1 || x4 == -3 || x4 == -5 || x4 == 0) x4 = Integer.MAX_VALUE;
            int min = Math.min(Math.min(x1, x2), Math.min(x3, x4));

            if (minMoves < min && min != Integer.MAX_VALUE) minMoves = min;

            if (x1 == Integer.MAX_VALUE && x2 == Integer.MAX_VALUE && x3 == Integer.MAX_VALUE && x4 == Integer.MAX_VALUE) break;;

            if (field[endY + 1][endX] == min) {
                field[endY + 1][endX] = -5;
                endY++;
            }
            else if (field[endY][endX + 1] == min) {
                field[endY][endX + 1] = -5;
                endX++;
            }
            else if (field[endY - 1][endX] == min) {
                field[endY - 1][endX] = -5;
                endY--;
            }
            else if (field[endY][endX - 1] == min) {
                field[endY][endX - 1] = -5;
                endX--;
            }
        }

        for (int[] ints : field) {
            for (int j = 0; j < field[1].length; j++) {
                if (ints[j] == -1) System.out.print("\u001B[30m" + '█' + "\u001B[0m\t");
                else if (ints[j] == 1) System.out.print("\u001B[32m" + '█' + "\u001B[0m\t");
                else if (ints[j] == -3) System.out.print("\u001B[35m" + '█' + "\u001B[0m\t");
                else if (ints[j] == 0) System.out.print("\u001B[37m" + '█' + "\u001B[0m\t");
                else if (ints[j] == -5) System.out.print("\u001B[31m" + '█' + "\u001B[0m\t");
                else System.out.print("\u001B[34m" + ints[j] + "\u001B[0m\t");

            }
            System.out.println();
        }
        System.out.println("Minimum number of moves - " + minMoves);

    }

    static boolean round(int[][] field, App app) {
        int startY = app.remove();
        if (startY == -1) return true;
        else {
            int startX = app.remove();
            if (field[startY + 1][startX] == 0) {
                app.add(startY + 1);
                app.add(startX);
                field[startY + 1][startX] = field[startY][startX] + 1;
            }
            if (field[startY][startX + 1] == 0) {
                app.add(startY);
                app.add(startX + 1);
                field[startY][startX + 1] = field[startY][startX] + 1;
            }
            if (field[startY - 1][startX] == 0) {
                app.add(startY - 1);
                app.add(startX);
                field[startY - 1][startX] = field[startY][startX] + 1;
            }
            if (field[startY][startX - 1] == 0) {
                app.add(startY);
                app.add(startX - 1);
                field[startY][startX - 1] = field[startY][startX] + 1;
            }

            return false;
        }
    }

    public static void main(String[] args) {

        App app = new App();


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scan.nextInt();
        System.out.print("Enter width: ");
        int width = scan.nextInt();
        int startY = 1;
        int startX = 1;
        int endY = height;
        int endX = width;
        int[][] field = new int[height+2][width+2];
        for (int i = 0; i < height+2; i++) {
            for (int j = 0; j < width+2; j++) {
                if ((i == 0 || j == 0) || (i == height+1 || j == width+1)) {
                    field[i][j] = -1;
                } else {
                    field[i][j] = 0;
                }
            }
        }
        Random r = new Random();
        System.out.print("Enter the number of obstacles: ");
        int obNum = scan.nextInt();
        for (int i = 0; i < obNum; i++) {
            field[r.nextInt(height)][r.nextInt(width)] = -1;
        }
        field[startY][startX] = 1;
        field[endY][endX] = -3;

        app.add(startY);
        app.add(startX);

        while (true) {
            if (round(field, app)) break;
        }

        for (int i = 0; i < height+2; i++) {
            for (int j = 0; j < width+2; j++) {
                if (field[i][j] == -1) System.out.print("\u001B[30m" + '█' + "\u001B[0m\t");
                else if (field[i][j] == 1) System.out.print("\u001B[32m" + '█' + "\u001B[0m\t");
                else if (field[i][j] == -3) System.out.print("\u001B[35m" + '█' + "\u001B[0m\t");
                else if (field[i][j] == 0) System.out.print("\u001B[37m" + '█' + "\u001B[0m\t");
                else System.out.print("\u001B[34m" + field[i][j] + "\u001B[0m\t");

            }
            System.out.println();
        }

        System.out.println("Press any button and Enter to continue.");
        var s = new Scanner(System.in).next();
        way(field, endY, endX);

    }
}
