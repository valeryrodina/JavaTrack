import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();
        String noSpaceFirst = firstStr.trim().replace(" ", "");
        String noSpaceSecond = secondStr.trim().replace(" ", "");
        System.out.println(noSpaceFirst.equals(noSpaceSecond));
    }
}