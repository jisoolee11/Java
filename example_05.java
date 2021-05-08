import java.util.Scanner;

public class example_05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int type, data = 0;
        String str;

        System.out.printf("입력진수 결정 <1>10 <2>16 <3>8 : ");
        type = s.nextInt();

        System.out.printf("값 입력 : ");
        
        if (type == 1) {
            str = s.next();  // 문자열을 입력받는다.
            data = Integer.parseInt(str, 10);  // 문자열을 10진수로 변환한다.
        }

        if (type == 2) {
            str = s.next();  // 문자열을 입력받는다.
            data = Integer.parseInt(str, 16);  // 문자열을 16진수로 변환한다.
        }

        if (type == 3) {
            str = s.next();  // 문자열을 입력받는다.
            data = Integer.parseInt(str, 10);  // 문자열을 8진수로 변환한다.
        }

        System.out.printf("10진수 ==> %d\n", data);
        System.out.printf("16진수 ==> %x\n", data);
        System.out.printf("8진수 ==> %o\n", data);
    }
}