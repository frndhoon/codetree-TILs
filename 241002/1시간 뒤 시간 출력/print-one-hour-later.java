import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        String time = input.nextLine();
        String[] timeArr = time.split(":");
        int hour = Integer.valueOf(timeArr[0])+1, minute = Integer.valueOf(timeArr[1]);
        
        System.out.println(hour + ":" + minute);
    }
}