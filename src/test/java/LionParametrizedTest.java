import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParametrizedTest {
    String sex;
    boolean expected;

    public LionParametrizedTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true}
        };
    }

    @Test
    public void doesLionHasMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
