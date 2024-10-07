import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int width = input.nextInt(), height = input.nextInt();
        width += 8;
        height *= 3;
        int area = width * height;

        System.out.println(width);
        System.out.println(height);
        System.out.println(area);

    }
}