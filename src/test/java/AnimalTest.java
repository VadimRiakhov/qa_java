import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static constants.ExceptionMessage.ANIMAL_KIND_EXCEPTION_MESSAGE;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal;

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test()
    public void getFoodInvalidAnimalKindThrowsExceptionTest() {
        Assert.assertThrows("Метод getFood класса Animal не выбрасывает исключение при указании неверного вида животного", Exception.class, ()->animal.getFood("Зверь"));
    }

    @Test()
    public void getFoodCheckExceptionTextTest(){
        Exception exception = Assert.assertThrows(Exception.class, ()->animal.getFood("Зверь"));
        assertEquals("Текст исключения метода getFood неправильный",ANIMAL_KIND_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test()
    public void getFamilyTest(){
        String expectedGetFamily =  "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualGetFamily = animal.getFamily();
        assertEquals("Возвращаемое значение метода getFamily отличается от ожидаемого",expectedGetFamily, actualGetFamily);
    }
}
