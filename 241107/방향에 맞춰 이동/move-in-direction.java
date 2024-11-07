import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x = 0, y = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char direction = st.nextToken().charAt(0);
            int distance = Integer.parseInt(st.nextToken());

            if (direction == 'W') {
                x -= distance;
            } else if (direction == 'S') {
                y -= distance;
            } else if (direction == 'N') {
                y += distance;
            } else if (direction == 'E') {
                x += distance;
            }

        }
    System.out.printf("%d %d", x, y);
    }
}