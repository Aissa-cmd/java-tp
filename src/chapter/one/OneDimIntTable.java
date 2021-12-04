package chapter.one;

public class OneDimIntTable {
    public static void main(String[] args) {
        // table declaration
        int[] table;
        // table initialisation
        table = new int[5];
        table[0] = 34;
        table[1] = 3435;
        table[2] = 234;
        table[3] = 678;
        table[4] = 999;
        // table display
        for (int i: table) {
            System.out.print(i + " ");
        }
    }
}
