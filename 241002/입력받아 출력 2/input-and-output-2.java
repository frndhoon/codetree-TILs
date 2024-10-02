import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        input.useDelimiter("-");
        int front = input.nextInt(), back = input.nextInt();
        System.out.printf("%d%d", front, back);
    }
}