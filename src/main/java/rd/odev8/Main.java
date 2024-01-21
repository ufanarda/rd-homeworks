package rd.odev8;


public class Main {
    public static void main(String[] args) {


        TeamLead teamLead1 = new TeamLead("Arda", "Mildanoğlu", "13-11-1984");
        TeamLead teamLead2 = new TeamLead("Ali", "Veli", "13-11-1980");

        Department department = new Department();
        department.CreateTeam(teamLead1);

        Female member1 = new Female("Özge", "Şen", "01-01-1900");
        Female member2 = new Female("Nilsu", "Oktay", "01-01-1800");
        Male member3 = new Male("Veli", "Kaya", "01-01-1990");
        Male member4 = new Male("Serhat", "Coşkun", "01-01-1800");

        AssignmentList task1 = new AssignmentList("Project A","Başlamadı");
        AssignmentList task2 = new AssignmentList("Project B","Başlamadı");
        AssignmentList taskfinished = new AssignmentList("Project B","Başlamadı");



        System.out.println("---------------");
        System.out.println("---------------");

        department.addAssignment(task1);

        System.out.println("---------------");
        System.out.println("---------------");

        department.addTeam(member1);
        department.addTeam(member2);
        department.addTeam(member3);


        // Team Lead Değiştirme

        System.out.println("Mevcut takım lideri: "+department.getTeamLead());
        department.getEmployeeList();
        department.changeTeamLead(teamLead2,teamLead1);
        System.out.println("Yeni takım lideri: "+department.getTeamLead());
        department.getEmployeeList();

        System.out.println("---------------");
        System.out.println("---------------");

        // Görev değiştirme
        department.getAssignments(task1);
        department.updateAssigmentStatus(task1,"tamamlandı.");
        department.getAssignments(task1);

        System.out.println("---------------");
        System.out.println("---------------");

        // Takım çalışanı Dğiştirme
        department.getEmployeeList();
        department.removeTeam(member2);
        department.getEmployeeList();
        department.addTeam(member4);
        department.getEmployeeList();

        System.out.println("---------------");
        System.out.println("---------------");

        // Emeklilik durumlarını göster

        System.out.println("Retirement age for " + member1.name + ": " + member1.retirementStatus());
        System.out.println("Retirement age for " + member2.name + ": " + member2.retirementStatus());
        System.out.println("Retirement age for " + member3.name + ": " + member3.retirementStatus());
        System.out.println("Retirement age for " + member4.name + ": " + member4.retirementStatus());

        System.out.println("---------------");
        System.out.println("---------------");







    }
}
