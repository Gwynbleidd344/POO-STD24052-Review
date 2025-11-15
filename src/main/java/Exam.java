import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Exam {
    private int id;
    private String title;
    private Course course;
    private LocalDateTime examDate;
    private int coefficient;
}
