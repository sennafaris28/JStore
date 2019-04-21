import java.util.Random;

public class LetsGo {

    public LetsGo () {}

    public int random(int min, int max) {
        if ( min >= max) {
            throw new IllegalArgumentException(" min is less or equal with max. cheat failed. ");
        }
        Random random1 = new Random();
        return random1.nextInt((max - min) + 1) + min;
    }

    public static void main (String[] args) {
        System.out.println("----- JSTORE EMPLOYEE RUNNING COMPETITION 2K19 -----");
        System.out.println("----- START -----");

        LetsGo lg = new LetsGo();
        RunForYourLife lionel = new RunForYourLife("Lionel", lg.random(40, 50));
        RunForYourLife andreas = new RunForYourLife("Andreas", lg.random(20,30));
        RunForYourLife messi = new RunForYourLife("Messi", lg.random(1, 10));

        lionel.start();
        andreas.start();
        messi.start();

    }
}
