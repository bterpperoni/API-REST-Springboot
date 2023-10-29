/*
    Test database.
 */
ALTER USER cardest WITH PASSWORD 'qdzs';

DROP TABLE IF EXISTS USERS,ADDRESS,TRAVEL,DESTINATIONS CASCADE;

CREATE TABLE IF NOT EXISTS USERS (ID SERIAL PRIMARY KEY,
                                  USERNAME VARCHAR(50) UNIQUE NOT NULL,
                                  FIRST_NAME VARCHAR(50) NOT NULL,
                                  FAMILY_NAME VARCHAR(50) NOT NULL,
                                  BIRTH_DATE DATE,
                                  EMAIL VARCHAR(255) NOT NULL UNIQUE,
                                  PHONE VARCHAR(15) UNIQUE,
                                  ADDRESS VARCHAR(255),
                                  LOCALITY VARCHAR(50),
                                  ZIP VARCHAR(4),
                                  DRIVER_LICENSE_NUMBER VARCHAR(20) UNIQUE,
                                  IS_NEW BOOLEAN);

/*CREATE TABLE IF NOT EXISTS DESTINATIONS (ID SERIAL PRIMARY KEY,
                                        NAME VARCHAR(50) NOT NULL,
                                        ADDRESS VARCHAR(255) NOT NULL,
                                        LOCALITY VARCHAR(50) NOT NULL,
                                        ZIP VARCHAR(4) NOT NULL,
                                        LATITUDE DOUBLE PRECISION,
                                        LONGITUDE DOUBLE PRECISION);*/

CREATE TABLE IF NOT EXISTS ADDRESS(ID SERIAL PRIMARY KEY,
                                    USER_ID INTEGER,
                                    ADDRESS VARCHAR(255) NOT NULL,
                                    LOCALITY VARCHAR(50) NOT NULL,
                                    ZIP VARCHAR(4) NOT NULL,
                                    LATITUDE DOUBLE PRECISION,
                                    LONGITUDE DOUBLE PRECISION);

CREATE TABLE IF NOT EXISTS TRAVEL(ID SERIAL PRIMARY KEY,
                                    DRIVER_ID INTEGER,
                                    PASSENGER_ID INTEGER,
                                    CHECK_POINT VARCHAR(50),
                                    DEPARTURE VARCHAR(50) NOT NULL,
                                    DEPARTURE_DATE DATE NOT NULL,
                                    DEPARTURE_TIME TIME NOT NULL,
                                    DESTINATION VARCHAR(50) NOT NULL,
                                    DESTINATION_DATE DATE NOT NULL,
                                    DESTINATION_TIME TIME,
                                    PRICE DOUBLE PRECISION,
                                    VALIDATED BOOLEAN DEFAULT FALSE);

INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PHONE, ADDRESS, LOCALITY, ZIP)
VALUES ('bobsmith', 'Bob', 'Smith', '1970-10-01', 'bobsmith@example.com', '555-5678', '789 Elm St', 'Anyville', '6789');
INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, ADDRESS, LOCALITY, ZIP)
VALUES ('janedoe', 'Jane', 'Doe', '1995-01-01', 'janedoe@example.com', '456 Park Ave', 'Anycity', '5678');
INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PHONE, ADDRESS, LOCALITY, ZIP, DRIVER_LICENSE_NUMBER)
VALUES ('johnsmith', 'John', 'Smith', '1985-05-15', 'johnsmith@example.com', '555-1234', '123 Main St', 'Anytown', '1234', 'AB123456');



