import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    AlexLion alexLion;

    @Mock
    Feline feline;

    @Before
    public void initAlexLion() throws Exception{
        alexLion = new AlexLion(feline);
    }

    @Test
    public void getFriendsReturnListOfFriends(){
        List<String> expectedListOfFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualListOfFriends = alexLion.getFriends();
        assertEquals("Список друзей льва Алекса не совпадает", expectedListOfFriends, actualListOfFriends);
    }

    @Test
    public void getPlaceOfLivingReturnNewYorkZoo(){
        String expectedPlaceOfLiving = "Зоопарк Нью-Йорка";
        String actualPlaceOfLiving = alexLion.getPlaceOfLiving();
        assertEquals("Место проживания льва Алекса не соответствует действительности", expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittensReturnZero(){
        int expectedKittensCount = 0;
        int actualKittensCount = alexLion.getKittens();
        assertEquals("Метод getKittens возвращает значение, отличное от нуля", expectedKittensCount, actualKittensCount);
    }
}
