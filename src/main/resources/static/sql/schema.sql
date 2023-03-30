/*
    Test database.
 */
ALTER USER cardest WITH PASSWORD 'password';

DROP TABLE IF EXISTS USERS CASCADE;

CREATE TABLE IF NOT EXISTS USERS (ID SERIAL PRIMARY KEY,
                                  USERNAME VARCHAR(50) UNIQUE NOT NULL,
                                  PASSWORD VARCHAR(255) NOT NULL,
                                  FIRST_NAME VARCHAR(50) NOT NULL,
                                  FAMILY_NAME VARCHAR(50) NOT NULL,
                                  BIRTH_DATE DATE,
                                  EMAIL VARCHAR(255) NOT NULL ,
                                  PHONE VARCHAR(15) UNIQUE,
                                  ADDRESS VARCHAR(255),
                                  LOCALITY VARCHAR(50),
                                  ZIP VARCHAR(4),
                                  DRIVER_LICENSE_NUMBER VARCHAR(20) UNIQUE);

INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PASSWORD) VALUES ('jdoe','John','DOE', DATE '1990-01-01' ,'jdoe@example.com','password123');
INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PASSWORD) VALUES ('ksmith','Karen','SMITH', DATE '1985-05-12' ,'ksmith@gmail.com','letmein');
INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PASSWORD) VALUES ('abrown','Adam','BROWN', DATE '1983-12-05' ,'abrown@yahoo.com','password456');
INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PASSWORD) VALUES ('llee','Lisa','LEE', DATE '1995-06-18' ,'llee@hotmail.com','12345678');
INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PASSWORD) VALUES ('rwilliams','Robert','WILLIAMS', DATE '1992-03-27' ,'rwilliams@live.com','iloveyou');
INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PASSWORD) VALUES ('bterpperoni','Maxime','CURON', DATE '1997-09-24' ,'m.curon@outlook.com','password');