package Java_projects;

abstract class base{
    public base (){
        System.out.println("i am a constructor");
    }
    public  void sayHello(){
        System.out.println(" hello");
        ;

    }
      abstract public void greed();
    abstract public void greed1();

}



class derived extends base {
    @Override
    public void greed() {
        System.out.println("good morning");

    }

    @Override
    public void greed1() {
        System.out.println("good morning everyone");

    }


}

    abstract class derived2 extends base{

}
public class abstractclass {
    public static void main(String[] args) {
       derived c = new derived( ) ;
       c.greed1();
       c.sayHello();

        System.out.println("nice");
       }

    }

