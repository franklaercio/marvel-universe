CREATE TABLE comic_story(
    comic_id INTEGER NOT NULL,
    story_id INTEGER
);

CREATE TABLE comic_creator(
    comic_id INTEGER NOT NULL,
    creator_id INTEGER
);

CREATE TABLE comic_event(
    comic_id INTEGER NOT NULL,
    event_id INTEGER
);

CREATE TABLE comic_character(
    comic_id INTEGER NOT NULL,
    character_id INTEGER
);

CREATE TABLE comic_series(
     comic_id INTEGER NOT NULL,
     series_id INTEGER
);