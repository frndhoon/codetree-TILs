import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken()), targetIdx = Integer.parseInt(st.nextToken());

        String input = br.readLine();

        int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.print(arr[targetIdx-1]);

    }
}