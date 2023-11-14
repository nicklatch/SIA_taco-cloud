package tacos.dto;

import lombok.Data;
import tacos.enums.Type;

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;
}
