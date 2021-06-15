public class BonusMilesService {
    public long calculateBonus(long ticketPrice, long oneMile){

        long bonus;

        bonus = ticketPrice / oneMile;
        return bonus;
    }
}
