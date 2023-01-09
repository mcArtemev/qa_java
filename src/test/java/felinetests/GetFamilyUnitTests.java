package felinetests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetFamilyUnitTests {
    @Mock
    Feline feline;

    @Test
    public void verifyGetFamily(){
        try {
            feline.getFamily();
            Mockito.verify(feline).getFamily();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getFamily_ShouldReturnFeline(){
        try {
            Feline feline = new Feline();
            String result = feline.getFamily();
            Assert.assertTrue(result.equals("Кошачьи"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
