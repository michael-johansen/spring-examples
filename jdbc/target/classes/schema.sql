DROP TABLE IF EXISTS City;
CREATE TABLE City (
  ID          INT(11)      NOT NULL AUTO_INCREMENT,
  Name        VARCHAR2(35) NOT NULL DEFAULT '',
  CountryCode VARCHAR2(3)  NOT NULL DEFAULT '',
  District    VARCHAR2(20) NOT NULL DEFAULT '',
  Population  INT(11)      NOT NULL DEFAULT '0',
  PRIMARY KEY (ID)
);


DROP TABLE IF EXISTS Country;
CREATE TABLE Country (
  Code           VARCHAR2(3)   NOT NULL DEFAULT '',
  Name           VARCHAR2(52)  NOT NULL DEFAULT '',
  Continent      VARCHAR2(16)  NOT NULL DEFAULT 'Asia' CHECK Continent IN
                                                             ('Asia', 'Europe', 'North America', 'Africa', 'Oceania', 'Antarctica', 'South America'),
  Region         VARCHAR2(26)  NOT NULL DEFAULT '',
  SurfaceArea    NUMBER(10, 2) NOT NULL DEFAULT '0.00',
  IndepYear      INT(6) DEFAULT NULL,
  Population     INT(11)       NOT NULL DEFAULT '0',
  LifeExpectancy NUMBER(3, 1) DEFAULT NULL,
  GNP            NUMBER(10, 2) DEFAULT NULL,
  GNPOld         NUMBER(10, 2) DEFAULT NULL,
  LocalName      VARCHAR2(45)  NOT NULL DEFAULT '',
  GovernmentForm VARCHAR2(45)  NOT NULL DEFAULT '',
  HeadOfState    VARCHAR2(60) DEFAULT NULL,
  Capital        INT(11) DEFAULT NULL,
  Code2          VARCHAR2(2)   NOT NULL DEFAULT '',
  PRIMARY KEY (Code)
);

DROP TABLE IF EXISTS CountryLanguage;
CREATE TABLE CountryLanguage (
  CountryCode VARCHAR2(3)  NOT NULL DEFAULT '',
  Language    VARCHAR2(30) NOT NULL DEFAULT '',
  IsOfficial  VARCHAR2(1)  NOT NULL DEFAULT 'F' CHECK IsOfficial IN ('T', 'F'),
  Percentage  NUMBER(4, 1) NOT NULL DEFAULT '0.0',
  PRIMARY KEY (CountryCode, Language)
);
