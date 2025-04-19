public class HighSchoolTeacher extends Teacher {
  private String mySubject;
  private int homeroomNumber;

  public HighSchoolTeacher(String name, int age, String gender, String subject, int homeroomNumber) {
    super(name, age, gender);
    this.mySubject = subject;
    this.homeroomNumber = homeroomNumber;
  }

  public String getSubject() {
    return mySubject;
  }

  public int getHomeroomNumber() {
    return homeroomNumber;
  }

  public void setSubject(String subject) {
    this.mySubject = subject;
  }

  public void setHomeroomNumber(int number) {
    this.homeroomNumber = number;
  }

  public String toString() {
    return super.toString() + ", teaches: " + mySubject + ", homeroom: " + homeroomNumber;
  }
}
