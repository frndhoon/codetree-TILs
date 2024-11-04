import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int getGCD (int n, int m) {
        if (m == 0) return n;
        return getGCD(m, n % m);
    }

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int n = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]);
        
        int result = getGCD(n, m);
        System.out.print(result);

    }
}