import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedList<Book> lista = new LinkedList<>();
        for(int i=0; i < 1000000; i++) {
            lista.add(new Book("Author" + i, "Title" + i));
        }

        System.out.println("Linked list: ");

        long start = System.nanoTime();
        lista.removeFirst();
        long end = System.nanoTime();

        System.out.println("Czas usuwania pierwszego elementu: " + (end - start) + " ns");

        start = System.nanoTime();
        lista.removeLast();
        end = System.nanoTime();

        System.out.println("Czas usuwania ostatniego elementu: " + (end - start) + " ns");

        start = System.nanoTime();
        lista.addFirst(new Book("Author-12", "Title-12"));
        end = System.nanoTime();

        System.out.println("Czas dodania elementu na poczatek: " + (end - start) + " ns");

        start = System.nanoTime();
        lista.addLast(new Book("Author-124", "Title-123"));
        end = System.nanoTime();

        System.out.println("Czas dodania elementu na koniec: " + (end - start) + " ns");

        Map<String, Book> mapa = new HashMap<>();
        for(int i=0; i < 1000000; i++) {
            mapa.put("huj" + i, new Book("Author" + i, "Title" + i));
        }

        System.out.println("HashMapa: ");

        start = System.nanoTime();
        mapa.get("huj23442");
        end = System.nanoTime();

        System.out.println("Czas odczytu elementu z mapy: " + (end - start) + " ns");

        start = System.nanoTime();
        mapa.put("huj-123", new Book("Author-123", "Title-123"));
        end = System.nanoTime();

        System.out.println("Czas dodania elementu do mapy: " + (end - start) + " ns");

        start = System.nanoTime();
        mapa.remove("huj23442");
        end = System.nanoTime();

        System.out.println("Czas usuwania elementu z mapy: " + (end - start) + " ns");

    }
}