import java.util.*;

/**
 * Created by uyutthy on 1/12/2017.
 */
public class Main {


    public static void main(String args[]){
        List<View> lists = new ArrayList<>();
        //SimpleDateFormat df = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss a");

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1992, 10, 28);

        Employee employee = new Employee();
        employee.setcreatedDate(Calendar.getInstance());
        employee.setCreatedBy(1);
        employee.setState(1);
        employee.setVersion(1);
        employee.setFirstName("Uong");
        employee.setLastName("Yutthy");
        employee.setBirthDate(birthDate);
        employee.setYears(10);
        employee.setHoliday(10);
        employee.setSalary(650.00);

        lists.add(employee);

        Calendar birthDate1 = Calendar.getInstance();
        birthDate1.set(1992, 10, 28);
        Developer developer = new Developer("Uong", "Yutthy", birthDate1, 780.25, "Nothing", 10, 10);
        developer.setcreatedDate(Calendar.getInstance());
        developer.setCreatedBy(1);
        developer.setState(1);
        developer.setVersion(1);
        lists.add(developer);

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setcreatedDate(Calendar.getInstance());
        teamLeader.setCreatedBy(1);
        teamLeader.setState(1);
        teamLeader.setVersion(1);
        teamLeader.setFirstName("Uong");
        teamLeader.setLastName("Yutthy");
        teamLeader.setBirthDate(birthDate);
        teamLeader.setYears(10);
        teamLeader.setHoliday(10);
        teamLeader.setSalary(650.00);
        teamLeader.setProjectNum(1);
        lists.add(teamLeader);


        Iterator<View> it = lists.iterator();
        while(it.hasNext()){
            View object = it.next();
            System.out.println(object.getDataView());

            System.out.println("*********************************************");
        }
    }

}
