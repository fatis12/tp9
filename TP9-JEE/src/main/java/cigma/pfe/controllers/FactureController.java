package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.CFactureCS;

import java.util.List;
public class FactureController {

    CFactureCS factureService;

    //public FactureController() {}
    //public FactureController(CFactureCS factureService) {this.factureService = factureService;}

    public void setFactureService(CFactureCS factureService) {
        this.factureService = factureService;
    }

    public Facture create (Facture f){

        return factureService.create(f);
    }
    public List<Facture> read(){
        return factureService.read();
    }

    public void delete(long id){
        factureService.delete(id);
    }


    public Facture update(Facture f){

        return factureService.update(f);
    }

}
