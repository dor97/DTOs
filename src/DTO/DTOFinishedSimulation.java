package DTO;

import java.util.List;

public class DTOFinishedSimulation {
    private List<Integer> finishedSimulation;
    private DTOException exception = new DTOException();

    public DTOException getException(){
        return exception;
    }

    public List<Integer> getFinishedSimulation(){
        return finishedSimulation;
    }

    public void setFinishedSimulation(List<Integer> finishedSimulation){
        this.finishedSimulation = finishedSimulation;
    }
}
