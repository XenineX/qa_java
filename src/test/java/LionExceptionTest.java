import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionExceptionTest {
    @Test(expected = Exception.class)
    public void lionMaleAndFemaleParams() throws Exception{
        Lion lion = new Lion("Самко-самец", new Feline());
    }
}
