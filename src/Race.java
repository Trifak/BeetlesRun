import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Race {
    public static void main(String[] args) throws InterruptedException {
        List<Beetle> beetles = new ArrayList<>();

        Beetle beetleOne = new Beetle("Beetle number one", 0, 3);
        Beetle beetleTwo = new Beetle("Beetle number two", 0, 3);
        Beetle beetleThree = new Beetle("Beetle number three", 0, 3);
        Beetle beetleFour = new Beetle("Beetle number four", 0, 3);
        Beetle beetleFive = new Beetle("Beetle number five", 0, 3);

        beetles.addAll(Arrays.asList(beetleOne, beetleTwo, beetleThree, beetleFour, beetleFive));

        race = new Race(beetles);
        race.run();
        race.printWinner();
    }

    private List<Beetle> beetles;
    public static Race race;

    public List<Beetle> getBeetles() {
        return this.beetles;
    }

    public Race(List<Beetle> beetles) {
        this.beetles = beetles;
    }

    public void countDistance() {
        for (Beetle beetle : beetles) {
            beetle.countDistance();
        }
    }

    public void printMoving() {
        for (Beetle beetle : beetles) {
            beetle.printMoving();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() throws InterruptedException{
        for (int i = 0; i < 100; i++) {
            countDistance();
            printMoving();
            Thread.sleep(200);
        }
    }

    public Beetle getWinner() {
        Beetle winner = beetles.get(0);
        int distance = beetles.get(0).distance;
        for (Beetle beetle : beetles) {
            if (beetle.distance > distance) {
                distance = beetle.distance;
                winner = beetle;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}