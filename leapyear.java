public class Main {
    public static void main(String[] args) {

        if ((2023 % 400 == 0) || (2023 % 4 == 0 && 2023 % 100 != 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
