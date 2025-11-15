import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Student extends User {
    private String group;
    private Tutor tutor;

    public Student(int id, String lastName, String firstName, Date dateOfBirth, String email, String phoneNumber, String group, Tutor tutor) {
        super(id, lastName, firstName, dateOfBirth, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }
}
