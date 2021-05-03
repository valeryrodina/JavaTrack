import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int unitsNumber = scanner.nextInt();

        if (unitsNumber >= 1 && unitsNumber <= 19) {
            System.out.println("pack");
        } else if (unitsNumber >= 20 && unitsNumber <= 249) {
            System.out.println("throng");
        } else if (unitsNumber >= 250 && unitsNumber <= 999) {
            System.out.println("zounds");
        } else if (unitsNumber >= 1000) {
            System.out.println("legion");
        } else {
            System.out.println("no army");
        }
    }
}