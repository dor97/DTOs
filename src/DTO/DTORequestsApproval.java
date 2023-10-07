package DTO;

public class DTORequestsApproval {
    private Integer id;
    private String request;

    public DTORequestsApproval(Integer id, String request){
        this.id = id;
        this.request = request;
    }

    public Integer getId(){
        return id;
    }

    public String getRequest(){
        return request;
    }
}
