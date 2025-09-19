import java.util.Scanner;

public class Calculator {

    // 더하기 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 빼기 함수
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 곱하기 함수
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 나누기 함수
    public static String divide(int a, int b) {
        if (b == 0) {
            return "0으로 나눌 수 없습니다.";
        }
        return String.valueOf(a / b);
    }

    // 나머지 함수
    public static String modulo(int a, int b) {
        if (b == 0) {
            return "0으로 나눌 수 없습니다.";
        }
        return String.valueOf(a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 a를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자 b를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + subtract(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
        System.out.println("a % b = " + modulo(a, b));

        sc.close();
    }
}
