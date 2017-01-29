package com.example.nina.firebaseturorial;

/**
 * Created by Nina on 28.01.2017.
 */
public class Grant {

    private String grantName;
    private String grantDescription;
    private String deadline;

    public Grant() {}

    public Grant(String grantName, String grantDescription, String deadline){
        this.grantName = grantName;
        this.grantDescription = grantDescription;
        this.deadline = deadline;

    }
    public String getGrantName() {
        return grantName;
    }

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    public String getGrantDescription() {
        return grantDescription;
    }

    public void setGrantDescription(String grantDescription) {
        this.grantDescription = grantDescription;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }



}
