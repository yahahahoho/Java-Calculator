public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(10, 2);
        calc_add.add();
        calc_add.displayResult("+");
    }
}
