package com.marvel.backend.story.infrastructure;

import com.marvel.backend.story.domain.Story;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StoryRepository extends CrudRepository<Story, Integer> {

    @Query("FROM Story story WHERE upper(story.title) = upper(:title)")
    Optional<Story> findByTitle(String title);

    @Query("FROM Story s INNER JOIN CharacterStory cs ON s.id = cs.storyId WHERE cs.characterId = :characterId")
    List<Story> findByCharacterId(Integer characterId);
}
