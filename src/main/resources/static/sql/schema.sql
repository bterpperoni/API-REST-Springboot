/*
    Test database.
 */
ALTER USER cardest WITH PASSWORD 'password';

DROP TABLE IF EXISTS USERS CASCADE;

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
                                  DRIVER_LICENSE_NUMBER VARCHAR(20) UNIQUE);

INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PHONE, ADDRESS, LOCALITY, ZIP)
VALUES ('bobsmith', 'Bob', 'Smith', '1970-10-01', 'bobsmith@example.com', '555-5678', '789 Elm St', 'Anyville', '6789');
INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, ADDRESS, LOCALITY, ZIP)
VALUES ('janedoe', 'Jane', 'Doe', '1995-01-01', 'janedoe@example.com', '456 Park Ave', 'Anycity', '5678');
INSERT INTO USERS (USERNAME, FIRST_NAME, FAMILY_NAME, BIRTH_DATE, EMAIL, PHONE, ADDRESS, LOCALITY, ZIP, DRIVER_LICENSE_NUMBER)
VALUES ('johnsmith', 'John', 'Smith', '1985-05-15', 'johnsmith@example.com', '555-1234', '123 Main St', 'Anytown', '1234', 'AB123456');


