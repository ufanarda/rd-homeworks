package rd.odev8;


class Male extends Employee implements RetirementStatus {

    public Male(String name, String surname, String dateOfBirth) {
        super(name, surname, dateOfBirth);
    }


    @Override
    public String retirementStatus() {
        String retirementStatus;
        if(dateOfBirth.equals("01-01-1800")){
            retirementStatus = "Emekli olabilir";
        } else
            retirementStatus="Çalışmaya devam";

        return retirementStatus;
    }

}