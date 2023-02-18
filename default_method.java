package Java_projects;
interface camera {
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
    interface Wifi {
        String[] getNet();

        void network(String netwo);


    }

    class myCellPhone {
        void call(int number) {
            System.out.println("calling..." + number);
        }

        void pickcall(int number) {
            System.out.println("conneting...");
        }

    }

    class smartphone extends myCellPhone implements Wifi, camera {

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

public class default_method {
    public static void main(String[] args) {
        smartphone sm = new smartphone();
        sm.record();
        sm.call(900000);

        String[] ar = sm.getNet();

        for ( String item: ar ) {
            System.out.println(item);

        }

    }
}

