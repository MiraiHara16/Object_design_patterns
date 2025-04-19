public class AlarmMediator implements Mediator {
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public AlarmMediator(Sprinkler sprinkler, CoffeePot coffeePot) {
        this.sprinkler = sprinkler;
        this.coffeePot = coffeePot;
    }

    @Override
    public void notify(AlarmComponent sender, String event) {
        if (sender == sprinkler) {
            coffeePot.doCoffeePot();
        } else if (sender == coffeePot) {
            sprinkler.doSprinkler();
        }
        System.out.println("Alarm event ended from " + sender.getClass().getSimpleName());
    }
}