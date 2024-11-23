import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static constants.AnimalFood.*;
import static constants.ExceptionMessage.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeSexMaleTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertTrue("Поле doesHaveMane класса Lion равно false при создании объекта мужского пола", actualHasMane);
    }

    @Test
    public void doesHaveManeSexFemaleFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertFalse("Поле doesHaveMane класса Lion равно true при создании объекта женского пола", actualHasMane);
    }

    @Test(expected = Exception.class)
    public void lionInvalidSexThrowsException() throws Exception {
        Lion lion = new Lion("Ребенок", feline);
    }

    @Test()
    public void lionCheckExceptionText(){
        try{
            Lion lion = new Lion("Ребенок", feline);
        }
        catch(Exception e){
            String actualExceptionText = e.getMessage();
            assertEquals("Текст исключения конструктора класса Lion неправильный",LION_CONSTRUCTOR_EXCEPTION_MESSAGE, actualExceptionText);
        }
    }

    @Test
    public void getKittensReturnOne() throws Exception {
        int expectedKittensCount = 1;
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        assertEquals("Метод getKittens класса Lion не возвращает 1", expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodReturnListOfPredatorFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getFood()).thenReturn(PREDATOR_FOOD);
        List<String> actualListOfFood = lion.getFood();
        assertEquals("Метод getFood класса Lion не возвращает список еды хищника", PREDATOR_FOOD, actualListOfFood);
    }
}
