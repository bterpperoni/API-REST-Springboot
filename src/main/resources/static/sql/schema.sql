/*
    Test database.
 */
ALTER USER cardest WITH PASSWORD '0000';

DROP TABLE IF EXISTS USERS,ADDRESS,TRAVEL,DESTINATIONS CASCADE;

CREATE TABLE IF NOT EXISTS USERS (ID SERIAL PRIMARY KEY,
                                  USERNAME VARCHAR(50) UNIQUE NOT NULL,
                                  FIRST_NAME VARCHAR(50) NOT NULL,
                                  FAMILY_NAME VARCHAR(50) NOT NULL,
                                  BIRTH_DATE DATE,
                                  EMAIL VARCHAR(255) NOT NULL UNIQUE ,
                                  PHONE VARCHAR(15) UNIQUE,
                                  ADDRESS VARCHAR(255),
                                  LOCALITY VARCHAR(50),
                                  ZIP VARCHAR(4),
                                  DRIVER_LICENSE_NUMBER VARCHAR(20) UNIQUE,
                                  IS_NEW BOOLEAN);

CREATE TABLE IF NOT EXISTS DESTINATIONS (ID SERIAL PRIMARY KEY,
                                        NAME VARCHAR(50) NOT NULL,
                                        ADDRESS VARCHAR(255) NOT NULL,
                                        LOCALITY VARCHAR(50) NOT NULL,
                                        ZIP VARCHAR(4) NOT NULL,
                                        LATITUDE DOUBLE PRECISION,
                                        LONGITUDE DOUBLE PRECISION);

CREATE TABLE IF NOT EXISTS ADDRESS(ID SERIAL PRIMARY KEY,
                                    USER_ID INTEGER REFERENCES USERS(ID) ON DELETE CASCADE,
                                    ADDRESS VARCHAR(255) NOT NULL,
                                    LOCALITY VARCHAR(50) NOT NULL,
                                    ZIP VARCHAR(4) NOT NULL,
                                    LATITUDE DOUBLE PRECISION,
                                    LONGITUDE DOUBLE PRECISION);

CREATE TABLE IF NOT EXISTS TRAVEL  (ID SERIAL PRIMARY KEY,
                                    DRIVER_ID INTEGER REFERENCES USERS(ID) ON DELETE CASCADE,
                                    PASSENGER_ID INTEGER REFERENCES USERS(ID) ON DELETE CASCADE,
                                    CHECK_POINT INTEGER REFERENCES ADDRESS(ID) ON DELETE CASCADE,
                                    DATE DATE NOT NULL,
                                    DEPARTURE VARCHAR(50) NOT NULL,
                                    DESTINATION VARCHAR(50) NOT NULL,
                                    DISTANCE INTEGER NOT NULL,
                                    PRICE INTEGER,
                                    VALIDATED BOOLEAN DEFAULT FALSE);

INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PHONE, ADDRESS, LOCALITY, ZIP)
VALUES ('bobsmith', 'Bob', 'Smith', '1970-10-01', 'bobsmith@example.com', '555-5678', '789 Elm St', 'Anyville', '6789');
INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, ADDRESS, LOCALITY, ZIP)
VALUES ('janedoe', 'Jane', 'Doe', '1995-01-01', 'janedoe@example.com', '456 Park Ave', 'Anycity', '5678');
INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PHONE, ADDRESS, LOCALITY, ZIP, DRIVER_LICENSE_NUMBER)
VALUES ('johnsmith', 'John', 'Smith', '1985-05-15', 'johnsmith@example.com', '555-1234', '123 Main St', 'Anytown', '1234', 'AB123456');

INSERT INTO DESTINATIONS (NAME, ADDRESS, LOCALITY, ZIP, LATITUDE, LONGITUDE) VALUES
('Université de Mons', 'Place du Parc 20', 'Mons', '7000', 50.455185, 3.951430),
('Fac. Polytechnique de Mons', 'Rue de Houdain 9', 'Mons', '7000', 50.454583, 3.952131),
('Haute Ecole Louvain en Hainaut', 'Rue du Grand Trou Oudart 55', 'Mons', '7000', 50.457436, 3.946942),
('HeH - Campus Technique', 'Avenue Victor Maistriau 15', 'Mons', '7000', 50.463727, 3.938247);


