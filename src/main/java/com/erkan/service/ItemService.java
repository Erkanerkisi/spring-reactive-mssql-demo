package com.erkan.service;

import com.erkan.model.Item;
import com.erkan.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Flux<Item> findAllItems() {
        return itemRepository.findAll();
    }
}
