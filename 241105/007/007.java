public class Main {
    public static void main(String[] args) {

        class CodeName {
            String code;
            char meetingPoint;
            int time;

            public CodeName(String code, char meetingPoint, int time) {
                    this.code = code;
                    this.meetingPoint = meetingPoint;
                    this.time = time;
                }
            };
        CodeName code1 = new CodeName("codetree", 'L', 13);
        System.out.printf("secret code : %s\n", code1.code);
        System.out.printf("meeting point : %s\n", code1.meetingPoint);
        System.out.printf("time : %s", code1.time);
    }
}