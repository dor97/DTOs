package DTO;

public class DTOSimulationIdAndUserName {
    private String userName;
    private Integer id;

    public DTOSimulationIdAndUserName(){

    }

    public DTOSimulationIdAndUserName(String userName, Integer id){
        this.userName = userName;
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setId(Integer id){
        this.id = id;
    }
}
