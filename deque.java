package Java_projects;

import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer>ad1=new ArrayDeque<>();
        ad1.add(9);
        ad1.add(99);
        ad1.addFirst(66);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
