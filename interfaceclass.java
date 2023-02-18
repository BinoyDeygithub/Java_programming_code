package Java_projects;
interface bycycle{
    int a= 55;
    void breakup(int dec);
    void speedup( int inc);
}
interface horncycl{
    void ho();
    void rn();
}

class avon implements bycycle , horncycl{
    void horn (){
        System.out.println(" peeeeeeeeeee");
    }
   public void breakup (int dec){
        System.out.println( "applying break");
    }
    public void speedup(int inc){
        System.out.println("appling speed");
    }

    public void rn() {
        System.out.println(" pooooo");
    }


    public void ho() {
        System.out.println("piccc");
    }
}
public class interfaceclass {
    public static void main(String[] args) {
avon c = new avon();

c.speedup(5);
        System.out.println(c.a);
        c.ho();
        c.rn();
    }
}
