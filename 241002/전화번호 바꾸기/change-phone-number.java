import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        input.useDelimiter("-");
        String frontNumber = input.next(), middleNumber = input.next(), backNumber = input.next();
        System.out.printf("%s-%s-%s", frontNumber, backNumber, middleNumber);
    }
}