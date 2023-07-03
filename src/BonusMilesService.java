public class BonusMilesService {

    public int calculate(int ticketPrice) {

        int milePrice = 20;

        int miles = ticketPrice / milePrice;

        return miles;
    }

}
