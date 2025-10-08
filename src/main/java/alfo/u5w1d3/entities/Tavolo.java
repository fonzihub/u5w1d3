package alfo.u5w1d3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int nTavolo;
    private int coperti;
    private boolean occupato;
    @Value("${")
    private double costoCoperto;
}
