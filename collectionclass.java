package Java_projects;

import java.util.*;



public class collectionclass {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(6);
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
        l1.add(2,88);
//l1.clear();

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
    }
}

