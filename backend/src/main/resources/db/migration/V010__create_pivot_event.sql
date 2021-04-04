CREATE TABLE event_character(
    event_id INTEGER NOT NULL,
    character_id INTEGER
);

CREATE TABLE event_creator(
    event_id INTEGER NOT NULL,
    creator_id INTEGER
);

CREATE TABLE event_comic(
    event_id INTEGER NOT NULL,
    comic_id INTEGER
);

CREATE TABLE event_series(
    event_id INTEGER NOT NULL,
    series_id INTEGER
);

CREATE TABLE event_story(
    event_id INTEGER NOT NULL,
    story_id INTEGER
);