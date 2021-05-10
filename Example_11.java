import java.util.Scanner;

public class Example_11 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        System.out.printf("첫번째 수를 입력하세요 : ");
        a = s.nextInt();

        System.out.printf("계산할 연산자를 입력하세요 : ");
        ch = s.next().charAt(0);  //입력받은 문자열의 첫 번째 글자를 추출한다.

        System.out.printf("두번째 수를 입력하세요 : ");
        b = s.nextInt();

        if (ch == '+') {
            System.out.printf("%d + %d = %d 입니다", a, b, a + b);
        }
        if (ch == '-') {
            System.out.printf("%d - %d = %d 입니다", a, b, a - b);
        }
        if (ch == '*') {
            System.out.printf("%d * %d = %d 입니다", a, b, a * b);
        }
        if (ch == '/') {
            System.out.printf("%d / %d = %f 입니다", a, b, a / (float)b);
        } 
        if (ch == '%') {
            System.out.printf("%d %% %d = %d 입니다", a, b, a % b);
        }



    }
}
