import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Tutor extends User{
    private String relationship;

    public Tutor(int id, String lastName, String firstName, Date dateOfBirth, String email, String phoneNumber, String relationship) {
        super(id, lastName, firstName, dateOfBirth, email, phoneNumber);
        this.relationship = relationship;
    }
}
