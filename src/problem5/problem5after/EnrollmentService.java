package problem5.problem5after;

public class EnrollmentService {
    private final StudentRepository repository;
    private final Notifier notifier;
    public EnrollmentService(StudentRepository repository, Notifier notifier) {
        this.repository = repository;
        this.notifier = notifier;
    }
    public void enroll(String cne, String name, String email) {
        if (cne == null || cne.isBlank()) {
            throw new IllegalArgumentException("CNE is required");
        }
        if (repository.exists(cne)) {
            throw new IllegalStateException("Already enrolled: " + cne);
        }
        repository.save(cne, name, email);
        notifier.notify(email, "Welcome " + name + ", you are enrolled.");
    }
}