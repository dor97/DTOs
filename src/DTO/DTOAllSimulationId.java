package DTO;

import java.util.List;

public class DTOAllSimulationId {
    private List<Integer> allSimulationId;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public List<Integer> getAllSimulationId() {
        return allSimulationId;
    }

    public void setAllSimulationId(List<Integer> allSimulationId) {
        this.allSimulationId = allSimulationId;
    }
}
