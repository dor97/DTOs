package DTO;

public class DTOStartSimulation {

    //private Integer requestId;
    private String userName;

    public DTOStartSimulation(String userName){
        //this.requestId = requestId;
        this.userName = userName;
    }

//    public Integer getId(){
//        return requestId;
//    }

    public String getUserName(){
        return userName;
    }
}
