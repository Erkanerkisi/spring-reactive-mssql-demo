package com.erkan.controller;

import com.erkan.model.Item;
import com.erkan.service.ProductionDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/productions")
public class ProductionDataController {

    private final ProductionDataService productionDataService;

    public ProductionDataController(ProductionDataService productionDataService) {
        this.productionDataService = productionDataService;
    }

    @GetMapping
    public ResponseEntity<Flux<Item>> retrieveProductionData() {
        System.out.println("Started");
        Flux<Item> flux = productionDataService.findAllItems();
        System.out.println("ended");
        return ResponseEntity.ok(flux);
    }
}
