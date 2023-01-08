import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionUnitTest {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Lion lion;

    @Test
    public void GetFootForPredator_Predator(){
        lion.getFood();
    }
}
