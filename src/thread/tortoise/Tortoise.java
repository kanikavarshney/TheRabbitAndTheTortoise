package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    public static final int MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Torotise");
        this.tortoise = new Thread(this, "Torotise");
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            @ @ -29, 7 + 29, 6 @@public void run () {
                break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    //System.out.println("The Rabbit is leading and hence is going to sleep!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
