public class Teacher extends Person{
    
    // TODO: Add fields.

    public Teacher(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    // TODO Add methods

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", is a teacher!";
    }
}
