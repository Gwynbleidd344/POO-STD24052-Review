import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class Tutor extends User{
    private String relationship;

    public Tutor(int id, String lastName, String firstName, Date dateOfBirth, String email, int phoneNumber, String relationship) {
        super(id, lastName, firstName, dateOfBirth, email, phoneNumber);
        this.relationship = relationship;
    }
}
