package liontests;

import com.example.Feline;
import com.example.Lion;
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
    Lion lionMock;

    @Test
    public void verifyGetFood(){
        try {
            lionMock.getFood();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Mock
    Feline felineMock;

    @Test
    public void getFood_ShouldGetPredatorFood(){
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        try {
            Lion lion = new Lion("Самец", felineMock);
            Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> result = lion.getFood();
            Assert.assertTrue("Список еды не соответствует. По факту: " + result, result.equals(predatorFood));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
