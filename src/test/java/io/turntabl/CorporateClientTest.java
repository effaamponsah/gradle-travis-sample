package io.turntabl;

import org.junit.Test;

import static org.junit.Assert.*;

public class CorporateClientTest {
    CorporateClient c = new CorporateClient("Jim", "TT123", ServiceLevel.Gold);


    @Test
    public void testName(){
//        c.getName();
        assertEquals("Jim", c.getName());
    }

}