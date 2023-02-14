
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

@Test
    public void checkFelineFood() throws Exception {
        Feline feline = new Feline();
    List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
    List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
}

@Test
    public void checkFelineFamily() {
    Feline feline = new Feline();
    String expected = "Кошачьи";
    String actual = feline.getFamily();
    assertEquals(expected, actual);
}

@Test
    public void checkFelineKittens() {
    Feline feline = new Feline();
    int expected = 1;
    int actual = feline.getKittens();
    assertEquals(expected, actual);
}
}
