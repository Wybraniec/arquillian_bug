import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Arquillian.class)
public class IndexTest {

    long counter;
    @Before
    public void beforeTests(){
        counter = 5;
    }

    @Test
    public void clickButton1(){
        assertEquals(5, counter);
        counter=10;
        assertEquals(10, counter);
    }

    @Test
    public void clickButton2(){
        assertEquals(5, counter);
        counter=10;
        assertEquals(10, counter);
    }
}
