CREATE TABLE story (
    id INTEGER NOT NULL,
    title VARCHAR(256) NOT NULL,
    description VARCHAR(256),
    type VARCHAR(256),
    modified TIMESTAMP,
    PRIMARY KEY(id)
);