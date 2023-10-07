package DTO;

import java.util.Map;

public class DTOAllSimulationApprovementManager {
    private Map<Integer, DTOsimulationApprovementManager> manager;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setManager(Map<Integer, DTOsimulationApprovementManager> manager){
        this.manager = manager;
    }

    public Map<Integer, DTOsimulationApprovementManager> getManager(){
        return manager;
    }
}
