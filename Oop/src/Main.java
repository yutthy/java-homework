/**
 * Created by uyutthy on 12/24/2016.
 */
public class Main {

    public static void main(String[] arg){
        Person p1 = new Person();
        Person p2 = new Person(1);
        Person p3 = new Person(100, "Sophea", 33);

        Car c     = new Car(4, 5, "Black");
        c.drive();


        Line l    = new Line();
        l.draw();
        Box  b    = new Box();
        b.draw();
        Rectangle r = new Rectangle();
        r.draw();

        Gragphic obj1 = new Line();
        Gragphic obj2 = new Box();
        Gragphic obj3 = new Rectangle();

        obj1.draw();
        obj2.draw();
        obj3.draw();

        Employee employee = new Employee();
        employee.setName("Uong Yutthy");
        employee.setAge(24);
        employee.setPosition("Programmer");
        employee.setEmail("uongyutthy777@gmail.com");

        employee.eat();
        employee.work();

        Person p =  new Employee();
        //if u want to call Person Object with function employee we need to case it
        p.setName("Uong Yutthy");
        ((Employee)p).work();


        X ob = new X();
        double result;
        ob.methodA(20);
        ob.methodA(20,30);
        result = ob.methodA(5.5);
        System.out.println("Answer is: " + result);


        Person per = null;
        per = (Begger) new Begger();
        per.eat();

        per = (Employee) new Employee();
        per.eat();

        per = (BussinessMan) new BussinessMan();
        per.eat();

        per = (Person) new Person();
        per.eat();

    }
}
