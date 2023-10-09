package DTO;

import java.util.Map;

public class DTOPostRunPrepareSimulationData {
    private Map<String, String> environmentsValues;
    private Map<String, Integer> entitiesPopulation;
    private DTOException exception = new DTOException();


    public DTOPostRunPrepareSimulationData() {

    }
    public DTOPostRunPrepareSimulationData(Map<String, String> environmentsValues, Map<String, Integer> entitiesPopulation) {
        this.environmentsValues = environmentsValues;
        this.entitiesPopulation = entitiesPopulation;
    }

    public DTOException getException(){
        return exception;
    }

    public Map<String, String> getEnvironmentsValues() {
        return environmentsValues;
    }

    public void setEnvironmentsValues(Map<String, String> environmentsValues) {
        this.environmentsValues = environmentsValues;
    }

    public Map<String, Integer> getEntitiesPopulation() {
        return entitiesPopulation;
    }

    public void setEntitiesPopulation(Map<String, Integer> entitiesPopulation) {
        this.entitiesPopulation = entitiesPopulation;
    }
}
