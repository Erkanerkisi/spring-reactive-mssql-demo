package com.erkan.controller;

import com.erkan.model.Item;
import com.erkan.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/items")
public class BookController {

    private final ItemService itemService;

    public BookController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public Flux<Item> retrieveItems() {
        System.out.println("Started");
        Flux<Item> flux = itemService.findAllItems();
        System.out.println("ended");
        return flux;
    }
}
