public class Commentary implements Runnable {

    String[] comments = {
            "That's a beautiful shot!",
            "Straight down the ground!",
            "Fielders are under pressure!",
            "Crowd is going wild!",
            "Looks like a big one!",
            "Tension rising in the stadium!"
    };

    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Commentator: " + comments[i]);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Commentary interrupted.");
        }
    }
}