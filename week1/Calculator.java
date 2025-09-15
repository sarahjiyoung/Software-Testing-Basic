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

        // 1차 commit: 더하기, 빼기
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // 2차 commit: 곱하기, 나누기, 나머지
        System.out.println("a * b = " + (a * b));

        if (b != 0) {
            System.out.println("a / b = " + (a / b));   // 정수 나눗셈 (몫)
            System.out.println("a % b = " + (a % b));   // 나머지
        } else {
            System.out.println("a / b = 0으로 나눌 수 없습니다.");
            System.out.println("a % b = 0으로 나눌 수 없습니다.");
        }

        sc.close();
    }
}
