public class CoffeePot implements AlarmComponent {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("I am coffee pot,... doing my task");
        mediator.notify(this, "CoffeePot");
    }

    public void doCoffeePot() {
    }


}