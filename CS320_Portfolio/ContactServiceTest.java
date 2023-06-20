import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactServiceTest {
    Contact con;
    ContactService service = new ContactService();

    @Test
    void NewContactTest(){
        service.NewContact("1234abj","BOB","SANDERS","9096007388","3314 Goldenrod Ave Rialto CA");

        for (int i = 0; i < service.v.size(); i++){
            if (service.v.elementAt(i).ID.equals("1234abj")){
                con = service.v.elementAt(i);
            }
        }
        assertAll(()->assertEquals("1234abj", con.ID),
                ()->assertEquals("BOB", con.firstName),
                ()->assertEquals("SANDERS", con.lastName),
                ()->assertEquals("9096007388", con.phone),
                ()->assertEquals("3314 Goldenrod Ave Rialto CA", con.address));
    }

    @Test
    void UpdateContactTest(){
        service.NewContact("1234abj","BOB","SANDERS","9096007388","3314 Goldenrod Ave Rialto CA");
        service.NewContact("1234abj!","BOBBY","SANDERS","9096007388","3314 Goldenrod Ave Rialto CA");
        service.update("1234abj!");
        for (int i = 0; i < service.v.size(); i++){
            if (service.v.elementAt(i).ID.equals("1234abj!")){
                con = service.v.elementAt(i);
            }
        }
        assertAll(()->assertEquals("1234abj!", con.ID),
                ()->assertEquals("SAMMY", con.firstName),
                ()->assertEquals("JOE", con.lastName),
                ()->assertEquals("1234567890", con.phone),
                ()->assertEquals("1234 FOO Dr PITTSBURGH PA", con.address));
    }

    @Test
    void DeleteContactTest(){
        service.NewContact("1234abj","BOB","SANDERS","9096007388","3314 Goldenrod Ave Rialto CA");
        service.NewContact("1234abj!","BOBBY","SANDERS","9096007388","3314 Goldenrod Ave Rialto CA");
        service.delete("1234abj!");
        for (int i = 0; i < service.v.size(); i++){
            if (service.v.elementAt(i).ID.equals("1234abj!")){
                con = service.v.elementAt(i);
            }
        }

                assertEquals(null, con);
    }

}
