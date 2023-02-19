package felinetests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetFamilyUnitTests {

    @Test
    public void getFelineFamilyShouldReturnFeline(){
        try {
            Feline feline = new Feline();
            String result = feline.getFamily();
            Assert.assertTrue(result.equals("Кошачьи"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
