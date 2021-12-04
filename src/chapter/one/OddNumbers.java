package chapter.one;

public class OddNumbers {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Les nombres impairs entre 1 et 100:");
        while(i <= 100) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
