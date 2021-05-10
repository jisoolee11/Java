import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;
        String[] str;  //문자열 배열을 준비한다.

        System.out.printf("수식읋 한줄로 띄어쓰기로 입력하세요 : ");
        str = s.nextLine().split(" ");  //입력받은 문자열을 공백으로 분리한다.

        a = Integer.parseInt(str[0]); //문자열 str[0]을 정수로 변환하여 a에 저장한다.
        ch = str[1].charAt(0);  //str[1]의 첫번째 글자만 추출한다.
        b = Integer.parseInt(str[2]);

        switch (ch) {
        case '+':
            System.out.printf("%d + %d = %d", a, b, a + b);
            break;
        case '-':
            System.out.printf("%d - %d = %d", a, b, a - b);
            break;
        case '*':
            System.out.printf("%d * %d = %d", a, b, a * b);
            break;
        case '/':
            System.out.printf("%d / %d = %f", a, b, a / (float)b);
            break;
        case '%':
            System.out.printf("%d %% %d = %d", a, b, a % b);
            break;
        default:
            System.out.printf("연산자를 잘못 입력했습니다.");
        }
    }
}
