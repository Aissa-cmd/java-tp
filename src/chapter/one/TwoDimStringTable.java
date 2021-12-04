package chapter.one;

public class TwoDimStringTable {
    public static void main(String[] args) {
        // table declaration
        String[][] table;
        // table initialisation
        table = new String[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = String.valueOf(i+j+2);
            }
        }
        // table display
        for (String[] i: table) {
            for (String j: i) {
                System.out.printf("%s ", j);
            }
            System.out.println();
        }
    }
}
