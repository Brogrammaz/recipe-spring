package org.brogrammaz.recipespring.controllers;

import lombok.RequiredArgsConstructor;
import org.brogrammaz.recipespring.models.Recipe;
import org.brogrammaz.recipespring.repositories.RecipeRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeRepository recipeRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postRecipe(Recipe recipe){
        recipeRepository.save(recipe);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Recipe> getRecipes(){
       return  recipeRepository.findAll();
    }

    /*
    * Test Api.
    * DTOs.
    * configure application.yml
    * Orders-Service.
    *
    *
    * */

}
