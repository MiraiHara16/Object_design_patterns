public interface Mediator {
    void notify(AlarmComponent sender, String event);
}