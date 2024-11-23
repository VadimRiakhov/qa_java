import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static constants.AnimalFood.PREDATOR_FOOD;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;

    @Before
    public void initFeline(){
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnListOfPredatorFoodTest() throws Exception {
        List<String> actualListOfFood = feline.eatMeat();
        assertEquals("Метод eatMeat класса Feline не возвращает список еды хищника", PREDATOR_FOOD, actualListOfFood);
    }
    @Test
    public void getFamilyReturnKoshachiTest(){
        String expectedFamily  = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Метод getFamily класса Feline не возвращает \"Кошачьи\"", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensNoParametersReturnOneTest(){
        int expectedKittensCount  = 1;
        int actualKittensCount  = feline.getKittens();
        assertEquals("Метод getKittens без параметров класса Feline не возвращает \"1\"", expectedKittensCount, actualKittensCount);
    }
}
