import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void wyliczCenaCzwartek(){
        assertEquals(0,Main.calculatePrice(25,"Poznan","Czwartek"));
    }
    @org.junit.jupiter.api.Test
    void wyliczCenaDlaWarszawy(){
        assertEquals( 36,Main.calculatePrice(19,"Warszawa", "Piatek"));
    }
    @org.junit.jupiter.api.Test
    void wyliczCenaWiekMiedzy10a18(){
        assertEquals(20,Main.calculatePrice(17,"Wrocław","Sroda"));
    }

}