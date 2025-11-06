import java.util.Scanner;

public class AbsCalculator {

    Scanner sc = new Scanner(System.in);

    public void calcAbsDouble() {
        System.out.print("실수(double)를 입력하세요: ");
        double num = sc.nextDouble();

        double result = Math.abs(num);
        System.out.println("절댓값 (double): " + result);
    }

    public void calcAbsLong() {
        System.out.print("정수(long)를 입력하세요: ");
        long num = sc.nextLong();

        long result = Math.abs(num);
        System.out.println("절댓값 (long): " + result);
    }
}

//https://github.com/yahahahoho/Java-Calculator/issues/13 계산기 v4.0 코드 개발완료