public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 15_980;
        int miles = service.calculate(price); // должно получиться 799


        System.out.println(miles);
    }
}