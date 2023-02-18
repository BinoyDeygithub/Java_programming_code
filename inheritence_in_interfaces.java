package Java_projects;
interface sample{
    void meth1();
    void meth2();
}
interface childSample extends sample{
    void meth3();
    void meth4();
}
class mysample implements childSample{

    public   void meth1(){
        System.out.println("meth 1");
    } public   void meth2(){
        System.out.println("meth 2");
    }
   public   void meth3(){
       System.out.println("meth 3");
   }
    public   void meth4(){
        System.out.println("meth 4");
    }
}
public class inheritence_in_interfaces {
    public static void main(String[] args) {
        mysample c = new mysample();
        c.meth4();
        c.meth1();

    }
}
