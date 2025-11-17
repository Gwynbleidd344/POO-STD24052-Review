import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant dateTime;
    private int coefficient;
}
