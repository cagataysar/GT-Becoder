--1. Yukarıdaki tabloların create scriptlerini oluşturunuz.
CREATE TABLE League
(
    league_id SERIAL NOT NULL,
    name VARCHAR NOT NULL,
    country_id SERIAL
    PRIMARY KEY (league_id),
    FOREIGN KEY (country_id) REFERENCES Country(country_id)

);

CREATE TABLE Player
(
    player_id SERIAL NOT NULL,
    name VARCHAR NOT NULL,
    surname VARCHAR,
    goalScored INTEGER,
    team_id SERIAL,
    country_id SERIAL,
    PRIMARY KEY (player_id),
    FOREIGN KEY (country_id) REFERENCES Country(country_id),
    FOREIGN KEY (team_id) REFERENCES Team(team_id)
);