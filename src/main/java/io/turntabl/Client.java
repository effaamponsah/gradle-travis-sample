package io.turntabl;

public abstract class Client{
    protected String name;
    protected String ID;
    protected ServiceLevel serviceLevel;

    public Client(String name, String ID, ServiceLevel serviceLevel) {
        this.name = name;
        this.ID = ID;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
