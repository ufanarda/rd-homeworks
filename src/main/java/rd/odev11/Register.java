package rd.odev11;

public class Register {

    private String name;
    private String surname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String password;
    private String email;

    public static final class RegisterBuilder {
        private String name;
        private String surname;
        private int dayOfBirth;
        private int monthOfBirth;
        private int yearOfBirth;
        private String password;
        private String email;

        private RegisterBuilder() {
        }

        public static RegisterBuilder newRegister() {
            return new RegisterBuilder();
        }

        public RegisterBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public RegisterBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public RegisterBuilder withDayOfBirth(int dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
            return this;
        }

        public RegisterBuilder withMonthOfBirth(int monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
            return this;
        }

        public RegisterBuilder withYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public RegisterBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public RegisterBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Register build() {
            Register register = new Register();
            register.monthOfBirth = this.monthOfBirth;
            register.surname = this.surname;
            register.password = this.password;
            register.email = this.email;
            register.yearOfBirth = this.yearOfBirth;
            register.name = this.name;
            register.dayOfBirth = this.dayOfBirth;
            return register;
        }
    }

    @Override
    public String toString() {
        return "Register{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
