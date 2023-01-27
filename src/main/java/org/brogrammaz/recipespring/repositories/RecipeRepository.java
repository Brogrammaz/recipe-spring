package org.brogrammaz.recipespring.repositories;

import org.brogrammaz.recipespring.models.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, Integer> {

}
