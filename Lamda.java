package Java_projects;

@FunctionalInterface
interface methodss {
    void meth6(int a);
}//------------->
//class BinoyFunk implements methodss{
//
//    @Override
//    public void meth6() {
//        System.out.println("i am meth6");
//
//    }
//}////------------>>>>>>>>>>>>
//    void meth7();
//}
//class anomydemo1 implements methodss{
//    public void dis()
//    {
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth6() {
//        System.out.println("i am meth6");
//    }
//
//    @Override
//    public void meth7() {
//        System.out.println("i am meth7");
//
//    }
//}
public class Lamda {

    public static void main(String[] args) {
     //  methodss obj= new anomydemo1();
       // obj.meth6();
        // annonimus class----->
//        methodss obj = new methodss() {
//            @Override
//            public void meth6() {
//                System.out.println("i am meth6");
//
//            }
//
//            @Override
//            public void meth7() {
//                System.out.println("i am meth7");
//
//            }
//        };
//        obj.meth6();//<--------------end annonimus class.
        // lambda expression
     //   BinoyFunk obj= new BinoyFunk();
      //  obj.meth6();
        //----------->>>>>>>>>>>>>>>>>>>>>
        methodss obj=(a)->{  System.out.println("i am method 6          "  +a);
        };
        obj.meth6(9);
    }
}
