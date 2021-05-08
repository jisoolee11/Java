import java.util.Scanner;

public class example_02 {
    public static void main(String[] args) {
        
        int a, b;
        int result;
        int k;  // 계산 방식을 선택할 변수 선언

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==>");
        k = s.nextInt();  // 연산자를 선택한다.
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();

        if (k == 1) {  // 입력한 k가 1이면 덧셈을 수행한다.
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (k == 2) {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (k == 3) {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (k == 4) {
            result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        }
    }
    
}
