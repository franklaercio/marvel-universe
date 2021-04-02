CREATE TABLE series (
    id INTEGER NOT NULL,
    title VARCHAR(256),
    description VARCHAR(256),
    resource_uri VARCHAR(256),
    start_year INTEGER,
    end_year INTEGER,
    rating TIMESTAMP,
    modified TIMESTAMP,
    thumbnail VARCHAR(256),
    PRIMARY KEY(id)
);