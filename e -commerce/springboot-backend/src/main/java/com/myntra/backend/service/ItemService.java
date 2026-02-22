package com.myntra.backend.service;

import com.myntra.backend.model.Item;
import com.myntra.backend.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public List<Item> getAll() {
        return repo.findAll();
    }

    public Item getOne(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Item save(Item item) {
        return repo.save(item);
    }
}
