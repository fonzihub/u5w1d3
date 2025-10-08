package alfo.u5w1d3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
@ToString
public class Ordine {
    private UUID numeroOrdine;
    private List<Item> coseOrdinate;
    private StatoTavolo statoTavolo;
    private LocalDateTime orario;
    private double totale;
    private Tavolo tavolo;

    public Ordine(UUID numeroOrdine, List<Item> coseOrdinate, StatoTavolo statoTavolo, LocalDateTime orario, Tavolo tavolo) {
        this.numeroOrdine = numeroOrdine;
        this.coseOrdinate = coseOrdinate;
        this.statoTavolo = statoTavolo;
        this.orario = orario;
        this.tavolo = tavolo;
    }
}
