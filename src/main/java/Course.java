import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
}
