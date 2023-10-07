package DTO;

import java.util.List;

public class DTOResultOfPrepareSimulation {
    private List<DTOEnvironmentVariablesValues> environmentVariablesValuesList;
    private DTOException exception = new DTOException();

    public DTOResultOfPrepareSimulation(){
        int x = 1;
    }

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
