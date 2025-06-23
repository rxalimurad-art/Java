import com.java.WaitingThread;
import com.java.consumerprod.MessageBox;
import com.java.consumerprod.Producer;
import com.java.consumerprod.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MessageBox box = new MessageBox();
//        new Producer(box).start();
//        new Consumer(box).start();



        Object lock = new Object();

        new WaitingThread(lock, "Thread-A").start();
        new WaitingThread(lock, "Thread-B").start();
        new WaitingThread(lock, "Thread-C").start();

        Thread.sleep(1000); // ensure all are waiting
        synchronized (lock) {
            System.out.println("Main thread calling notify...");
            lock.notifyAll(); // Try running with notifyAll to see the difference
        }

    }
}

