package cigma.pfe.repositories;

import cigma.pfe.models.Facture;
import cigma.pfe.services.CFactureCS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
public class CFactureCR   implements IFactureCR{
    CFactureCS factureService;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public void setFactureService(CFactureCS factureService) {
        this.factureService = factureService;
    }

    public Facture create(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return f;
    }

    public List<Facture> read() {
        return (List<Facture>) em.createQuery("select e from TFactures e").getResultList();
    }

    public void deleteFactureById(long id) {
        em.getTransaction().begin();
        Facture clientInDataBase = em.find(Facture.class,id);
        em.remove(clientInDataBase);
        em.getTransaction().commit();

    }

   /* public Facture update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.getDate(f.getDate());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null ;
    }

    */
    public Facture update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null ;
    }

}
