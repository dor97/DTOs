package DTO;

public class DTOSimulationError {
    private String error;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }
    public void setError(String error){
        this.error = error;
    }

    public String getError(){
        return error;
    }
}
