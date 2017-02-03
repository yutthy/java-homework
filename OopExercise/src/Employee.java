import java.text.SimpleDateFormat;

/**
 * Created by uyutthy on 1/12/2017.
 */
public class Employee extends Person implements View {

    private double salary;
    private int holiday;
    private int years;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String getDataView() {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String displayData = "";
        displayData += "ID : ";
        displayData += getId();
        displayData += "\n";

        displayData += "First Name : ";
        displayData += getFirstName();
        displayData += "\n";

        displayData += "Last Name : ";
        displayData += getLastName();
        displayData += "\n";

        displayData += "Date of Birth : ";
        displayData += format.format(getBirthDate().getTime()).toString();
        displayData += "\n";

        displayData += "Working Years : ";
        displayData += Integer.toString(getYears());
        displayData += "\n";

        displayData += "Holiday : ";
        displayData += Integer.toString(getHoliday());
        displayData += "\n";

        displayData += "Salary : $ ";
        displayData += Double.toString(getSalary());
        displayData += "\n";

        displayData += "Created Date : ";
        displayData += format.format(getcreatedDate().getTime()).toString();
        displayData += "\n";

        displayData += "Created By : ";
        displayData += getCreatedBy();
        displayData += "\n";

        return displayData ;
    }
}
