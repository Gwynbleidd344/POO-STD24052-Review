import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Grade {
    private Student student;
    private Exam exam;
    private double initialValue;
    private List<GradeHistory> history = new ArrayList<>();
}
