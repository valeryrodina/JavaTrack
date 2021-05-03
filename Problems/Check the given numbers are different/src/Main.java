import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean equal12 = number1 == number2;
        boolean equal13 = number1 == number3;
        boolean equal23 = number3 == number2;

        boolean result = !(equal12 || equal13 || equal23);

        System.out.println(result);
    }
}