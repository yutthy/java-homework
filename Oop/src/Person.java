/**
 * Created by uyutthy on 12/24/2016.
 */
public class Person {
    private int i;
    private String s;
    private int j;

    private String name;
    private int age;


    public Person(){
        System.out.println("Constructor No Param");
    }

    public Person(int i){

        this.i = i;
        System.out.println("Constructor With 1 Param I = " + i);
    }

    public Person(int i, String s, int j){
        this.i = i;
        this.s = s;
        this.j = j;
        System.out.printf("Constructor With 3 Params; Param1 I = is %d, Param2 is S = %s, Param3 is J = %d \n", i, s, j);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void eat(){
        System.out.printf("%s is Eating \n", this.name);
    }

}
