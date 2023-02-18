package Java_projects;

import java.util.Scanner;

public class exceperhandle1 {
    public static void main(String[] args) {
        int []marks= new int[7];
        marks[0]=5;
        marks[1]=53;
        marks[2]=59;
        marks[3]=58;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arry index");
      int ind=  sc.nextInt();

        System.out.println("enter the the number you want to devided");
        int number=  sc.nextInt();
        try {
            System.out.println("the value at array index   "+marks[ind]);
            System.out.println("the value of array value/number is   "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("someArithmeticException  occour");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("some ArrayIndexOutOfBoundsexception occour");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some other exception occour");
            System.out.println(e);
        }
    }
}
