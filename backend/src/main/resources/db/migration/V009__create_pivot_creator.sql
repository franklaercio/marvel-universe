CREATE TABLE creator_character(
    creator_id INTEGER NOT NULL,
    character_id INTEGER
);

CREATE TABLE creator_event(
    creator_id INTEGER NOT NULL,
    event_id INTEGER
);

CREATE TABLE creator_comic(
    creator_id INTEGER NOT NULL,
    comic_id INTEGER
);

CREATE TABLE creator_series(
    creator_id INTEGER NOT NULL,
    series_id INTEGER
);

CREATE TABLE creator_story(
     creator_id INTEGER NOT NULL,
     story_id INTEGER
);