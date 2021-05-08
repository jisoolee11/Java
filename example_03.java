import java.io.IOException;  // IOException 클래스를 임포트한다(입력 예외 처리를 위함)
import java.util.Scanner;

public class example_03 {
    public static void main(String[] args) throws IOException {  // throws IOException은 입력 오류 방지를 위한 문법이다.
        int a, b;
        int result;
        char k; // 연산자를 입력받을 변수를 문자형으로 선언한다.

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.print("+ - * / % ==>");
        k = (char)System.in.read();  // 연산자를 입력한다. 
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();

        if (k == '+') {
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (k == '-') {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (k == '*') {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (k == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println(a + "/" + b + "=" + result);
            } else {  // 0으로 나누면 처리하지 않고 오류메세지를 출력
                System.out.println("0으로 나누면 안됩니다.");
            }   
        }
        if (k == '%') {
            if (b != 0) {
                result = a % b;
                System.out.println(a + "%" + b + "=" + result);
            } else {
                System.out.println("0으로 나누면 안됩니다.");
            }
        }    
    }
}   
