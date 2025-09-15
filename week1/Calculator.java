package week1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 a를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자 b를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        sc.close();
    }
}
