package DTO;

public class DTOAskToRunASimulation {
    private String simulationName;
    private String userName;
    private Integer amountToRun;
    private Integer ticks;
    private Integer sec;

    public DTOAskToRunASimulation(String simulationName, String userName, Integer amountToRun, Integer ticks, Integer sec){
        this.simulationName = simulationName;
        this.userName = userName;
        this.amountToRun = amountToRun;
        this.ticks = ticks;
        this.sec = sec;
    }

    public String getSimulationName(){
        return simulationName;
    }

    public String getUserName(){
        return userName;
    }

    public Integer getTicks(){
        return ticks;
    }

    public Integer getSec(){
        return sec;
    }

    public Integer getAmountToRun(){
        return amountToRun;
    }

    public void setTicks(Integer ticks){
        this.ticks = ticks;
    }

    public void setSec(Integer sec){
        this.sec = sec;
    }
}
