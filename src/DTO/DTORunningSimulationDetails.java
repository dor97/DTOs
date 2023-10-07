package DTO;

import java.util.Map;

public class DTORunningSimulationDetails implements Cloneable{
    private DTOException exception = new DTOException();
    private Map<String, Integer> entities;
    private Integer tick;
    private Long time;

    public DTOException getException(){
        return exception;
    }

    public void setEntities(Map<String, Integer> entities){
        this.entities = entities;
    }

    public void setTick(Integer tick){
        this.tick = tick;
    }

    public void setTime(Long time){
        this.time = time;
    }

    public Map<String, Integer> getEntities(){
        return entities;
    }

    public Integer getTick(){
        return tick;
    }

    public Long getTime(){
        return time;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
