import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        String mettingPoint = st.nextToken();
        int time = Integer.parseInt(st.nextToken());

        class CodeName {
            String code;
            String meetingPoint;
            int time;

            public CodeName(String code, String meetingPoint, int time) {
                    this.code = code;
                    this.meetingPoint = meetingPoint;
                    this.time = time;
                }
            };
        CodeName code1 = new CodeName(code, mettingPoint, time);
        System.out.printf("secret code : %s\n", code1.code);
        System.out.printf("meeting point : %s\n", code1.meetingPoint);
        System.out.printf("time : %s", code1.time);
    }
}