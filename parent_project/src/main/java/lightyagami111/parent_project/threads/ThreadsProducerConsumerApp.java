package lightyagami111.parent_project.threads;

public class ThreadsProducerConsumerApp {

    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }

}
