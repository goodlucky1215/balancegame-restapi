DROP TABLE statistics;
DROP TABLE question;
DROP TABLE catalog;

INSERT INTO catalog VALUES(1, '음식');
INSERT INTO question VALUES('QEFSMFSAQ', null, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, CURRENT_TIMESTAMP, 'abc', 1);
INSERT INTO statistics VALUES(1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1);
INSERT INTO statistics VALUES(1, 2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0);
