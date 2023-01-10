package liontests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class DoesHaveManeUnitTests {
    private final String sex;
    private final boolean haveMane;

    public DoesHaveManeUnitTests(String sex, boolean haveMane) {
        this.sex = sex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters
    public static Object[][] doesHaveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Трансгендер", false}
        };
    }

    @Mock
    Feline felineMock;

    @Test
    public void checkSexWithBoolParams(){
        try {
            Lion lion = new Lion(sex, felineMock);
            boolean result = lion.doesHaveMane();
            Assert.assertTrue(result == haveMane);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
