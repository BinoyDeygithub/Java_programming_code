package Java_projects;
import java.util.*;
public class Mark_Percentage {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your Physics marks : ");
            int physics = scan.nextInt();
            System.out.println("Enter your English marks : ");
            int English = scan.nextInt();
            System.out.println("Enter your Chemistry marks : ");
            int chemistry = scan.nextInt();
            System.out.println("Enter your Mathematics marks : ");
            int mathematics = scan.nextInt();
            System.out.println("Enter your Computer Science marks : ");
            int computer = scan.nextInt();

            float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

            System.out.println("percentage : ");
            System.out.println(percentage);


        }
}
