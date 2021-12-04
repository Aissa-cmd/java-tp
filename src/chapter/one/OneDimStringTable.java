package chapter.one;

public class OneDimStringTable {
    public static void main(String[] args) {
        // table declaration
        String[] table;
        // table initialisation
        table = new String[5];
        table[0] = "David";
        table[1] = "James";
        table[2] = "Tomas";
        table[3] = "Ronald";
        table[4] = "Ryan";
        // table display
        for (String i: table) {
            System.out.print(i + " ");
        }
    }
}
