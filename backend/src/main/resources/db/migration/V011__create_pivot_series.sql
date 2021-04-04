CREATE TABLE series_comic(
    series_id INTEGER NOT NULL,
    comic_id INTEGER
);

CREATE TABLE series_creator(
    series_id INTEGER NOT NULL,
    creator_id INTEGER
);

CREATE TABLE series_event(
    series_id INTEGER NOT NULL,
    event_id INTEGER
);

CREATE TABLE series_character(
    series_id INTEGER NOT NULL,
    character_id INTEGER
);

CREATE TABLE series_story(
     series_id INTEGER NOT NULL,
     story_id INTEGER
);