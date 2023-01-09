package felinetests;

import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class EatMeatUnitTests {
    @Mock
    Feline feline;

    @Test
    public void verifyEatMeat(){
        try {
            feline.eatMeat();
            Mockito.verify(feline).eatMeat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Mock
    Animal animal;
    @Test
    public void eatMeat_ShouldReturnPredatorFood(){
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        try {
            Feline feline = new Feline();
            Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> result = feline.eatMeat();
            Assert.assertTrue("Список еды не соответствует. По факту: " + result, result.equals(predatorFood));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
