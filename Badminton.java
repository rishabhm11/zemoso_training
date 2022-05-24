public class Badminton implements Sports{

    @Override
    public void players() {
        System.out.println("Duo- 2 players in each team");
    }

    @Override
    public void duration() {
        System.out.println("Approx. 45 minutes (21 pointer game)");
    }

    @Override
    public void ground() {
        System.out.println("Indira Gandhi Badminton Court");
    }
}
