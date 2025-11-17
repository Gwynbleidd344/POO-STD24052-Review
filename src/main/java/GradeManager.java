import lombok.AllArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
public class GradeManager {

    private List<Grade> allGrades;
    private List<Exam> allExams;

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return allGrades.stream()
                .filter(g -> g.getExam().equals(exam) && g.getStudent().equals(student))
                .findFirst()
                .map(g -> g.getValueAt(t))
                .orElse(0.0);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        List<Exam> exams = allExams.stream()
                .filter(e -> e.getCourse().equals(course))
                .toList();

        double numerator = 0;
        double denominator = 0;

        for (Exam e : exams) {
            double grade = getExamGrade(e, student, t);
            numerator += grade * e.getCoefficient();
            denominator += e.getCoefficient();
        }

        return denominator == 0 ? 0 : numerator / denominator;
    }
}
