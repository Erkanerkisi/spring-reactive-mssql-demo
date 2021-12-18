package com.erkan.service;

import com.erkan.model.Item;
import com.erkan.repository.ItemRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductionDataService {

    private final ItemRepository itemRepository;

    public ProductionDataService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Flux<Item> findAllItems() {
        return itemRepository.findAll();
    }
}
