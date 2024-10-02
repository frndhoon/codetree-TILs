import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        double a = input.nextDouble(), b = input.nextDouble();
        System.out.println(c);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f\n", b);
    }
}