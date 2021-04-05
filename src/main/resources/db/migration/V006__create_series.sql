CREATE TABLE series (
    id INTEGER NOT NULL,
    title VARCHAR(256) NOT NULL,
    description VARCHAR(256),
    start_year INTEGER,
    end_year INTEGER,
    rating TIMESTAMP,
    modified TIMESTAMP,
    PRIMARY KEY(id)
);