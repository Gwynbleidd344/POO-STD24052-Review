import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GradeTest {
    private Student student;
    private Tutor parent;
    private Teacher mrBlade;
    private Course prog2;
    private Exam examFinal;
    private Exam examMidterm;
    private GradeManager gradeManager;

    @BeforeEach
    void setUp() {
        parent = new Tutor(1, "Jane", "Doe", LocalDate.of(1970, 5, 5), "parent@gmail.com", "0347654321", "Parent");
        student = new Student(1, "Jerry", "Doe", LocalDate.of(2000, 1, 1), "student@gmail.com", "0341234567", "K1", parent);
        mrBlade = new Teacher(2, "Will", "Smith", LocalDate.of(1980, 1, 1), "blade@gmail.com", "0341122334", "Backend");
        prog2 = new Course(1, "PROG2", 6, mrBlade);
        examMidterm = new Exam(1, "Midterm", prog2, Instant.parse("2024-06-15T10:00:00Z"), 2);
        examFinal = new Exam(2, "Final", prog2, Instant.parse("2024-06-30T10:00:00Z"), 3);

        List<Exam> allExams = new ArrayList<>();
        allExams.add(examMidterm);
        allExams.add(examFinal);

        Grade gradeMidterm = new Grade(student, examMidterm, 10.0);
        gradeMidterm.addChange(12.0, Instant.parse("2024-06-14T10:00:00Z"), "Correction");
        Grade gradeFinal = new Grade(student, examFinal, 15.0);
        gradeFinal.addChange(13.0, Instant.parse("2024-06-29T10:00:00Z"), "Révision");

        List<Grade> allGrades = new ArrayList<>();
        allGrades.add(gradeMidterm);
        allGrades.add(gradeFinal);

        gradeManager = new GradeManager(allGrades, allExams);
    }

    @Test
    @DisplayName("Vérifie la note d'un examen avant une date précise")
    void testGetExamGrade() {
        double note = gradeManager.getExamGrade(examMidterm, student, Instant.parse("2024-06-15T09:00:00Z"));
        Assertions.assertEquals(12.0, note, 0.001);
    }

    @Test
    @DisplayName("Vérifie la note finale du cours")
    void testGetCourseGrade() {
        double finalGrade = gradeManager.getCourseGrade(prog2, student, Instant.parse("2024-06-30T11:00:00Z"));
        Assertions.assertEquals(12.6, finalGrade, 0.001);
    }
}