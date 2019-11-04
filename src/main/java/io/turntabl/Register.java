package io.turntabl;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
   List<Client> clients;

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getAllClients(){
        return clients;
    }

    public List<String>  getClientNameByLevel(ServiceLevel level){
        List<String> names = clients.stream().filter(client -> client.getServiceLevel() == level).map(client -> client.getName()).collect(Collectors.toList());
        return names;
    }

}
