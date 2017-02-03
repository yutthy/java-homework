import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by uyutthy on 1/12/2017.
 */
public class Developer extends Employee implements View{

    private String comment;

    public Developer(String firstName, String lastName, Calendar birthDate, Double salary, String comment, int holiday, int years ){
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
        setSalary(salary);
        setHoliday(holiday);
        setYears(years);
        this.comment = comment;
    }

    public String getDataView(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String displayData = "";
        String fullName = getFirstName() + " " + getLastName();

        displayData += "ID : ";
        displayData += getId();
        displayData += "\n";

        displayData += "Full Name : ";
        displayData += fullName;
        displayData += "\n";

        displayData += "Comment : ";
        displayData += comment;
        displayData += "\n";

        displayData += "Salary : ";
        displayData += Double.toString(getSalary());
        displayData += "\n";

        displayData += "Created Date : ";
        displayData += format.format(getcreatedDate().getTime()).toString();
        displayData += "\n";

        displayData += "Created By : ";
        displayData += getCreatedBy();
        displayData += "\n";

        return displayData;
    }
}
