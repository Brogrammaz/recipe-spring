package org.brogrammaz.recipespring.controllers;

import lombok.RequiredArgsConstructor;
import org.brogrammaz.recipespring.models.Order;
import org.brogrammaz.recipespring.repositories.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postOrder(Order order){ orderRepository.save(order);}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Order> getOrder(){ return orderRepository.findAll();}
}
