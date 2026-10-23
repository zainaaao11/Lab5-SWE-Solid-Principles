package problem4.problem4after;
import java.util.List;

public class Registrar {
    public void enrollAll(List<Learner> learners, String code) {
        for (Learner learner : learners) {
            learner.enrollInCourse(code);
        }
    }
}