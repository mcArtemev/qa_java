package cattests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetSoundUnitTests {
    @Mock
    Feline feline;

    @Test
    public void getSound_MockFeline_ShouldReturnMyau(){
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertTrue(cat.getSound().equals("Мяу"));
    }
    @Mock
    Cat cat;

    @Test
    public void verifyGetSound(){
        cat.getSound();
        Mockito.verify(cat).getSound();
    }
}
