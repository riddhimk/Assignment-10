public class MatchManager {

    public void startMatch() {
        Thread batsman1 = new Thread(new Batsman("Gayle"));
        Thread batsman2 = new Thread(new Batsman("Dhoni"));
        Thread umpire = new Thread(new Umpire());
        Thread commentary = new Thread(new Commentary());

        batsman1.start();
        batsman2.start();
        umpire.start();
        commentary.start();
    }
}