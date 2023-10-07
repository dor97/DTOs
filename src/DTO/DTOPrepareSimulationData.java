package DTO;

import java.util.Map;

public class DTOPrepareSimulationData {
    private Integer requestId;
    private String userName;
    private Map<String, String> environmentsValues;
    private Map<String, Integer> entitiesPopulation;

    public DTOPrepareSimulationData(Integer requestId, String userName, Map<String, String> environmentsValues, Map<String, Integer> entitiesPopulation){
        this.requestId = requestId;
        this.userName = userName;
        this.environmentsValues = environmentsValues;
        this.entitiesPopulation = entitiesPopulation;
    }

    public Integer getRequestId(){
        return requestId;
    }

    public String getUserName(){
        return userName;
    }

    public Map<String, String> getEnvironmentsValues(){
        return environmentsValues;
    }

    public Map<String, Integer> getEntitiesPopulation(){
        return entitiesPopulation;
    }
}
