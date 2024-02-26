class BMS implements Runnable {
  public void run() {
    try {
      while (true) {
        System.out.println("BMS College of Engineering");
        Thread.sleep(10000);
      }
    } catch (InterruptedException e) {
      System.out.println("There is an interruption occured");
    }
  }
}

class CSE implements Runnable {
  public void run() {
    try {
      while (true) {
        System.out.println("CSE");
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
      System.out.println("There is an interruption occured");
    }
  }
}
public class Main {
  public static void main(String[] args) {
    BMS bms = new BMS();
    Thread t1 = new Thread(bms);
    t1.start();

    CSE cse = new CSE();
    Thread t2 = new Thread(cse);
    t2.start();
  }
}
