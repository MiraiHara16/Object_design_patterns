public class Sprinkler implements AlarmComponent {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.notify(this, "Sprinkler");
    }

    public void doSprinkler() {
    }


}