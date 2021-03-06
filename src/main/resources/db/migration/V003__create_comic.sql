CREATE TABLE comic (
    id INTEGER NOT NULL,
    digital_id INTEGER,
    title VARCHAR(256) NOT NULL,
    issue_number INTEGER,
    variant_description VARCHAR(256),
    modified TIMESTAMP,
    isbn VARCHAR(256),
    upc VARCHAR(256),
    diamond_code VARCHAR(256),
    ean VARCHAR(256),
    issn VARCHAR(256),
    format VARCHAR(256),
    page_count INTEGER ,
    PRIMARY KEY(id)
);