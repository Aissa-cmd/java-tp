package chapter.two;

public class GenericMethodDemo {
    public static void main(String[] args) {
        String str = Utils.<Integer, String>show(3, "test");
        System.out.println(str);
    }
}

class Utils {
    public static <T, U> String show(T a, U b) {
        return a + " " + b;
    }
}
