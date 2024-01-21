package rd.odev8;


abstract class Employee {
    protected String name;
    protected String surname;
    protected String dateOfBirth;


    public Employee(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}