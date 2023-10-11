package DTO;

public class DTOIsThereAdmin {
    private Boolean AdminExist;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public Boolean getAdminExist() {
        return AdminExist;
    }

    public void setAdminExist(Boolean adminExist) {
        AdminExist = adminExist;
    }
}
