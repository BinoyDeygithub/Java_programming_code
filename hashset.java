package Java_projects;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer>myhash =new HashSet<>(6,0.6f);
        myhash.add(78);
        myhash.add(68);
        myhash.add(82);
        myhash.add(89);
        System.out.println(myhash);
    }
}
