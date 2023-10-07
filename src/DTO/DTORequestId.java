package DTO;

public class DTORequestId {
    private Integer requestId;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setRequestId(Integer requestId){
        this.requestId = requestId;
    }

    public Integer getRequestId(){
        return requestId;
    }
}
