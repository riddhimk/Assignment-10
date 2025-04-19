public class Batsman implements Runnable {
    private String name;

    public Batsman(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int ball = 1; ball <= 6; ball++) {
                int run = (int)(Math.random() * 7);
                System.out.println(name + " hits: " + run + " run(s)");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " got interrupted!");
        }
    }
}