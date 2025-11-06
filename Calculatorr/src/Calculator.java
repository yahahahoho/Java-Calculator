public class Calculator {
    int num1;
    int num2;
    int  result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        result = num1 + num2;
        return result;
    }

    public int subtract() {
        result = num1 - num2;
        return result;
    }

    public int multiply() {
        result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }

    public int divide() {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            result = 0;
            return result;
        }

        int count = 0;
        int temp = num1;

        while (temp >= num2) {
            temp -= num2;
            count++;
        }
        result = count;
        return result;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
