import com.example.Animal;
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

    @Test(expected = Exception.class)
    public void getFoodInvalidAnimalKindThrowsException() throws Exception {
        animal.getFood("Зверь");
    }

    @Test()
    public void getFoodCheckExceptionText(){
        try{
            animal.getFood("Зверь");
        }
        catch(Exception e){
            String actualExceptionText = e.getMessage();
            assertEquals("Текст исключения метода getFood неправильный",ANIMAL_KIND_EXCEPTION_MESSAGE, actualExceptionText);
        }
    }

    @Test()
    public void getFamilyTest(){
        String expectedGetFamily =  "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualGetFamily = animal.getFamily();
        assertEquals("Возвращаемое значение метода getFamily отличается от ожидаемого",expectedGetFamily, actualGetFamily);
    }
}
