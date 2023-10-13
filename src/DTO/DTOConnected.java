package DTO;

public class DTOConnected {
    private Boolean connected;
    private DTOException exception = new DTOException();

    public DTOException getException() {
        return exception;
    }


    public void setConnected(Boolean connected){
        this.connected = connected;
    }

    public Boolean getConnected(){
        return connected;
    }

}
