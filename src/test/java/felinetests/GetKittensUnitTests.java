package felinetests;

import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensUnitTests {
    @Mock
    Feline feline;

    @Test
    public void verifyGetKittens(){
        try {
            feline.getKittens();
            Mockito.verify(feline).getKittens();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getKittens_ShouldReturn1(){
        try {
            Feline feline = new Feline();
            int result = feline.getKittens();
            Assert.assertTrue(result==1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getKittensWithParam_ShouldReturn5(){
        try {
            Feline feline = new Feline();
            int result = feline.getKittens(5);
            Assert.assertTrue(result==5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void verifyGetKittensWithParam(){
        try {
            feline.getKittens(5);
            Mockito.verify(feline).getKittens(Mockito.anyInt());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
