package DTO;

public class DTOIsSimulationRunning {
    private Boolean isSimulationRunning;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setIsSimulationRunning(Boolean isSimulationRunning){
        this.isSimulationRunning = isSimulationRunning;
    }

    private Boolean getIsSimulationRunning(){
        return isSimulationRunning;
    }
}
