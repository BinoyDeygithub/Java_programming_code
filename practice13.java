package Java_projects;

class practice1 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("good morning.....");
        }

    }
}
    class practice25 extends Thread{
        public void run(){
            while (true){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("welcome.....");
            }

        }
    }
public class practice13 {
    public static void main(String[] args) {
       practice1 a=new practice1();
       practice25 b= new practice25();
       a.start();
      // a.setPriority(9);
        System.out.println(a.getPriority());
        System.out.println(a.getState());
       b.start();
      // b.setPriority(4);
        System.out.println(b.getPriority());
        System.out.println(b.getState());
        System.out.println(Thread.currentThread());
    }
}
