package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl  implements ClientService{
   // ClientRepository clientRepository;
   // @Override
   // public Client save(Client c) {
      //  System.out.println("Service Layer : ClientServiceImpl Level... ");
     //   return clientRepository.save(c);
  //  }
   // public ClientServiceImpl() {
      //  System.out.println("Call ClientServiceImpl ....");
    //}

   // public ClientServiceImpl(ClientRepository clientRepository) {
     //   System.out.println("Call ClientServiceImpl with ClientRepository param....");
      //  this.clientRepository = clientRepository;
   // }
/*
    private ClientRepository dao;
    // injection par setter
    public void setDao(ClientRepository dao) {
        this.dao = dao;
    }

    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
*/

    ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL par Constructor");
        this.clientRepository = clientRepository;
    }



    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    public Client modify(Client c) {
        return clientRepository.update(c);
    }




    @Override
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return clientRepository.findById(id);
    }

}
