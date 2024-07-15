public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        powderPrinter.setMeterial(powder);
        System.out.println(powderPrinter.toString());

        plasticPrinter.setMeterial(plastic);
        System.out.println(plasticPrinter.toString());
    }
}
