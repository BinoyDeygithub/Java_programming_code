package Java_projects;

@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//   void thisMethod2();
}

class NewPhone implements NewPhone1 {
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
       // System.out.println(a+b);

}
public class annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
       // System.out.println(phone.sum(5,9));
    }
}
