package Java_projects;

//import static java.math.BigDecimal.divide;
class Negative extends Exception{
    @Override
    public String toString() {
        return "radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negative";
    }
}
public class throw_throws {
    public static double area(int r)throws Negative{
        if(r<0){
            throw new  Negative();
        }
       double result = Math.PI*r *r;
       return result;
    }
   public static int divide(int a , int b) throws ArithmeticException{
        //made by me
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        //made by other ----> uses divided function by me
        try {
           // int c =divide(6,0);
           // System.out.println(c);
            double ar=area(6);
            System.out.println(ar);



        }
        catch (Exception e){
            System.out.println("exception");
        }
    }
}
