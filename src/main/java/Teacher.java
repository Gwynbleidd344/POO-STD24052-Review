import java.util.Date;

public class Teacher extends User {
    private String specialty;

    public Teacher(int id, String lastName, String firstName, Date dateOfBirth, String email, int phoneNumber, String specialty) {
        super(id, lastName, firstName, dateOfBirth, email, phoneNumber);
        this.specialty = specialty;
    }
}
