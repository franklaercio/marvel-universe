CREATE TABLE story_comic(
    story_id INTEGER NOT NULL,
    comic_id INTEGER
);

CREATE TABLE story_creator(
    story_id INTEGER NOT NULL,
    creator_id INTEGER
);

CREATE TABLE story_event(
    story_id INTEGER NOT NULL,
    event_id INTEGER
);

CREATE TABLE story_character(
    story_id INTEGER NOT NULL,
    character_id INTEGER
);

CREATE TABLE story_series(
     story_id INTEGER NOT NULL,
     series_id INTEGER
);