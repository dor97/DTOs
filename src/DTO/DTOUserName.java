package DTO;

public class DTOUserName {
    private String userName;

    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }
}
