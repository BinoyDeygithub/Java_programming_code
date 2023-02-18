package Java_projects;
class thrunnable implements Runnable {
    public void run(){
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");

        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");

    }
     class thrunnable2 implements Runnable {
        public void run(){
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");
            System.out.println("i am a  good thread");

        }
}
public class runnable {
    public void main(String[] args) {
    thrunnable1 t1 = new thrunnable1();
    Thread g1= new Thread(t1);
    thrunnable2 t2 = new thrunnable2();
    Thread g2=new Thread(t2);

    g1.start();
    g2.start();
    }
}}
