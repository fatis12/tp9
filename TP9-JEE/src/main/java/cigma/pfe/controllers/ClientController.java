package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class ClientController {
    // ClientService clientService;
    // public Client save(Client c ){
    // System.out.println("ClientController level...");
    //  return clientService.save(c);
    // }
    // public ClientController() {
    // System.out.println("Call ClientController ....");
    //}

    // ClientService clientService;

    //public void setClientService(ClientService clientService) {
    //    this.clientService = clientService;
    // }

    // public Client save(Client c) {
    //    System.out.println("ClientController level...");
    //   return clientService.save(c);
    //  }

    // public ClientController() {
    //   System.out.println("Call ClientController ....");
    // }


   // ClientService clientService;

  //  public ClientController(ClientService clientService) {
    //    System.out.println("Call ClientController with clientService param....");
      //  this.clientService = clientService;
   // }

   // public Client save(Client c) {
     //   System.out.println("ClientController level...");
     //   return clientService.save(c);
   // }

   // public ClientController() {
    //    System.out.println("Call ClientController ....");

   // }

/*
    private ClientService service ;
    // injection par setter
    public void setService(ClientService service) {
        this.service = service;
    }
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
    */

    ClientService clientService;

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }


    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }

    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }



    public void modify(Client c){
        clientService.modify(c);
    }

    public void removeById(long id){
        clientService.removeById(id);
    }
    public Client getById(long id){
        return clientService.getById(id);
    }
}
