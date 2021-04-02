CREATE TABLE character_comic(
    character_id INTEGER NOT NULL,
    comic_id VARCHAR(256)
);

CREATE TABLE character_creator(
    character_id INTEGER NOT NULL,
    creator_id VARCHAR(256)
);

CREATE TABLE character_event(
    character_id INTEGER NOT NULL,
    event_id VARCHAR(256)
);

CREATE TABLE character_series(
    character_id INTEGER NOT NULL,
    series_id VARCHAR(256)
);

CREATE TABLE character_story(
     character_id INTEGER NOT NULL,
     story_id VARCHAR(256)
);