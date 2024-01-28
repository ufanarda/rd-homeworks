package rd.odev11;

import javax.management.relation.RelationServiceNotRegisteredException;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("SINGLETON ÖRNEĞİ");
        /// SINGLETON

        Singleton singletonExp1 = Singleton.getInstance();
        Singleton singletonExp2 = Singleton.getInstance();


        System.out.println("Instence address of singletonExp1" + singletonExp1);
        System.out.println("Mwessage from singletonExp2" + singletonExp2.msg);



        System.out.println("==================================================");
        System.out.println("==================================================");


        System.out.println("BUILDER ÖRNEĞİ");
        Register newregister = Register.RegisterBuilder.newRegister()
                .withName("Arda")
                .withSurname("Mildanoğlu")
                .withDayOfBirth(28)
                .withMonthOfBirth(1)
                .withYearOfBirth(2023)
                .withEmail("ufan@arda.com")
                .withPassword("123456")
                .build();

        System.out.println(newregister.toString());


    }
}
