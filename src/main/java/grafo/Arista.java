package grafo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Arista {

    private Integer padre;
    private Integer hijo;

}
