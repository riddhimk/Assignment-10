public class Umpire implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Umpire: Ball " + i);
                Thread.sleep(1010);
            }
        } catch (InterruptedException e) {
            System.out.println("Umpire interrupted.");
        }
    }
}