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
public class CatUnitTest {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;

    @Test
    public void GetSound_MockFeline_ShouldReturnMyau(){
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertTrue(cat.getSound().equals("Мяу"));
    }

    @Test
    public void GetFood_MockFelineWithPredatorFood_ShouldReturnPredatorFood(){
        Cat cat = new Cat(feline);
        List<String> foodAsPredator = List.of("Животные", "Птицы", "Рыба");

        try {
            Mockito.when(feline.eatMeat()).thenReturn(foodAsPredator);
            String result = String.join("",cat.getFood());
            Assert.assertTrue(result.equals(String.join("",foodAsPredator)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
