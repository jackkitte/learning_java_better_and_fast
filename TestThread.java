class CarThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Car Thread Run " + i);

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class TrainThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Train Thread Run " + i);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class TestThread {
  public static void main(String[] args) {
    CarThread carThread = new CarThread();
    carThread.start();

    TrainThread trainThread = new TrainThread();
    trainThread.start();
  }
}