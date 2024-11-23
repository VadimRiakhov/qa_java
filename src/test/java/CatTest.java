import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static constants.AnimalFood.PREDATOR_FOOD;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void initCat(){
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnMyauTest(){
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals("Метод getSound класса Cat не возвращает \"Мяу\"", expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnPredatorFoodTest() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(PREDATOR_FOOD);
        List<String> actualListOfFood = cat.getFood();
        assertEquals("Метод getFood класса Cat не возвращает список пищи хищника", PREDATOR_FOOD, actualListOfFood);
    }
}
