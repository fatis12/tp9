package cigma.pfe.repositories;
import cigma.pfe.models.Facture;

import java.util.List;
public interface IFactureCR {
    Facture create(Facture f);
    List<Facture> read();
    void deleteFactureById(long id);
    Facture update(Facture f);

}
