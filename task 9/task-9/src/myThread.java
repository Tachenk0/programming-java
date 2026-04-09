class myThread implements Runnable {

    private String text;

    myThread() {
        super();
    }

    myThread(String text) {
        this.text = text;
    }

    public void run() {
        synchronized(System.out) {
            System.out.println(Thread.currentThread().threadId());
            System.out.println(text);
        }
    }
}