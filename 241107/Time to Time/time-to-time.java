import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startHour = Integer.parseInt(st.nextToken());
        int startMin = Integer.parseInt(st.nextToken());
        int targetHour = Integer.parseInt(st.nextToken());
        int targetMin = Integer.parseInt(st.nextToken());

        int totalTime = 0;

        while (startHour != targetHour || startMin != targetMin) {
            if (startHour < targetHour) {
                totalTime += 60;
                startHour += 1;
            } else {
                if (startMin >= targetMin) { // 만약 남은 분이 더 많다면,
                    totalTime -= startMin - targetMin; // 두 개의 차를 빼기
                    break;
                }
                else { // 만약 남은 분이 더 적다면,
                    totalTime += targetMin - startMin; // 두 개의 차를 더하기
                    break;
                }
            }
        }

        System.out.print(totalTime);

    }
}