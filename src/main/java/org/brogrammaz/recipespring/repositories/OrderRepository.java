package org.brogrammaz.recipespring.repositories;

import org.brogrammaz.recipespring.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Integer> {
}
