package problem5.problem5after;

public class EmailNotifier implements Notifier {
    private final EmailSender sender =
            new EmailSender("smtp.example.com");
    @Override
    public void notify(String to, String message) {
        sender.send(to, message);
    }
}