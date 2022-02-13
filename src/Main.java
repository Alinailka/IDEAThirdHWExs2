public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double ibm = service.calculate(1.65, 55);
        System.out.println("Ваш индекс массы тела = " + ibm);
    }
}
