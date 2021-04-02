CREATE TABLE story (
    id INTEGER NOT NULL,
    title VARCHAR(256),
    description VARCHAR(256),
    resource_uri VARCHAR(256),
    type VARCHAR(256),
    modified TIMESTAMP,
    thumbnail VARCHAR(256),
    PRIMARY KEY(id)
);