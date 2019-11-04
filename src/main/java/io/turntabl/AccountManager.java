package io.turntabl;

public class AccountManager extends CorporateClient implements ClientName {
    public AccountManager(String name, String ID, ServiceLevel serviceLevel) {
        super(name, ID, serviceLevel);
    }


    @Override
    public String getName() {
        return super.getName();
    }
}
