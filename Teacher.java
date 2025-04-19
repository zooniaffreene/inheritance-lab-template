public class Teacher extends Person {
    private int yearsTeaching;

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
        yearsTeaching = 0;
    }

    public void setYearsTeaching(int years) {
        yearsTeaching = years;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public String toString() {
        return super.toString() + ", has taught for " + yearsTeaching + " years";
    }
}
