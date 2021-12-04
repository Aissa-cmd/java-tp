package chapter.one;

public class SwitchDemo {
    public static void main(String[] args) {
        String today = "Monday";
        switch(today) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Today is a school day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Today is weekend");
                break;
        }
    }
}
