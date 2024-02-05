import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ToyRaffle toyRaffle = new ToyRaffle();

        toyRaffle.addToy(new Toy(1, "конструктор", 2));
        toyRaffle.addToy(new Toy(2, "робот", 2));
        toyRaffle.addToy(new Toy(3, "кукла", 6));

        try (FileWriter writer = new FileWriter("toys.txt")) {
            for (int i = 0; i < 10; i++) {
                int toyId = toyRaffle.getToy();
                writer.write(toyId + " " + getToyById(toyId) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getToyById(int toyId) {
        switch (toyId) {
            case 1:
                return "конструктор";
            case 2:
                return "робот";
            case 3:
                return "кукла";
            default:
                return "игрушка не найдена";
        }
    }
}