package io.turntabl;

public class PrivateClient extends Client {

    public PrivateClient(String name, String ID, ServiceLevel serviceLevel) {
        super(name, ID, serviceLevel);
    }

    public String getName() {
        return super.getName();
    }
}
