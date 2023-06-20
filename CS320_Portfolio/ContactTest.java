import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    Contact c = new Contact("1234abj","BOB","SANDERS","9096007388","3314 Goldenrod Ave Rialto CA");
    @Test
    void NewContactTest(){

        assertAll(()->assertEquals("1234abj", c.ID),
                ()->assertEquals("BOB", c.firstName),
                ()->assertEquals("SANDERS", c.lastName),
                ()->assertEquals("9096007388", c.phone),
                ()->assertEquals("3314 Goldenrod Ave Rialto CA", c.address));
    }

}
