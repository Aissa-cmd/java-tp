package chapter.one;

public class ShowVarVals {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.25412;
        // The println function takes one argument
        System.out.println("x=" + x + "; y="+ y);
        /*
        * The printf function is similar to the printf
        * function in C the first argument is a string
        * withe all the format specifiers followed by
        * variables that would be placed in the place
        * of the format specifiers when printed to the
        * console
        */
        System.out.printf("x=%d; y=%f", x, y);
    }
}
