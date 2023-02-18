package Java_projects;
class MyEmployee{
    private int id;
    private String name;

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
public class Getter_Setter {

    public static void main(String[] args) {
        MyEmployee binoy = new MyEmployee();
        // binoy.id = 45;
        // binoy.name = "Binoyprogrammer"; --> Throws an error due to private access modifier
        binoy.setName("CodeWithHarry");
        System.out.println(binoy.getName());
        binoy.setId(234);
        System.out.println(binoy.getId());
}}
