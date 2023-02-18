package Java_projects;

public class excerr_handletrycatch {
    public static void main(String[] args) {
        int a=8000;int b=0;
        try{
        int c=a/b;
            System.out.println("the result    "  + c);
        }
        catch (Exception e){
            System.out.println("we failed to devided    "+e);
        }
    }
}
