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

@RunWith(MockitoJUnitRunner.class)
public class GetKittensUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Lion lionMock;

    @Test
    public void verifyGetKittensWith(){
        lionMock.getKittens();
        Mockito.verify(lionMock).getKittens();
    }

    @Mock
    Feline felineMock;

    @Test
    public void verifyGetKittensWithAnyParams_MockFeline_ShouldReturn5(){
        try {
            Lion lion = new Lion("Самец", felineMock);
            Mockito.when(felineMock.getKittens()).thenReturn(5);
            Assert.assertTrue(lion.getKittens()==5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void getKittensWithNoParams_MockFeline_ShouldReturn1(){
        try {
            Lion lion = new Lion("Самец", felineMock);
            Mockito.when(felineMock.getKittens()).thenReturn(1);
            int result = lion.getKittens();
            Assert.assertTrue(result == 1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @Test
    public void getKittensWithParams_MockFeline_ShouldReturn5(){
        try {
            Lion lion = new Lion("Самец", felineMock);
            Mockito.when(felineMock.getKittens()).thenReturn(1);
            int result = lion.getKittens();
            Assert.assertTrue(result == 1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
