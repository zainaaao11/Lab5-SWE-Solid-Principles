package problem4.problem4after;
import java.util.List;

public class ExamBoard {
    public void collectGrades(List<Teacher> teachers, String code) {
        for (Teacher teacher : teachers) {
            teacher.gradeExam(code);
        }
    }
}