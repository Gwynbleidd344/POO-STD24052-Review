import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public abstract class User {

    protected int id;
    protected String lastName;
    protected String firstName;
    protected LocalDate birthDate;
    protected String email;
    protected String phoneNumber;
}
