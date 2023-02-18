package Java_projects;
interface camera2 {
    void takeSnap();

    void video();
    private void greet(){
        System.out.println("good morning");
    }

    default void record(){
        greet();
        System.out.println("recording 4k");
    }
}
interface Wifi2 {
    String[] getNet();

    void network(String netwo);


}

class myCellPhone2 {
    void call(int number) {
        System.out.println("calling..." + number);
    }

    void pickcall(int number) {
        System.out.println("conneting..."+number);
    }

}

class smartphone2 extends myCellPhone2 implements Wifi2, camera2 {

    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void video() {
        System.out.println("taking video");
    }


    public String[] getNet() {
        System.out.println("grtting list of network");
        String[] networklist = {"binoy", "lol", "bol" };
        return networklist;
    }

    public void network(String netWo) {
        System.out.println("connecting to..." + netWo);
    }

}
public class polymorphysm {
    public static void main(String[] args) {
        camera2 cam2= new smartphone2();
        cam2.video();
        smartphone2 s= new smartphone2();
        s.pickcall(6666);
        s.takeSnap();
    }
}
