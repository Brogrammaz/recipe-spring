package org.brogrammaz.recipespring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "Orders")
@Data
@AllArgsConstructor
public class Order {
    @Id
    Integer serialNumber;
    Recipe recipe;
    Date orderDate;

    /*
    * serialNumber, Recipe, orderDate
    * */
}
