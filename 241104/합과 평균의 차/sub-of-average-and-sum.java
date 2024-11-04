import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        Integer a = Integer.parseInt(arr[0]), b = Integer.parseInt(arr[1]), c = Integer.parseInt(arr[2]);

        Integer sum = a+b+c;
        Integer average = (a+b+c)/arr.length;
        Integer differenceOfSumAndAverage = sum - average;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(differenceOfSumAndAverage);
    }
}