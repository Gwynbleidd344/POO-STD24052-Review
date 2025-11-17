import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Grade {

    private Student student;
    private Exam exam;
    private double initialValue;
    private List<GradeChange> history = new ArrayList<>();

    public Grade(Student student, Exam exam, double initialValue) {
        this.student = student;
        this.exam = exam;
        this.initialValue = initialValue;
    }

    public void addChange(double value, Instant timestamp, String reason) {
        history.add(new GradeChange(value, timestamp, reason));
    }

    public double getValueAt(Instant t) {
        double current = initialValue;

        for (GradeChange change : history) {
            if (!change.getTimestamp().isAfter(t)) {
                current = change.getValue();
            }
        }
        return current;
    }
}
