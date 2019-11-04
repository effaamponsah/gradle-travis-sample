package io.turntabl;

public class CorporateClient extends Client implements Manager {
    public CorporateClient(String name, String ID, ServiceLevel serviceLevel) {
        super(name, ID, serviceLevel);
    }

    @Override
    public String findName() {
        return super.getName();
    }


}
