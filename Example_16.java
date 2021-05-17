import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        String str;  //입력받을 문자열 변수
        int str_cnt;  //입력한 문자의 개수를 저장할 변수
        int i;

        System.out.printf("글자를 입력: ");
        str = s.nextLine();

        System.out.printf("\n");
        System.out.printf("입력한 문자열 ==> %s\n", str);
        System.out.printf("변환된 문자열 ==> ");

        str_cnt = str.length();

        for (i = str_cnt - 1; i >= 0; i--) {  
            System.out.printf("%c", str.charAt(i));  //입력된 개수만큼 거꾸로 한 글자씩 출력한다.
        }
        
    }
}
