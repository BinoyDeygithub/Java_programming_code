package Java_projects;
class Mythre1 extends Thread{
    public Mythre1(String name){
        super(name);
    }
    public void run(){

        while (true){
            System.out.println("thanku yuuuuuuuuuu       "+getName());
            try {
                Thread.sleep(655);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Mythre2 extends Thread{


    public void run(){

        while (true){
            System.out.println("thanku        " +getName());

        }
    }
}

public class thread_metod {
    public static void main(String[] args) {
       Mythre1 t1=new Mythre1("bin");
       Mythre2 t2=new Mythre2();
       t1.start();
       /*try{
           t1.join();

        }
        catch(Exception e){
            System.out.println(e);

        }*/
       t2.start();

    }
}
