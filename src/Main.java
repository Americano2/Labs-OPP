public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula();

        double c, f;

        formula.getInitialValues();
        c = formula.calculateC();
        f = formula.calculateF();

        formula.printValue("c =", c);
        formula.printValue("f =", f);

        formula.printTime();

        formula.run();
    }
}