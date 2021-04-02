CREATE TABLE event (
    id INTEGER NOT NULL,
    name VARCHAR(256) NOT NULL,
    description VARCHAR(256),
    modified TIMESTAMP,
    start_event TIMESTAMP,
    end_event TIMESTAMP,
    PRIMARY KEY(id)
);