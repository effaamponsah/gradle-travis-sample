package io.turntabl;

import java.util.ArrayList;
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

    public void getClientCount(){
        List<Client> gold = new ArrayList<>();
        List<Client> plat = new ArrayList<>();
        List<Client> pre = new ArrayList<>();

        for (Client c : clients){
            switch (c.getServiceLevel()){
                case Gold:
                    gold.add(c);
                    break;
                case Premium:
                    pre.add(c);
                    break;
                case Platinum:
                    plat.add(c);
                    break;
                default:
                    break;
            }
        }

        for (ServiceLevel level: ServiceLevel.values()){
            switch (level){
                case Platinum:
                    System.out.println(level);
                    System.out.println(plat.size());
                    break;
                case Premium:
                    System.out.println(level);
                    System.out.println(pre.size());


                    break;
                case Gold:
                    System.out.println(level);
                    System.out.println(gold.size());


                    break;
                default:
                    break;
            }
        }

    }

}
