package DTO;

import java.util.Map;

public class DTOThreadPoolDetails {
    private Map<String, Integer> threadPoolDetails;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setThreadPoolDetails(Map<String, Integer> threadPoolDetails){
        this.threadPoolDetails = threadPoolDetails;
    }

    public Map<String, Integer> getThreadPoolDetails(){
        return threadPoolDetails;
    }
}
