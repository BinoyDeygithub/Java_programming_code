package Java_projects;

import java.util.Scanner;

public class exception_handle {
    public static void main(String[] args) {
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        int kk;

      //g  System.out.println("k is    " + 1000 / kk);
        try {
            Scanner sc = new Scanner(System.in);
            kk = sc.nextInt();
            int c = 1000 / kk;
            System.out.println(c);
        }
catch (Exception e){

    System.out.println("its wrong " +e);
    }

    }
}