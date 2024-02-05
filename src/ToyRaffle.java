import java.util.PriorityQueue;

public class ToyRaffle {
    private PriorityQueue<Toy> toyPriorityQueue;

    public ToyRaffle() {
        toyPriorityQueue = new PriorityQueue<>((toy1, toy2) -> toy2.getWeight() - toy1.getWeight());
    }

    public void addToy(Toy toy) {
        toyPriorityQueue.add(toy);
    }

    public int getToy() {
        int random  = (int) (Math.random() * 100);
        if (random < 20) {
            return 1;
        } else if (random < 40) {
            return 2;
        } else {
            return 3;
        }
    }
}
