import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(10, 2);
        calc_add.add();
        calc_add.displayResult("+");



        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        ScientificCalculator calc_squ = new ScientificCalculator();
        calc_squ.setNumbers(12,12 );
        calc_squ.square();
        calc_squ.displayResult("x");



        AbsCalculator abs = new AbsCalculator();
        abs.calcAbsDouble();
        abs.calcAbsLong();
    }
}