package DTO;

import java.util.ArrayList;
import java.util.List;

public class DTOFinishedSimulationForAdmin {
    private List<DTOSimulationIdAndUserName> simulationIdAndUserNames = new ArrayList<>();
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }
    public void setSimulationIdAndUserNames(List<DTOSimulationIdAndUserName> simulationIdAndUserNames){
        this.simulationIdAndUserNames = simulationIdAndUserNames;
    }

    public List<DTOSimulationIdAndUserName> getSimulationIdAndUserNames(){
        return simulationIdAndUserNames;
    }
}
