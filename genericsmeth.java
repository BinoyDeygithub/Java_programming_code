package Java_projects;


import java.util.ArrayList;
class myGeneric<T1, T2>{
    int val =888;
   private T1 t1;
   private T2 t2;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public myGeneric(int val, T1 t1 , T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2=t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public myGeneric(int val , int t1){

   }
}
public class genericsmeth {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);

        int x = myArrayList.get(0);
       // System.out.println(x);
        myGeneric<String, Integer> g1= new myGeneric(45,"binoy",88);
String str3 =g1.getT1();
Integer str4 =g1.getT2();
        System.out.println(str3);
        System.out.println(str4 + str4);
    }
}
