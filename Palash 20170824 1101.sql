-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.33-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cargotracking
--

CREATE DATABASE IF NOT EXISTS cargotracking;
USE cargotracking;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` int(10) unsigned NOT NULL auto_increment,
  `adminname` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `picture` varchar(45) NOT NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminid`,`adminname`,`password`,`picture`) VALUES 
 (100,'Palash Gupta','palash98989','palash.jpg'),
 (200,'Dev Pawar','dev','dev.jpg');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `city`
--

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `cityid` int(10) unsigned NOT NULL auto_increment,
  `stateid` int(10) unsigned NOT NULL,
  `cityname` varchar(45) NOT NULL,
  PRIMARY KEY  (`cityid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`cityid`,`stateid`,`cityname`) VALUES 
 (1,1,'Gwalior'),
 (2,1,'Indore'),
 (3,2,'Agra'),
 (4,2,'kanpur'),
 (5,3,'Punjab'),
 (6,4,'Karachi'),
 (7,5,'Pak pak pakkka');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;


--
-- Definition of table `consignee`
--

DROP TABLE IF EXISTS `consignee`;
CREATE TABLE `consignee` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `firmname` varchar(45) NOT NULL,
  `registration_no` varchar(45) NOT NULL,
  `ownername` varchar(45) NOT NULL,
  `contactperson` varchar(45) NOT NULL,
  `mobileno` varchar(45) NOT NULL,
  `phoneno` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `deals_in` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `firmlogo` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consignee`
--

/*!40000 ALTER TABLE `consignee` DISABLE KEYS */;
INSERT INTO `consignee` (`id`,`firmname`,`registration_no`,`ownername`,`contactperson`,`mobileno`,`phoneno`,`email`,`address`,`country`,`state`,`city`,`deals_in`,`website`,`firmlogo`,`password`) VALUES 
 (1,'Palash','HO100','Himanshu gupta','Plaash','null','90099','asdi@gmail.com','24/18 Ganga Colony Near Aron Bus Stand','91','1','1','aikqdsh','wsafed','20170325_113758.jpg','123'),
 (2,'kg','kiug','kjhb','kjb','null','1234','sdc@gmail.com','dergf','91','2','3','sdc','sdv','20170419_121043.jpg','123'),
 (3,'gjg','gjh','gjh','jh','null','1234','jiug@gjkhsdbc.com','wkfg','91','1','1','kv','asde.com','20170419_121051.jpg','123'),
 (4,'Nahar Sate Nashe','Nashe100','SHivam Nahar','Shivam Nahar','999999999','999999999','naharsastenashe.com','Nashe colony','91','1','1','Saste Nashe','Nashe.com','IMG_20170511_020900.jpg','123'),
 (5,'Himanshu','jhas','Palasj','asjdhb','7999520918','56789','kshgc@sjdhb.com','jwhdhdbch','91','2','4','sjadhvbchjvcvjhavscxjvajsxvcajhsxvh','jsdc.com','20170325_113758.jpg','123');
/*!40000 ALTER TABLE `consignee` ENABLE KEYS */;


--
-- Definition of table `consigner`
--

DROP TABLE IF EXISTS `consigner`;
CREATE TABLE `consigner` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `firmname` varchar(45) NOT NULL,
  `registration_no` varchar(45) NOT NULL,
  `ownername` varchar(45) NOT NULL,
  `contactperson` varchar(45) NOT NULL,
  `mobileno` varchar(45) NOT NULL,
  `phoneno` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `deals_in` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `firmlogo` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consigner`
--

/*!40000 ALTER TABLE `consigner` DISABLE KEYS */;
INSERT INTO `consigner` (`id`,`firmname`,`registration_no`,`ownername`,`contactperson`,`mobileno`,`phoneno`,`email`,`address`,`country`,`state`,`city`,`deals_in`,`website`,`firmlogo`,`password`) VALUES 
 (1,'jhibg','jhbgjhvb','jh','gbjh','9876','987','gjh@jabhd.com','jh','92','4','6','asd','awef','img-20160312-wa0006.jpg','123'),
 (2,'Himanshu Paper Prodcuts','Hp100','Sanjay Gupta','Palash gupta','8358004129','9406988415','palashg7563@gmail.com','24/18 Ganga Colony Near Aron Bus Stand','91','1','1','Paper Products','palash.com','img-20160312-wa0006.jpg','123'),
 (3,'Himanshu Paper Prodcuts','Hp100','Himanshu gupta','Palash gupta','8982063790','9406988415','palashg7563@gmail.com','24/18 Ganga Colony Near Aron Bus Stand','-Select-','-Select-','-Select-','Paper Products','palash.com','','null');
/*!40000 ALTER TABLE `consigner` ENABLE KEYS */;


--
-- Definition of table `country`
--

DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `countryid` int(10) unsigned NOT NULL auto_increment,
  `countryname` varchar(45) NOT NULL,
  PRIMARY KEY  (`countryid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`countryid`,`countryname`) VALUES 
 (91,'India'),
 (92,'Pakistan');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


--
-- Definition of table `dispatch`
--

DROP TABLE IF EXISTS `dispatch`;
CREATE TABLE `dispatch` (
  `employeeid` int(10) unsigned NOT NULL default '0',
  `transactionid` int(10) unsigned NOT NULL auto_increment,
  `dispatchdate` varchar(45) NOT NULL,
  `dispatchtime` varchar(45) NOT NULL,
  `consignerid` int(10) unsigned NOT NULL,
  `consigneeid` int(10) unsigned NOT NULL,
  `productdescription` varchar(45) NOT NULL,
  `producttype` varchar(45) NOT NULL,
  `totalbox` varchar(45) NOT NULL,
  `quantitybox` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `chargeofdispatch` varchar(45) NOT NULL,
  `dispatchfrom` varchar(45) NOT NULL,
  `dispatchto` varchar(45) NOT NULL,
  `route` varchar(45) NOT NULL,
  `vehicleno` varchar(45) NOT NULL,
  `approxdays` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`transactionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dispatch`
--

/*!40000 ALTER TABLE `dispatch` DISABLE KEYS */;
INSERT INTO `dispatch` (`employeeid`,`transactionid`,`dispatchdate`,`dispatchtime`,`consignerid`,`consigneeid`,`productdescription`,`producttype`,`totalbox`,`quantitybox`,`amount`,`chargeofdispatch`,`dispatchfrom`,`dispatchto`,`route`,`vehicleno`,`approxdays`) VALUES 
 (1,2,'2017-08-08','13:59',2,1,'12','Liquid','2','null','2','2','2','2','Road','2','2'),
 (1,6,'2017-08-01','12:59',1,1,'123','Liquid','123','null','23','123','123','123','Air','123','123'),
 (1,7,'0001-01-31','12:59',1,1,'uyg','Liquid','gugyu','null','ygyu','gyug','ugyug','uyg','Air','iyug','uy');
/*!40000 ALTER TABLE `dispatch` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employeeid` int(10) unsigned NOT NULL auto_increment,
  `employeename` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `qualification` varchar(45) NOT NULL,
  `designation` varchar(45) NOT NULL,
  `photograph` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`employeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`employeeid`,`employeename`,`dob`,`address`,`country`,`state`,`city`,`phone`,`mobile`,`qualification`,`designation`,`photograph`,`password`) VALUES 
 (1,'lkasdjn','1997/8/2','askdjn','92','4','6','876','986','jkasdb','sbf','20170413_133342.jpg','123');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `producttype`
--

DROP TABLE IF EXISTS `producttype`;
CREATE TABLE `producttype` (
  `producttype` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`producttype`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `producttype`
--

/*!40000 ALTER TABLE `producttype` DISABLE KEYS */;
INSERT INTO `producttype` (`producttype`) VALUES 
 ('Liquid'),
 ('Semi-Liquid'),
 ('Solid');
/*!40000 ALTER TABLE `producttype` ENABLE KEYS */;


--
-- Definition of table `route`
--

DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `route` varchar(45) NOT NULL,
  PRIMARY KEY  (`route`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `route`
--

/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` (`route`) VALUES 
 ('Air'),
 ('Road'),
 ('Train'),
 ('Water');
/*!40000 ALTER TABLE `route` ENABLE KEYS */;


--
-- Definition of table `state`
--

DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `stateid` int(10) unsigned NOT NULL auto_increment,
  `countryid` int(10) unsigned NOT NULL,
  `statename` varchar(45) NOT NULL,
  PRIMARY KEY  (`stateid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `state`
--

/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` (`stateid`,`countryid`,`statename`) VALUES 
 (1,91,'MP'),
 (2,91,'UP'),
 (3,91,'HP'),
 (4,92,'Sindh'),
 (5,92,'Punjab');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;


--
-- Definition of table `tracking`
--

DROP TABLE IF EXISTS `tracking`;
CREATE TABLE `tracking` (
  `trackingtransactionid` int(10) unsigned NOT NULL auto_increment,
  `trackingid` int(10) unsigned NOT NULL,
  `employeeid` int(10) unsigned NOT NULL,
  `tdate` varchar(45) NOT NULL,
  `ttime` varchar(45) NOT NULL,
  `description` varchar(100) NOT NULL,
  `lat` varchar(45) NOT NULL,
  `lng` varchar(45) NOT NULL,
  PRIMARY KEY  (`trackingtransactionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tracking`
--

/*!40000 ALTER TABLE `tracking` DISABLE KEYS */;
INSERT INTO `tracking` (`trackingtransactionid`,`trackingid`,`employeeid`,`tdate`,`ttime`,`description`,`lat`,`lng`) VALUES 
 (2,5,1,'2017-08-08','13:59','Dispatch From: 2\rDispatch To:2\rDisptach By :Road\r','0','0'),
 (3,6,1,'2017-08-01','12:59','Dispatch From: 123\rDispatch To:123\rDisptach By :Air\r','0','0'),
 (4,7,1,'0001-01-31','12:59','Dispatch From: ugyug\rDispatch To:uyg\rDisptach By :Air\r','0','0'),
 (5,6,1,'20/8.2017','4:40','akshd','90','09');
/*!40000 ALTER TABLE `tracking` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
