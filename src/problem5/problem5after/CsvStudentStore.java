package problem5.problem5after;
import java.io.FileWriter;
import java.io.IOException;

public class CsvStudentStore {
    private final String fileName;
    public CsvStudentStore(String fileName) {
        this.fileName = fileName;
    }
    public boolean exists(String cne) {
        //check whether the CNE exists in the CSV
        return false;
    }
    public void append(String cne, String name, String email) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(cne + "," + name + "," + email + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}