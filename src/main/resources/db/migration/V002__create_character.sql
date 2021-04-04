CREATE TABLE character (
    id INTEGER NOT NULL,
    name VARCHAR(256) NOT NULL,
    description VARCHAR(256),
    modified TIMESTAMP,
    PRIMARY KEY(id)
);