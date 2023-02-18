package Java_projects;
class Mythre extends Thread{
public Mythre(String name){
        super(name);
        }
public void run(){
       // int i=34;
      //  System.out.println("thanku        "+this.getName());
           while (true){
        //      System.out.println("i am a thread");
               System.out.println("thanku        "+this.getName());

          }
        }
        }
public class thread_priyority {
    public static void main(String[] args) {
        Mythre t1=new Mythre("binoy1");
        Mythre t2=new Mythre("bino2");
        Mythre t3=new Mythre("bin3");
        Mythre t4=new Mythre("binoy de4");
        Mythre t5=new Mythre("binoy dey5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
