import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = h1 >= h2 && h2 >= h3;
        boolean ascOrdered = h1 <= h2 && h2 <= h3;
        boolean orDescAsc = descOrdered || ascOrdered;

        System.out.println(orDescAsc);
    }
}