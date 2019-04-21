public class RunForYourLife implements Runnable {

    private Thread thread;
    private String name;
    private int delay;

    RunForYourLife(String name, int delay) {
        this.name = name;
        this.delay = delay;
        System.out.println(name + " has entered the stage ! ");
    }

    public void run() {
        System.out.println(name + " has started running ! ");
        try {
            for (int i = 0; i < 21; i ++) {
                System.out.println(name + " has passed " + i);
                Thread.sleep(delay);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " has been interrupted :( ");
        }
        System.out.println(name + " has finished running. ");
    }

    public void start() {
        System.out.println(name + " has started running ! ");
        if (thread == null) {
            thread = new Thread (this, name);
            thread.start();
        }
    }
}

