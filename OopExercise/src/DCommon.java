import java.util.Calendar;

/**
 * Created by uyutthy on 1/12/2017.
 */
public abstract class DCommon {
    private static int autoIncrement;

    private int id;
    private Calendar createdDate;
    private Calendar updatedDate;
    private int createdBy;
    private Integer updatedBy;
    private int state;
    private int version;

    public DCommon(){
        autoIncrement = autoIncrement + 1;
        setId();
    }

    private void setId(){
        this.id = autoIncrement;
    }

    protected int getId(){
        return this.id;
    }

    protected Calendar getcreatedDate() {
        return createdDate;
    }

    protected void setcreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    protected Calendar getUpdatedDate() {
        return updatedDate;
    }

    protected void setUpdatedDate(Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    protected int getCreatedBy() {
        return createdBy;
    }

    protected void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    protected Integer getUpdatedBy() {
        return updatedBy;
    }

    protected void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    protected int getState() {
        return state;
    }

    protected void setState(int state) {
        this.state = state;
    }

    protected int getVersion() {
        return version;
    }

    protected void setVersion(int version) {
        this.version = version;
    }
}
