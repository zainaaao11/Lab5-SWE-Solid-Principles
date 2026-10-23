package problem5.problem5after;

public class EmailSender {
    private final String server;
    public EmailSender(String server) {
        this.server = server;
    }
    public void send(String email, String message) {
        System.out.println("[EMAIL to " + email + "] " + message);
    }
}