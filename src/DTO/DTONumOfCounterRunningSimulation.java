package DTO;

public class DTONumOfCounterRunningSimulation {
    private Integer numOfRunningSimulation;

    private DTOException exception = new DTOException();


    public DTONumOfCounterRunningSimulation(){

    }

    public DTONumOfCounterRunningSimulation(Integer numOfRunningSimulation){
        this.numOfRunningSimulation = numOfRunningSimulation;
    }
    public DTOException getException(){
        return exception;
    }
    public Integer getNumOfRunningSimulation(){
        return numOfRunningSimulation;
    }

    public void setNumOfRunningSimulation(Integer numOfRunningSimulation){
        this.numOfRunningSimulation = numOfRunningSimulation;
    }
}
