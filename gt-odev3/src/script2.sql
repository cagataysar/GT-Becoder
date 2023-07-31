--2. Bu tabloları dolduran insert scriptler yazınız. Ligi olmayan takım
INSERT INTO Country(name) VALUES ('JAPAN');

INSERT INTO Player (
    name,surname,goalscored,team_id, country_id
)
VALUES (
    'Ronaldo', 'Nazario', 9999, 5, 6
);


--3. İsmi “Türkiye” olan ülkenin liglerinin listesini getiren scripti yazınız
SELECT League.* FROM League
JOIN Country ON League.country_id=Country.country_id
WHERE Country.name='TÜRKİYE';

--4. İsmi “Türkiye” olan ülkenin takımların listesini getiren scripti yazınız.
