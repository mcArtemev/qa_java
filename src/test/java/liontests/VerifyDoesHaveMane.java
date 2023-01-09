package liontests;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VerifyDoesHaveMane {
    @Mock
    Lion lion;

    @Test
    public void verifyLionHaveMane(){
        lion.doesHaveMane();
        Mockito.verify(lion).doesHaveMane();
    }
}
