public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMeterial(powder);
        Powder p = powderPrinter.getMeterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMeterial(plastic);
        Plastic pl = plasticPrinter.getMeterial();  // 형변환 하지 않음
        System.out.println(plasticPrinter);

        // GenericPrinter<Water> waterPrinter = new GenericPrinter<>(); // Water는 Material를 상속 받지 않아서 쓸 수가 없다
    }
}
