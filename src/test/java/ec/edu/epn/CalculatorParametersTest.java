package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {

    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[] {1,2,3});
        data.add(new Object[] {4,5,9});
        data.add(new Object[] {7,8,15});
        data.add(new Object[] {10,11,21});
        data.add(new Object[] {15,16,31});
        data.add(new Object[] {18,19,37});
        return data;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void sumarParametros() {
        Calculator calculator = new Calculator();
        int actual = calculator.sumar(a, b);
        assertEquals(expected, actual);
    }
}