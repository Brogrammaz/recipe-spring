package org.brogrammaz.recipespring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Recipes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    @Id
    Integer recipeId;
    String name;
    String author;
    String description;
    String[] ingredients;
    Date datePublished;
    String procedure;
    float price;

}
