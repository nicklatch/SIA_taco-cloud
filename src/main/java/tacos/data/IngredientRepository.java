package tacos.data;

import java.util.Optional;
import tacos.dto.Ingredient;

public interface IngredientRepository {

  Iterable<Ingredient> findAll();

  Optional<Ingredient> findById(String id);

  Ingredient save(Ingredient ingredient);
}
