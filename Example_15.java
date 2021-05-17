public class Example_15 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 127; i++) {
            if (i % 16 == 0) {  //16행마다 제목 출을 출력한다.
                System.out.printf("-----------------------\n");
                System.out.printf("10진수    16진수    문자\n");
                System.out.printf("-----------------------\n");
            }
            System.out.printf("%5d %5x %5c\n", i, i, i);
        }
    }
    
}
