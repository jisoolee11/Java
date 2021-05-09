import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        String str;
        int i;

        System.out.printf("문자열을 입력 ==> ");
        str = s.nextLine();  // 문자열을 입력받는다.

        for (i = str.length() - 1; i >= 0; i--) {  //str.length() -> 문자열의 길이를 반환한다.
            System.out.printf("%c", str.charAt(i));  //charAt(i) -> i위치의 한 글자를 반환한다.
        }

    }
    
}
