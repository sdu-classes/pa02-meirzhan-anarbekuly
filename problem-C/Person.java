public class Person {
    private String name;
    private String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.name, this.address);
    }

    public static class Student extends Person {
        private String program;
        private int year;
        private double fee;

        Student(String name, String address, String program, int year, double fee) {
            super(name, address);
            this.program = program;
            this.fee = fee;
            this.year = year;
        }

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        @Override
        public String toString() {
            return String.format("Student[%s,program=%s,year=%s,fee=%s]", super.toString(), program, Integer.toString(year), Double.toString(fee));
        }
    }

    public static class Staff extends Person {
        private String school;
        private double pay;

        Staff(String name, String address, String school, double pay) {
            super(name, address);
            this.school = school;
            this.pay = pay;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public double getPay() {
            return pay;
        }

        public void setPay(double pay) {
            this.pay = pay;
        }

        @Override
        public String toString() {
            return String.format("Staff[%s,school=%s,pay=%s]", super.toString(), school, pay);
        }
    }
}
