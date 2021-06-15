public class Main {
    long ticketPrice;
    long oneMile;
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        long bonus = service.calculateBonus(ticketPrice = 500, oneMile = 20);
               System.out.println(miles);
    }
}
