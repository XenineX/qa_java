import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

@Mock
Feline feline;

@Test
    public void getLionsFood() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
}

@Test
    public void getLionsKittens() throws Exception {
    Lion lion = new Lion("Самец", feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    int expected = 1;
    int actual = lion.getKittens();
    assertEquals(expected, actual);
}
}
