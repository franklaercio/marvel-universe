CREATE TABLE event (
    id INTEGER NOT NULL,
    name VARCHAR(256),
    description VARCHAR(256),
    resource_uri VARCHAR(256),
    modified TIMESTAMP,
    start_event TIMESTAMP,
    end_event TIMESTAMP,
    thumbnail VARCHAR(256),
    PRIMARY KEY(id)
);