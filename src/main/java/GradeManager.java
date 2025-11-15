import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class GradeManager {

    private List<Grade> allGrades;
    private List<Exam> allExams;

    public GradeManager(List<Grade> allGrades, List<Exam> allExams) {
        this.allGrades = allGrades;
        this.allExams = allExams;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        Optional<Grade> studentExamGrade = allGrades.stream()
                .filter(g -> g.getStudent().equals(student) && g.getExam().equals(exam))
                .findFirst();

        if (studentExamGrade.isEmpty()) {
            return 0.0;
        }

        Grade grade = studentExamGrade.get();
        double currentGradeValue = grade.getInitialValue();

        Optional<GradeHistory> latestHistory = grade.getHistory().stream()
                .filter(gh -> !gh.getTimeStamp().isAfter(t))
                .sorted((gh1, gh2) -> gh2.getTimeStamp().compareTo(gh1.getTimeStamp()))
                .findFirst();

        if (latestHistory.isPresent()) {
            currentGradeValue = latestHistory.get().getNewValue();
        }

        return currentGradeValue;
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        List<Exam> courseExams = allExams.stream()
                .filter(e -> e.getCourse().equals(course))
                .toList();

        if (courseExams.isEmpty()) {
            return 0.0;
        }

        double totalWeightedGrade = 0.0;
        double totalCoefficient = 0.0;

        for (Exam exam : courseExams) {
            double examGrade = getExamGrade(exam, student, t);
            totalWeightedGrade += examGrade * exam.getCoefficient();
            totalCoefficient += exam.getCoefficient();
        }

        if (totalCoefficient == 0.0) {
            return 0.0;
        }

        return totalWeightedGrade / totalCoefficient;
    }
}