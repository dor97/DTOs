package DTO;

import java.util.List;

public class DTOWorldDifenichanCollecen {
    private List<String> worldDifenichanCollecen;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public void setWorldDifenichanCollecen(List<String> worldDifenichanCollecen){
        this.worldDifenichanCollecen = worldDifenichanCollecen;
    }

    public List<String> getWorldDifenichanCollecen(){
        return worldDifenichanCollecen;
    }
}
