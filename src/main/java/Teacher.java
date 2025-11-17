import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Teacher extends User {

    private String specialization;

    public Teacher(int id, String lastName, String firstName, LocalDate birthDate,
                   String email, String phoneNumber, String specialization) {
        super(id, lastName, firstName, birthDate, email, phoneNumber);
        this.specialization = specialization;
    }
}
