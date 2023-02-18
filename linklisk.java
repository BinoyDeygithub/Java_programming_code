package Java_projects;

import java.util.LinkedList;

public class linklisk {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(23);
        l2.add(238);
        l2.add(28);
        l1.add(8);

        l1.add(4);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(1));
        l1.set(1,777);
        l1.addLast(9);
        l1.addFirst(999);
        l1.add(2,88);
//l1.clear();

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
    }
}



