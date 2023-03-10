/*
    Test database.
 */
ALTER USER cardest WITH PASSWORD 'password';

DROP TABLE IF EXISTS USERS CASCADE;

CREATE TABLE IF NOT EXISTS USERS (ID SERIAL PRIMARY KEY,
                                  USERNAME VARCHAR(50) UNIQUE NOT NULL,
                                  FIRST_NAME VARCHAR(50) NOT NULL,
                                  FAMILY_NAME VARCHAR(50) NOT NULL,
                                  EMAIL VARCHAR(255) NOT NULL ,
                                  PASSWORD VARCHAR(255) NOT NULL,
                                  PHONE VARCHAR(15) UNIQUE,
                                  ADDRESS VARCHAR(255),
                                  LOCALITY VARCHAR(50),
                                  ZIP VARCHAR(4),
                                  DRIVER_LICENSE_NUMBER VARCHAR(20) UNIQUE);

INSERT INTO USERS(USERNAME, FIRST_NAME, FAMILY_NAME, EMAIL, PASSWORD) VALUES ('bterpperoni','Maxime','CURON', 'm.curon@outlook.com','password');