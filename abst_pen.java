package Java_projects;
abstract class pen{
    abstract void write();
    abstract void refil();

}
class fnpen extends pen{
    public void write(){
        System.out.println("writting");
    }
    public void refil(){
        System.out.println("reflling");
    }
    void chnme(){
        System.out.println("changing name");
    }
}
public class abst_pen {
    public static void main(String[] args) {
        fnpen pen=new fnpen();
        pen.chnme();
    }
}
