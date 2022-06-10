INSERT INTO author (name) VALUES ( 'Gárdonyi Géza');
INSERT INTO author (name) VALUES ( 'Jókai Mór');

INSERT INTO book (name) VALUES ( 'Egri Csillagok');
INSERT INTO book (name) VALUES ( 'Aranyember');
INSERT INTO book (name) VALUES ( 'Kőszívű ember fiai');

INSERT INTO book_authors (book_id, authors_id) VALUES (1,1);
INSERT INTO book_authors (book_id, authors_id) VALUES (2,2);
INSERT INTO book_authors (book_id, authors_id) VALUES (3,2);

INSERT INTO book_ratings (book_id, ratings) VALUES (1,5),(1,4),(1,5);
INSERT INTO book_ratings (book_id, ratings) VALUES (2,4),(2,4);