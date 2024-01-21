package rd.odev8;

public class AssignmentList {
    private String taskname;
    private String taskstatus;

    public AssignmentList(String taskname, String taskstatus) {
        this.taskname = taskname;
        this.taskstatus = taskstatus;
    }

    public String getTaskname(){
        return this.taskname;
    }

    public String getTaskStatus(){
        return this.taskstatus;
    }

    public void setTaskStatus(String taskstatus){
        this.taskstatus = taskstatus;
    }


}
