import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline predator;

    @Test
    public void checkCatsSound(){
        Cat cat = new Cat(predator);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void checkCatsFood() throws Exception {
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}


