import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionExceptionTest {
    @Test(expected = Exception.class)
    public void lionMaleAndFemaleParams() throws Exception{
        new Lion("Самко-самец", new Feline());
    }
}
