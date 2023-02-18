package Java_projects;
class MyThreadRunnable1 implements Runnable {
    public void run() {
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
        System.out.println(" i am a thread 1 ");
    }
}
    class MyThreadRunnable2 implements Runnable{
        public void run(){
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
            System.out.println(" i am a thread 2 ");
        }
}
public class cwh_71_runnable {
    public static void main(String[] args) {
MyThreadRunnable1 t1= new MyThreadRunnable1();
Thread p1= new Thread(t1);
MyThreadRunnable2 t2=new MyThreadRunnable2();
Thread p2=new Thread(t2);
p1.start();
p2.start();
        System.out.println("............."+p1.getName());
        System.out.println("............."+p1.getId());


    }
}
