package com.example.demo.controllers;

import com.example.demo.dtos.Item;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MyController {

  private Map<Long, Item> items = new HashMap<>();
  private long nextId = 1;

  @PostMapping("/items")
  public Item addItem(@RequestBody Item item) {
    item.setId(nextId++);
    items.put(item.getId(), item);
    return item;
  }

  @GetMapping("/items/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Item getItem(@PathVariable Long id) {
    return items.get(id);
  }
}
