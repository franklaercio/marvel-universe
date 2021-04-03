package com.marvel.backend.comic.infrastructure;

import org.springframework.stereotype.Service;

@Service
public class ComicService {

    ComicRepository comicRepository;

    public ComicService(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }
}
