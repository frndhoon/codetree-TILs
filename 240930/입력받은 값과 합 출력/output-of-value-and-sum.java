import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        System.out.printf("%d %d %d", a, b, a+b);
    }
}