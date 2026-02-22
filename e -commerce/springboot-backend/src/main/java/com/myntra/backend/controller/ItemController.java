package com.myntra.backend.controller;

import com.myntra.backend.model.Item;
import com.myntra.backend.service.ItemService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return service.getAll();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable Long id) {
        return service.getOne(id);
    }

    @PostMapping("/items")
    public Item postItem(@RequestBody Item item) {
        return service.save(item);
    }
}

