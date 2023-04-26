
class Bob extends Thread {
    private volatile int input = -1;

    public void setInput(int x) {
        input = x;
    }

    public void run() {
        while (true) {
            if (Thread.interrupted()) {
                System.out.println("[Bob] Finishing work.");
                return;
            }
            if (input >= 0) {
                if (input == 0) {
                    System.out.println("[Bob] Finishing work.");
                    return;
                } else {
                    int result = input * 2;
                    System.out.println("[Bob] The result is: " + result);
                    input = -1;
                }
            }
        }
    }
}
