package Java_projects;

public class MultiplicationsTable {
    public static void main(String[] args) {
                int n = 5;
        //for(int i=0; i<10; i++) //- Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
//        int n = 10;------------------->Reverse Order
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }
    }
}
