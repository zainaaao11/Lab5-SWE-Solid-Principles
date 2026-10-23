package problem5.problem5after;

public class CsvStudentRepository implements StudentRepository {
    private final CsvStudentStore store = new CsvStudentStore("students.csv");
    @Override
    public boolean exists(String cne) {
        return store.exists(cne);
    }
    @Override
    public void save(String cne, String name, String email) {
        store.append(cne, name, email);
    }
}