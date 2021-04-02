CREATE TABLE character (
    id INTEGER NOT NULL,
    name VARCHAR(256),
    description VARCHAR(256),
    modified TIMESTAMP,
    resource_uri VARCHAR(256),
    thumbnail VARCHAR(256),
    PRIMARY KEY(id)
);