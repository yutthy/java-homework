/**
 * Created by uyutthy on 12/24/2016.
 */
public class Employee extends Person{
    private String position;
    private String email;

    public void setPosition(String position){
        this.position = position;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void eat(){
        System.out.println("Eating at home");
    }

    public void work(){
        System.out.printf("%s is working \n", getName());
    }
}
