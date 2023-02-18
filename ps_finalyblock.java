package Java_projects;

import java.util.Scanner;

public class ps_finalyblock {
    public static void main(String[] args) {
        //prob1
        try{
            int a=666/0;
        }
        catch (IllegalAccessError e){
            System.out.println("haha");
        }
        catch (ArithmeticException e){
            System.out.println("hehee");
        }
        //prob3
        boolean flag=true;
        int []marks1=new int[3];
        marks1[0]=7;
        marks1[1]=73;
        marks1[2]=87;
        Scanner sc= new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
try {


            index= sc.nextInt();
            System.out.println("the value of mark is    "+marks1[index]);
            break;
            }catch (Exception e){
    System.out.println("invalid index");
    i++;
            }
        }
        if(i>=5){
            System.out.println("error");
        }
    }
}
