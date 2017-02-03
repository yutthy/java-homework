import java.text.SimpleDateFormat;

/**
 * Created by uyutthy on 1/12/2017.
 */
public class TeamLeader extends Employee implements View {
    private int projectNum;

    public int getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(int projectNum) {
        this.projectNum = projectNum;
    }

    public String getDataView(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        StringBuffer displayData = new StringBuffer();
        displayData.append("ID : " );
        displayData.append(getId());
        displayData.append("\n");

        String fullName = getFirstName() + " " + getLastName();
        displayData.append("Full Name : " );
        displayData.append(fullName.toUpperCase());
        displayData.append("\n");

        displayData.append("Number of Projects : ");
        displayData.append(getProjectNum());
        displayData.append("\n");

        displayData.append("Created Date : ");
        displayData.append(format.format(getcreatedDate().getTime()).toString());
        displayData.append("\n");

        displayData.append("Created By : ");
        displayData.append(getCreatedBy());
        displayData.append("\n");

        return displayData.toString();
    }


}
