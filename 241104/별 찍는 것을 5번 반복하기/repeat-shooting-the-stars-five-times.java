import java.io.IOException;


public class Main {
    public static void print10stars () {
        for (int i = 0; i < 10; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
    public static void main(String [] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            print10stars();
        }

    }
}