import java.util.Date;

public class Student extends User {
    private String group;
    private Tutor tutor;

    public Student(int id, String lastName, String firstName, Date dateOfBirth, String email, int phoneNumber, String group, Tutor tutor) {
        super(id, lastName, firstName, dateOfBirth, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }
}
