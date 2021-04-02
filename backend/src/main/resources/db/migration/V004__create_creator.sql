CREATE TABLE creator (
    id INTEGER NOT NULL,
    first_name VARCHAR(256),
    middle_name VARCHAR(256),
    last_name VARCHAR(256),
    suffix VARCHAR(256),
    full_name VARCHAR(256),
    modified TIMESTAMP,
    resource_uri VARCHAR(256),
    thumbnail VARCHAR(256),
    PRIMARY KEY(id)
);