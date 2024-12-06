import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static constants.AnimalFood.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    Animal animal = new Animal();

    private String animalKind;
    private List<String> animalFood;


    public AnimalParameterizedTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters(name="вид животного = {0}")
    public static Object[][] getData(){
        return new Object[][]{
                {"Травоядное", HERBIVORE_FOOD},
                {"Хищник", PREDATOR_FOOD}
        };
    }

    @Test
    public void getFoodReturnListOfFoodTest() throws Exception {
        List<String> expectedAnimalFood = animalFood;
        List<String> actualAnimalFood = animal.getFood(animalKind);
        assertEquals("Список еды не соответствует виду животного", expectedAnimalFood, actualAnimalFood);
    }

}
