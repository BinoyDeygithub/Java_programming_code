package Java_projects;
class c1{
   public int x=4;
   protected int y=22;
   int z=6;
   private int u=66;
   public void met1(){

       System.out.println(x);
       System.out.println(z);
       System.out.println(y);
       System.out.println(u);

   }
}

public class accessmodifier {
    public static void main(String[] args) {
c1 c= new c1();
//c.met1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.u);

    }
}
