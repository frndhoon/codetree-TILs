import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("%d %d", a, b);
    }
}