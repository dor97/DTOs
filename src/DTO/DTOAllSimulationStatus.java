package DTO;

import java.util.Map;

public class DTOAllSimulationStatus {

    private Map<Integer, Status> simulationStatus;
    private DTOException exception = new DTOException();

    public DTOAllSimulationStatus(){
    }

    public DTOAllSimulationStatus(Map<Integer, Status> simulationStatus){
        this.simulationStatus = simulationStatus;
    }

    public DTOException getException(){
        return exception;
    }

    public void setSimulationStatus(Map<Integer, Status> simulationStatus){
        this.simulationStatus = simulationStatus;
    }

    public Map<Integer, Status> getSimulationStatus(){
        return simulationStatus;
    }
}
