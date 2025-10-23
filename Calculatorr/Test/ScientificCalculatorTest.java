import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    ScientificCalculator scientificCalc;

    @BeforeEach
    void setUp() {
        scientificCalc = new ScientificCalculator();
        scientificCalc.setNumbers(12,12);

    }

    @Test
    void square() {
        scientificCalc.square();
        assertEquals(144.0,scientificCalc.getResult(),0.0001);
    }
}