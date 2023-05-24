package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {

  private Long id;
  private String name;
  private String description;

  //branch 1. Dimass...

  public Item() {}

  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // getters and setters
}
