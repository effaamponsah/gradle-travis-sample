package io.turntabl;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RegisterTest {
    CorporateClient cc1 = new CorporateClient("Jim", "TT123", ServiceLevel.Gold);
    CorporateClient cc2 = new CorporateClient("Christy", "TT123", ServiceLevel.Gold);

    PrivateClient pc1 = new PrivateClient("Dennis", "TT233", ServiceLevel.Platinum);
    PrivateClient pc2 = new PrivateClient("Dennis", "TT233", ServiceLevel.Platinum);

    Register rg1 = new Register(Arrays.asList(cc1,pc1));
    Register rg2 = new Register(Arrays.asList(cc1, cc2));


    @Test
    public void listAllClients(){
        assertEquals(Arrays.asList(cc1,pc1), rg1.getAllClients());
    }

    @Test
    public void getNameByLevel(){
        ;
        assertEquals(Arrays.asList("Jim","Christy"),rg2.getClientNameByLevel(ServiceLevel.Gold));
    }

}