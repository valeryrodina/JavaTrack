import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        System.out.println(inputStr.substring(firstNum, secondNum + 1));
    }
}