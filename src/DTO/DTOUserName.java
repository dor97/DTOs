package DTO;

import java.util.ArrayList;
import java.util.List;

public class DTOUserName {
    //private String userName;
    private List<DTOEnvironmentVariablesValues> environmentVariablesValuesList = new ArrayList<>();
    private DTOException exception = new DTOException();

//    public String getUserName(){
//        return  userName;
//    }
//
//    public void setUserName(String userName){
//        this.userName = userName;
//    }
    public List<DTOEnvironmentVariablesValues> getEnvironmentVariablesValuesList() {
        return environmentVariablesValuesList;
    }

    public void setEnvironmentVariablesValuesList(List<DTOEnvironmentVariablesValues> environmentVariablesValuesList) {
        this.environmentVariablesValuesList = environmentVariablesValuesList;
    }

    public DTOException getException() {
        return exception;
    }
}
