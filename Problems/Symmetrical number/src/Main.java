import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int digit1 = number / 1000;
        int digit2 = number / 100 - digit1 * 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number - number / 10 * 10;

        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}