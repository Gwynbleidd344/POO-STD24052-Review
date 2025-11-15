import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Teacher extends User {
    private String specialty;

    public Teacher(int id, String lastName, String firstName, Date dateOfBirth, String email, String phoneNumber, String specialty) {
        super(id, lastName, firstName, dateOfBirth, email, phoneNumber);
        this.specialty = specialty;
    }
}
