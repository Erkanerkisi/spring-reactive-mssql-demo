package com.erkan.repository;

import com.erkan.model.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, Long> {
}