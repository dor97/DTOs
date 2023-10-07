package DTO;

public class DTORequestData {
    private String simulationName;
    private Integer simulationId;
    private String userName;
    private Integer requestId;

    public DTORequestData(String simulationName, Integer simulationId, String userName){
        this.simulationName = simulationName;
        this.simulationId = simulationId;
        this.userName = userName;
    }
    public DTORequestData(){
    }

    public void setSimulationId(Integer simulationId){
        this.simulationId = simulationId;
    }

    public void setSimulationName(String simulationName){
        this.simulationName = simulationName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setRequestId(Integer requestId){
        this.requestId = requestId;
    }

    public Integer getRequestId(){
        return requestId;
    }

    public String getUserName(){
        return userName;
    }

    public String getSimulationName(){
        return simulationName;
    }

    public Integer getSimulationId(){
        return simulationId;
    }
}
