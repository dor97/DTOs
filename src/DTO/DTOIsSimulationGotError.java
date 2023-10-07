package DTO;

public class DTOIsSimulationGotError {
    private Boolean isSimulationGotError;
    private DTOException exception = new DTOException();

    public DTOIsSimulationGotError(){

    }

    public DTOException getException(){
        return exception;
    }

    public void setIsSimulationGotError(Boolean isSimulationGotError){
        this.isSimulationGotError = isSimulationGotError;
    }

    public Boolean getIsSimulationGotError(){
        return isSimulationGotError;
    }
}
