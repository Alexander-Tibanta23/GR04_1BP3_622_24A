package ec.edu.epn;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Iniciando Calculadora");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp()");
        calculator = new Calculator();
    }

    @Test
    public void sumar() {
        System.out.println("Test 1");
        assertEquals(33, calculator.sumar(10, 23));
    }

    @Test
    public void restar() {
        System.out.println("Test 2");
        assertEquals(7, calculator.restar(30, 23));
    }

    @Test
    public void multiplicar() {
        System.out.println("Test 3");
        assertEquals(230, calculator.multiplicar(10, 23));
    }

    @Test
    public void dividir() {
        System.out.println("Test 4");
        assertEquals(1, calculator.dividir(10, 10), 0);
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass()");
    }
}