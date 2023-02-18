package Java_projects;

public class Sum_Multiplication_table {
    public static void main(String[] args) {
                int n = 8;
        int sum = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);

    }
}
