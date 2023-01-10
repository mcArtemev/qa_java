package cattests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GetFoodUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;

    @Test
    public void getCatFoodShouldReturnPredatorFood(){
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        try {
            Cat cat = new Cat(feline);
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> result = cat.getFood();
            Assert.assertTrue("Список еды не соответствует. По факту: " + result, result.equals(predatorFood));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
