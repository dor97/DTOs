package DTO;

import java.util.List;

public class DTOAllRequestData {
    private List<DTORequestData> requestDataList;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setRequestDataList(List<DTORequestData> requestDataList){
        this.requestDataList = requestDataList;
    }

    public List<DTORequestData> getRequestDataList(){
        return requestDataList;
    }
}
