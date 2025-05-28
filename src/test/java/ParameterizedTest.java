import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private final int kittensCount;

    public ParameterizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameters(name="kittensCount={0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0},
                {1},
                {5}
        });
    }

    @Test
    public void getKittensCountParamTest(){
        Feline feline = new Feline();
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}
