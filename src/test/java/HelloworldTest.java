import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HelloworldTest {
    @Test
    public void helloWorldTest(){
        Helloworld hw = new Helloworld();
        String actual = hw.helloworld();
        String expected = "Helloworld";
        assertEquals(expected,actual);
        assertEquals(expected,"Helloworld");
    }
    @Test
    public void FailhelloWorldTest(){
        Helloworld hw = new Helloworld();
        String actual = hw.helloworld();
        String expected = "Hellowrld";
        assertNotEquals(expected,actual);

    }


}
