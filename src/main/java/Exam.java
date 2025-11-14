import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Exam {
    private int id;
    private String title;
    private Course course;
    private Date examDate;
    private int coefficient;
}
