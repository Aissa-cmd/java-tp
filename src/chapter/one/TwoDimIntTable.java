package chapter.one;

public class TwoDimIntTable {
    public static void main(String[] args) {
        // table declaration
        int[][] table;
        // table initialisation
        table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i+j+2;
            }
        }
        // table display
        for (int[] i: table) {
            for (int j: i) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
    }
}
