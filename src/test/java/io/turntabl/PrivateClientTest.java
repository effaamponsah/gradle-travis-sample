package io.turntabl;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrivateClientTest {
    PrivateClient p = new PrivateClient("Dennis", "TT123", ServiceLevel.Gold);

    @Test
    public void testName(){
        p.getName();
        assertEquals("Dennis", p.getName());
    }

}