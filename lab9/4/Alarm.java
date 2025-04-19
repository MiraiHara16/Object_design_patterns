public class Alarm implements AlarmComponent {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("Alarm is sending event to all...");
        mediator.notify(this, "Alarm");
    }
}