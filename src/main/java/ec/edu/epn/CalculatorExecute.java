package ec.edu.epn;

public class CalculatorExecute {
    public static void main(String[] args) {

        System.out.println("Calculadora programa");

        Calculator calc = new Calculator();
        int sumar = calc.sumar(10, 20);
        System.out.println("calc.sumar(10,20)" + sumar);

        int restar = calc.restar(40, 20);
        System.out.println("calc.restar(40,20)" + restar);

        System.out.println("It is a change || ==");
    }
}
