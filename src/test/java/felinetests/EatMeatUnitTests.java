package felinetests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class EatMeatUnitTests {

    @Test
    public void getFelineFoodShouldReturnPredatorFood(){
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        try {
            Feline feline = new Feline();
            List<String> result = feline.eatMeat();
            Assert.assertTrue("Список еды не соответствует. По факту: " + result, result.equals(predatorFood));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
