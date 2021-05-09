import java.util.Scanner;

public class Example_08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        float a, b;
        float result;

        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = s.nextFloat();
        System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextFloat();

        result = a + b;
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, result);
        result = a - b;
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
        result = a * b;
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
        result = a / b;
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
        result = (int)a % (int)b;  // 나머지 계산을 위해 강제로 형 변환한다.
        System.out.printf("%d %% %d = %d\n", (int)a, (int)b, (int)result);
        
        
        
        
        
    }
}