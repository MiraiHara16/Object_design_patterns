public class Ceo implements MyCEO {
    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("Hiring...");
    }

    @Override
    public void train() {
        System.out.println("Training...");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks() {
        System.out.println("Gettings shares of the company as bonus...");
    }
}
