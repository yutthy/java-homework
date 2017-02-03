import java.util.Calendar;

/**
 * Created by uyutthy on 1/12/2017.
 */
public abstract class Person extends DCommon {

    private Calendar birthDate;
    private String lastName;
    private String firstName;

    protected Calendar getBirthDate() {
        return birthDate;
    }

    protected void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
