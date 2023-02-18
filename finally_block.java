package Java_projects;

public class finally_block {
public static int greet(){
    try {
        int a=50;
        int b=10;
        int c=a/b;
        return c;

    }catch (Exception e){
        System.out.println(e);
    }
   finally {
        System.out.println("this is the end of this function");

    }
    return 0;
}
    public static void main(String[] args) {
    int k= greet();
        System.out.println(k);
        int a=7,b=9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
        }
            finally {
                System.out.println("i am finally  b=    " +b);
            }
            b--;
            }
        try {
            float x = 5 / 3f;
            System.out.println(x);
        }
        finally {
            System.out.println("this is finally");
        }
    }
}
