package com.marvel.backend.character.domain;

import lombok.Data;

import java.util.List;

@Data
public class CharacterEventDTO {

    public Integer available;

    public List<String> items;
}
