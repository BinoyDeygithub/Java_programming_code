package Java_projects;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        int []marks= new int[7];
        marks[0]=5;
        marks[1]=53;
        marks[2]=59;
        marks[3]=58;
        Scanner sc=new Scanner(System.in);
        boolean flag = true;
        while (flag){
        System.out.println("enter");
        int ind=sc.nextInt();
        try{
            System.out.println("welcome ...........");
            try {
                System.out.println(marks[ind]);
                flag=false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index does not exits");
                System.out.println("exception is level 2");

            }
        }
        catch (Exception e){
            System.out.println("exception is level 1");
        }
    }
        System.out.println("thanks");
    }
}
