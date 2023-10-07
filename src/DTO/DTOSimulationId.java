package DTO;

public class DTOSimulationId {
    private Integer simulationId;
    private DTOException exception = new DTOException();

    public DTOSimulationId(){
    }
    public DTOSimulationId(Integer simulationId){
        this.simulationId = simulationId;
    }

    public DTOException getException(){
        return exception;
    }

    public Integer getSimulationId(){
        return simulationId;
    }

    public void setSimulationId(Integer simulationId){
        this.simulationId = simulationId;
    }
}
