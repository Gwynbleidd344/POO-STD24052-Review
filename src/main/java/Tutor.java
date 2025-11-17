import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Tutor extends User {

    private String relationDescription;

    public Tutor(int id, String lastName, String firstName, LocalDate birthDate,
                 String email, String phoneNumber, String relationDescription) {
        super(id, lastName, firstName, birthDate, email, phoneNumber);
        this.relationDescription = relationDescription;
    }
}
