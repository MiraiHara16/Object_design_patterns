public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();

        Mediator mediator = new AlarmMediator(sprinkler, coffeePot);
        sprinkler.setMediator(mediator);
        coffeePot.setMediator(mediator);
        alarm.setMediator(mediator);

        alarm.doTask();
    }
}