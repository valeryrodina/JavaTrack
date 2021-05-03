import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean check1 = number1 > 0 && number2 <= 0 && number3 <= 0;
        boolean check2 = number2 > 0 && number1 <= 0 && number3 <= 0;
        boolean check3 = number3 > 0 && number2 <= 0 && number1 <= 0;

        System.out.println(check1 || check2 || check3);
    }
}