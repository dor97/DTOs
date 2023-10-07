package DTO;

public class DTOSimulationStatus {
    private Status simulationStatus;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setSimulationStatus(Status simulationStatus){
        this.simulationStatus = simulationStatus;
    }

    public Status getSimulationStatus(){
        return simulationStatus;
    }
}
