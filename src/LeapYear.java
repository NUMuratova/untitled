public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args) {
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(2010));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2025));
    }
}