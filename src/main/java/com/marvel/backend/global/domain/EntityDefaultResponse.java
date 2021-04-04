package com.marvel.backend.global.domain;

import lombok.Data;

import java.util.List;

@Data
public class EntityDefaultResponse {

    public Integer available;

    public List<String> items;
}
