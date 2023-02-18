package Java_projects;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "i am two String";
    }

    @Override
    public String getMessage() {
        return "i am get message";
    }
}
public class exceptionclass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if(a<9){
            try {
              //  throw new MyException();
                throw new ArithmeticException("this is an exception");

            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finish");
            }
            System.out.println("yes finish");
        }
    }
}
