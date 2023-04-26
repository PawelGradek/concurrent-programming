
class Alice extends Thread {
    private Bob bob;

    public Alice(Bob bob) {
        this.bob = bob;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("[Alice] Sending to Bob: " + i);
            bob.setInput(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bob.setInput(0);
    }
}
