package Java_projects;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructer {
    public static void main(String[] args) {
        //MyMainEmployee binoy = new MyMainEmployee("binoy dey programmer", 12);
        MyMainEmployee binoy = new MyMainEmployee();
        //binoy.setName("CodeWithHarry");
        //binoy.setId(34);
        System.out.println(binoy.getId());
        System.out.println(binoy.getName());
    }
}
