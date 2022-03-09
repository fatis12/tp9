package cigma.pfe.models;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity(name = "TFactures")

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "Client_id")
    private Client client;

    public Facture(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public Facture(){}
    }
