package com.marvel.backend.comic.infrastructure;

import com.marvel.backend.comic.domain.Comic;
import com.marvel.backend.comic.domain.ComicDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComicService {

    ComicRepository comicRepository;

    public ComicService(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    public List<ComicDTO> findByCharacterId(Integer characterId) {
        Iterable<Comic> savedComics = comicRepository.findByCharacterId(characterId);
        List<ComicDTO> comics = new ArrayList<>();

        savedComics.forEach(comic -> comics.add(populateComicDTO(comic)));

        return comics;
    }

    private ComicDTO populateComicDTO(Comic comic) {
        ComicDTO comicDTO = new ComicDTO();

        comicDTO.setId(comic.getId());
        comicDTO.setDigitalId(comic.getDigitalId());
        comicDTO.setTittle(comic.getTitle());
        comicDTO.setVariantDescription(comic.getVariantDescription());
        comicDTO.setModified(comic.getModified());
        comicDTO.setIsbn(comic.getIsbn());
        comicDTO.setUpc(comic.getUpc());
        comicDTO.setDiamondCode(comic.getDiamondCode());
        comicDTO.setEan(comic.getEan());
        comicDTO.setIssn(comic.getIssn());
        comicDTO.setFormat(comic.getFormat());
        comicDTO.setPageCount(comic.getPageCount());
        comicDTO.setResourceURI("/v1/public/characters/" + comic.getId() + "/comics");

        return comicDTO;
    }
}
