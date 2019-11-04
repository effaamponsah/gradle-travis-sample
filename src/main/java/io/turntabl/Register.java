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

    public String getClientNameById(String ID) throws ClientNotFound{
        String name =null;
        for (Client c : clients){
            if (c.getID() == ID){
                name = c.getName();
            }
            else {
                throw new ClientNotFound("No client with the ID Found");
            }
        }

        return name;
    }

}
