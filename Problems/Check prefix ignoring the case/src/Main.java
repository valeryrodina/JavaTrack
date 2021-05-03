import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(inputStr.toLowerCase().startsWith("j"));
    }
}