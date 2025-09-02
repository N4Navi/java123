package unit1;

public class SchoolStudent extends person {
    public String course;

    public SchoolStudent(String address, String course) {
        super(address);
        this.course = course;
    }
    public void getCourse()
    {
        System.out.println("Course "+course);}

}