import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    FilmItem one = new FilmItem(1, "one", "one");
    FilmItem two = new FilmItem(2, "two", "two");
    FilmItem three = new FilmItem(3, "three", "three");
    FilmItem four = new FilmItem(4, "four", "four");
    FilmItem five = new FilmItem(5, "five", "five");
    FilmItem six = new FilmItem(6, "six", "six");
    FilmItem seven = new FilmItem(7, "seven", "seven");
    FilmItem eight = new FilmItem(8, "eight", "eight");
    FilmItem nine = new FilmItem(9, "nine", "nine");
    FilmItem ten = new FilmItem(10, "ten", "ten");
    FilmItem eleven = new FilmItem(11, "eleven ", "eleven ");

    @Test
    public void shouldFindAll() {
        AfishaManager manager = new AfishaManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast1() {
        AfishaManager manager = new AfishaManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);


        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {nine, eight, seven, six, five, four, three, two, one};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2() {

        AfishaManager manager = new AfishaManager(5);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {eleven, ten, nine, eight, seven};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3() {
        AfishaManager manager = new AfishaManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Assertions.assertArrayEquals(expected, actual);
    }
}
