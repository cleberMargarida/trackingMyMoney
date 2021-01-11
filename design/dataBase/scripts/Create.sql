-- SCRIPT CREATES
CREATE TABLE USER_PROFILE(
	ID VARCHAR(32) NOT NULL,
	USERNAME VARCHAR(32) NOT NULL,
	PASSWORD VARCHAR(32) NOT NULL,
);

-- PRIMARY KEYS
ALTER TABLE USER_PROFILE 
ADD CONSTRAINT PK_USER_PROFILE PRIMARY KEY(ID);

ALTER TABLE USER_PROFILE
ADD CONSTRAINT UK_USERNAME UNIQUE KEY(USERNAME);