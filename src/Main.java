public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        System.out.println();
        System.out.println("25000");
        System.out.println(service.calculate(25000));

        System.out.println();
        System.out.println("5265");
        System.out.println(service.calculate(5265));

        System.out.println();
        System.out.println("100980");
        System.out.println(service.calculate(100980));

    }
}
