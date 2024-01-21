package rd.odev8;


import java.util.ArrayList;
import java.util.List;

class Department {
    private TeamLead teamLead;
    private List<Employee> employeeList;
    private List<AssignmentList> assignmentList;


    public void CreateTeam(TeamLead teamLead) {
        this.teamLead = teamLead;
        this.employeeList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
        this.employeeList.add(teamLead);
    }

    public void addTeam(Male male) {
        System.out.println(male.name + " ekibe eklendi");
        employeeList.add(male);
    }

    public void addTeam(Female female) {
        System.out.println(female.name + " ekibe eklendi");
        employeeList.add(female);
    }

    public void removeTeam(Male male) {
        System.out.println(male.name + " ekipten çıkartıldı");
        employeeList.remove(male);
    }

    public void removeTeam(Female female) {
        System.out.println(female.name + " ekipten çıkartıldı");
        employeeList.remove(female);
    }

    public void getEmployeeList(){
        System.out.println("Mevcut takımda çalışanlar" + this.employeeList);
    }


    public void changeTeamLead(TeamLead newTeamLeadLead , TeamLead oldTeamLeadLead) {
        employeeList.remove(oldTeamLeadLead);
        employeeList.add(newTeamLeadLead);
        teamLead = newTeamLeadLead;
    }


    public void addAssignment(AssignmentList assignmentList) {
        System.out.println(assignmentList.getTaskname() + " görevi eklendi");
        this.assignmentList.add(assignmentList);
    }

    public void updateAssigmentStatus(AssignmentList assignmentList, String taststatus) {
        assignmentList.setTaskStatus(taststatus);
    }

    public void getAssignments(AssignmentList task) {
        System.out.println(task.getTaskname() + " görevi " + task.getTaskStatus());
    }


    public String getTeamLead() {
        return teamLead.name;
    }


}
