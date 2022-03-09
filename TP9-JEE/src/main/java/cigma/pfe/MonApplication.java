package cigma.pfe;

//import cigma.pfe.controllers.ClientController;
//import cigma.pfe.models.Client;;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MonApplication {

    public static void main(String[] args) {
        // ClientController ctrl1;
        // Client client =new Client(1L,"testing");
        // Client.save(client);

        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController)
        // context.getBean("controller"); // controller est l'id dans le fichierSpring.xml


       // ApplicationContext context = new
             //   ClassPathXmlApplicationContext("spring.xml");
      //  ClientController ctrl = (ClientController)
              //  context.getBean("controller"); // controller est l'id dans le fichierSpring.xml
       // Client client = new Client(1,"fati");
        //ctrl.save(client);




        //ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController) context.getBean("controller");
//        CFactureCR fctrl = (CFactureCR) context.getBean("fcontroller");

        // Test save use case for three clients
/*
        ctrl.save(new Client("fatima"));
        ctrl.save(new Client("hikmat"));
        ctrl.save(new Client("ghita"));
        ctrl.save(new Client("anouar"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(1,"new Name"));
        // Test remove use case for client with id==1
       // ctrl.removeById(1L);
        // Test find use case for client with id==1
        Client found = ctrl.getById(1L);
*/

        //FACTURES


      //  FactureController ftrl = (FactureController) context.getBean("fcontroller");
       // ftrl.create(new Facture(new Date("01/01/2022"),10));
        //ftrl.delete(1);
       // ftrl.update(new Facture(new Date("15/12/2022"),20));

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");


        ClientController ctr= (ClientController) context.getBean("controller");
        Client client = new Client("Faty");
        List<Facture> factures = Arrays.asList(new Facture(1500,"facture1"),new Facture(2000,"facture2"));
        client.setFactures(factures);

        List<Promotion> promotions= Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
        client.setPromotions(promotions);

        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);

        ctr.save(client);





    }
}
