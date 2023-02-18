package Java_projects;


class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("thanku");
     //   while (true){
      //      System.out.println("i am a thread");
     //   }
    }
}
public class thread_cons {
    public static void main(String[] args) {
     Mythr t=new Mythr("binoy");
        Mythr t1=new Mythr("bino");

     t.start();
     t1.start();
        System.out.println("the id thread is "+ t.getId());
        System.out.println("the name thread is "+ t.getName());
        System.out.println("the id thread is "+ t1.getId());
        System.out.println("the name thread is "+ t1.getName());



    }
}
