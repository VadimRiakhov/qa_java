import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    Feline feline = new Feline();

    int kittensCount;

    public FelineParameterizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }
    @Parameterized.Parameters(name = "kittensCount = {0}")
    public static Object[][] getData(){
        return new Object[][]{
                {0},
                {1},
                {2},
                {5},
                {10},
                {100},
        };
    }

    @Test
    public void getKittensWithParameterReturnParameter(){
        int expectedKittenCount = kittensCount;
        int actualKittenCount = feline.getKittens(kittensCount);
        assertEquals("Метод getKittens с параметром класса Feline не возвращает количество,указанное в параметре", expectedKittenCount, actualKittenCount);
    }


}
