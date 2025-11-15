import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class User {
    private int id;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;
}
