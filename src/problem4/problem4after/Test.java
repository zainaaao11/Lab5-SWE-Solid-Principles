package problem4.problem4after;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("SAFI Amal");
        Professor professor = new Professor("Prof. KALLOUBI");
        TeachingAssistant assistant = new TeachingAssistant("ALAMI Samir");
        Registrar registrar = new Registrar();
        registrar.enrollAll(List.of(student, assistant), "SE101");
        ExamBoard examBoard = new ExamBoard();
        examBoard.collectGrades(List.of(professor, assistant), "SE101");
    }
}