public class Main {

    public static void main(String[] args) {
    }

    public static boolean isLeapYear(int year) {


        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This year is divided by 4 and not 100");
            return true;
        }

        if (year % 400 == 0) {
            System.out.println("This year is divided by 400");
            return true;
        }
        return false;
    }
}
