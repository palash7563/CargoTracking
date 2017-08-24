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
  `adminid` int(10) unsigned NOT NULL,
  `name` varchar(60) NOT NULL,
  `password` varchar(45) NOT NULL,
  `picture` varchar(105) NOT NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminid`,`name`,`password`,`picture`) VALUES 
 (1,'Vikash','123','vikas.jpg'),
 (2,'Ankit','123','ankit.jpg');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `city`
--

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `stateid` int(40) unsigned NOT NULL,
  `cityid` int(40) unsigned NOT NULL,
  `cityname` varchar(45) NOT NULL,
  PRIMARY KEY  (`cityid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`stateid`,`cityid`,`cityname`) VALUES 
 (3,1,'Howrah'),
 (3,2,'kolkata'),
 (3,3,'Vaidyabati'),
 (3,4,'Khagragpur'),
 (3,5,'Vardhman'),
 (5,6,'Allepy'),
 (5,7,'Thirunvanthrapuram'),
 (5,8,'Malabar'),
 (4,9,'Puri'),
 (4,10,'Bhuvneshwar');
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
  `address` varchar(150) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `deals_in` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `firmlogo` varchar(200) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consignee`
--

/*!40000 ALTER TABLE `consignee` DISABLE KEYS */;
INSERT INTO `consignee` (`id`,`firmname`,`registration_no`,`ownername`,`contactperson`,`mobileno`,`phoneno`,`email`,`address`,`country`,`state`,`city`,`deals_in`,`website`,`firmlogo`,`password`) VALUES 
 (2,'Samsung','1609','Mr Chang','Mr MIttal','8982063790','222','hj@gmail.com','sds','91','3','1','Electronics','www.kjs.com','C:UsersUserPicturesjdata1	ooltipsimage3.jpg','123'),
 (3,'APPO','151002','Mr Vishasd','Mr Ray','7999520918','444412','Gsd@gmail.com','sdsd','91','4','9','Wepons','www.fedx.com','grace_3-wallpaper-1280x768.jpg','aaa');
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
  `address` varchar(150) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `deals_in` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `firmlogo` varchar(200) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consigner`
--

/*!40000 ALTER TABLE `consigner` DISABLE KEYS */;
INSERT INTO `consigner` (`id`,`firmname`,`registration_no`,`ownername`,`contactperson`,`mobileno`,`phoneno`,`email`,`address`,`country`,`state`,`city`,`deals_in`,`website`,`firmlogo`,`password`) VALUES 
 (4,'aa','aa','aa','aa','aaaa','aa','aa','aa','aa','aa','aa','aa','aa','aa','aa'),
 (5,'Canon','11','11','11','null','null','11','11','91','3','2','dsd','sd','brand2.png','ss'),
 (6,'sds','ss','ss','ss','null','d','d','d','91','3','3','dd','dd','bullet.png','dd'),
 (8,'XOLO','1510091','Mr King Jung Li','Mr Singh','7999520918','100','sos@gmail.com','Near Tirupai BAjaj SBi Hazeera','91','3','2','Electronics','Www.samsung.com','second.jpg','sss');
/*!40000 ALTER TABLE `consigner` ENABLE KEYS */;


--
-- Definition of table `country`
--

DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `countryid` int(10) unsigned NOT NULL,
  `countryname` varchar(100) NOT NULL,
  PRIMARY KEY  (`countryid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`countryid`,`countryname`) VALUES 
 (1,'USA'),
 (41,'Switzerland'),
 (46,'Serden'),
 (81,'Japan'),
 (82,'South Korea'),
 (91,'India'),
 (94,'SriLanka'),
 (880,'Bangladesh');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


--
-- Definition of table `crm`
--

DROP TABLE IF EXISTS `crm`;
CREATE TABLE `crm` (
  `Trackingid` int(10) unsigned NOT NULL,
  `EmployeeID` int(10) unsigned NOT NULL,
  `Curdate` varchar(45) NOT NULL,
  `Currtime` varchar(45) NOT NULL,
  `Conversation` varchar(200) NOT NULL,
  `Action` varchar(45) NOT NULL,
  `TransactionID` int(50) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`TransactionID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `crm`
--

/*!40000 ALTER TABLE `crm` DISABLE KEYS */;
INSERT INTO `crm` (`Trackingid`,`EmployeeID`,`Curdate`,`Currtime`,`Conversation`,`Action`,`TransactionID`) VALUES 
 (23,3,'09/08/17','4.44pm','ABCD','Dispatched',7);
/*!40000 ALTER TABLE `crm` ENABLE KEYS */;


--
-- Definition of table `dispatch`
--

DROP TABLE IF EXISTS `dispatch`;
CREATE TABLE `dispatch` (
  `employeeid` int(10) unsigned NOT NULL,
  `transactionid` int(20) unsigned NOT NULL auto_increment,
  `dispatchdate` varchar(45) NOT NULL,
  `dispatchtime` varchar(45) NOT NULL,
  `consignerid` int(10) unsigned NOT NULL,
  `consigneeid` int(10) unsigned NOT NULL,
  `productdesc` varchar(100) NOT NULL,
  `producttype` varchar(45) NOT NULL,
  `totalbox` varchar(45) NOT NULL,
  `quaintity_in_box` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `chargedispatch` varchar(45) NOT NULL,
  `dispatchfrom` varchar(45) NOT NULL,
  `dispatchto` varchar(45) NOT NULL,
  `dispacthBy` varchar(45) NOT NULL,
  `veichelNo` varchar(45) NOT NULL,
  `approxday` varchar(45) NOT NULL,
  `latitude` varchar(45) NOT NULL,
  `longitude` varchar(45) NOT NULL,
  PRIMARY KEY  (`transactionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dispatch`
--

/*!40000 ALTER TABLE `dispatch` DISABLE KEYS */;
INSERT INTO `dispatch` (`employeeid`,`transactionid`,`dispatchdate`,`dispatchtime`,`consignerid`,`consigneeid`,`productdesc`,`producttype`,`totalbox`,`quaintity_in_box`,`amount`,`chargedispatch`,`dispatchfrom`,`dispatchto`,`dispacthBy`,`veichelNo`,`approxday`,`latitude`,`longitude`) VALUES 
 (23,2,'2','2',5,2,'ee','Solid','e2','e','e','2','e','2','Air','e','d','',''),
 (3,3,'2017/7/28','2017/7/28',8,2,'jhghjghjhgjhghjghjg','Liquid','4','3','3','3','rdrd','drtdrt','Air','43453','3','',''),
 (3,4,'2017/7/28','2017/7/28',8,2,'jhkjhk','Solid','3','4','4','23','hjgjhgh','hghjghj','Air','453','2','',''),
 (3,5,'2017/7/28','11:29:44',8,2,'hjgjgj','Liquid','4','5','5','4','bjhbhj','hghjgjh','Sea Route','3','4443','',''),
 (3,6,'2017/7/28','11:31:41',8,2,'hhbhjb','Liquid','4','3','3','3','gccgc','tyftyfty','Sea Route','4343','4','',''),
 (3,7,'2017/7/28','11:36:34',8,2,'hgfhgf','Exploxives','4','4','4','4','gfhgfg','gjgjvj','Road','45564','5','',''),
 (3,8,'2017/7/28','11:48:24',8,2,'gjjhgh','Liquid','32','3','3','33','uhui','uhiu','Road','54654','4','',''),
 (3,9,'2017/7/28','11:52:7',8,2,'hjhjgjyhg','Liquid','4','3','3','fgfhg','fhfgh','fhgfgh','Sea Route','455','3','',''),
 (3,10,'2017/7/28','2017/7/28',8,3,'hhgg','Liquid','gv','gg','gg','cc','gt','g','Sea Route','n','h','',''),
 (3,11,'2017/7/28','2017/7/28',8,3,'asa','Solid','sa','as','as','as','as','as','Air','as','as','',''),
 (3,12,'2017/7/28','2017/7/28',8,3,'as','Liquid','asa','as','as','asa','as','s','Sea Route','as','as','',''),
 (3,13,'2017/7/28','2017/7/28',8,3,'as','Exploxives','asa','as','as','asa','asa','as','Sea Route','as','as','',''),
 (3,14,'2017/7/28','2017/7/28',8,3,'as','Others','as','as','as','as','as','as','Air','as','as','',''),
 (3,15,'2017/7/28','2017/7/28',8,3,'sds','Solid','sd','sd','sd','ds','sd','sd','Sea Route','sd','sd','',''),
 (3,16,'2017/7/28','1:41:8',8,3,'ASD','Liquid','sa','as','as','as','SA','SA','Sea Route','as','SA','',''),
 (3,17,'2017/7/28','1:44:47',8,3,'ASD','Liquid','AS','asAS','asAS','as','as','as','Sea Route','as','AS','',''),
 (3,18,'2017/7/28','1:48:7',6,2,'SD','Solid','sd','sd','sd','ds','D','D','Road','D','D','',''),
 (3,19,'2017/7/28','1:52:21',8,3,'ss','Liquid','sd','sd','sd','dsd','ds','ds','Sea Route','sd','sd','',''),
 (3,20,'2017/7/28','1:59:45',8,3,'ASD','Liquid','sd','sd','sd','ds','sd','sd','Air','DS','D','',''),
 (3,21,'2017/7/28','2:21:35',8,3,'dd','Liquid','dd','dd','dd','dd','dd','Dd','Air','Dd','dd','',''),
 (3,22,'2017/7/28','2:47:55',8,3,'das','Solid','AS','as','as','as','as','as','Road','as','asa','s','s'),
 (3,23,'2017/7/28','2:48:23',8,3,'SD','Liquid','ds','sd','sd','ds','sd','D','Air','sd','D','ddd','d'),
 (3,24,'2017/7/28','3:34:34',8,3,'SD','Exploxives','ss','sdsd','sdsd','ss','ss','ss','Sea Route','ss','Ss','ss','ss');
/*!40000 ALTER TABLE `dispatch` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employeeid` int(10) unsigned NOT NULL auto_increment,
  `employeename` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `address` varchar(150) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `qualification` varchar(45) NOT NULL,
  `designation` varchar(45) NOT NULL,
  `photograph` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`employeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`employeeid`,`employeename`,`dob`,`address`,`country`,`state`,`city`,`Phone`,`mobile`,`qualification`,`designation`,`photograph`,`password`) VALUES 
 (3,'Sneha','21-10-1997','near kolkata road kali ka mandir hazzera','91','3','2','9431493341','9801397709','CA','Engineer','image3.jpg','asd');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `state`
--

DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `countryid` int(10) unsigned NOT NULL,
  `stateid` int(10) unsigned NOT NULL,
  `statename` varchar(100) NOT NULL,
  PRIMARY KEY  USING BTREE (`stateid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `state`
--

/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` (`countryid`,`stateid`,`statename`) VALUES 
 (91,1,'Andhra Pradesh'),
 (91,2,'bihar'),
 (91,3,'west bengal'),
 (91,4,'Odisha'),
 (91,5,'Kerela'),
 (1,6,'California'),
 (1,7,'Florida'),
 (1,8,'Coloroda'),
 (1,9,'Nevada'),
 (1,10,'Utah'),
 (81,11,'Hokaiydo'),
 (81,12,'Okinama'),
 (81,13,'Kansai'),
 (81,14,'akita'),
 (81,15,'akita'),
 (82,16,'jejuto'),
 (82,17,'jeolla'),
 (82,18,'Givon '),
 (82,19,'gyeongsang '),
 (82,20,'north chungchang ');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;


--
-- Definition of table `tracking`
--

DROP TABLE IF EXISTS `tracking`;
CREATE TABLE `tracking` (
  `trackingtranscationid` int(10) unsigned NOT NULL auto_increment,
  `trackingid` int(10) unsigned NOT NULL,
  `employeeid` int(10) unsigned NOT NULL,
  `tdate` varchar(40) NOT NULL,
  `ttime` varchar(45) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `lat` varchar(45) NOT NULL,
  `lng` varchar(45) NOT NULL,
  `consignerid` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`trackingtranscationid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tracking`
--

/*!40000 ALTER TABLE `tracking` DISABLE KEYS */;
INSERT INTO `tracking` (`trackingtranscationid`,`trackingid`,`employeeid`,`tdate`,`ttime`,`description`,`lat`,`lng`,`consignerid`) VALUES 
 (1,15,3,'2017-07-28','2017/7/28','Dispatch From:sd\rDispatch To:sd\rDispatch By:Sea Route\rVehicle No: sd','0','0',8),
 (2,16,3,'2017-07-28','1:41:8','Dispatch From:SA\rDispatch To:SA\rDispatch By:Sea Route\rVehicle No: as','0','0',0),
 (3,17,3,'2017-07-28','1:44:47','Dispatch From:as\rDispatch To:as\rDispatch By:Sea Route\rVehicle No: as','0','0',0),
 (4,18,3,'2017-07-28','1:48:7','Dispatch From:D\rDispatch To:D\rDispatch By:Road\rVehicle No: D','0','0',0),
 (5,19,3,'2017-07-28','1:52:21','Dispatch From:ds\rDispatch To:ds\rDispatch By:Sea Route\rVehicle No: sd','0','0',0),
 (6,20,3,'2017-07-28','1:59:45','Dispatch From:sd\rDispatch To:sd\rDispatch By:Air\rVehicle No: DS','0','0',0),
 (7,21,3,'2017-07-28','2:21:35','Dispatch From:dd\rDispatch To:Dd\rDispatch By:Air\rVehicle No: Dd','0','0',0),
 (8,22,3,'2017-07-28','2:47:55','Dispatch From:as\rDispatch To:as\rDispatch By:Road\rVehicle No: as','s','s',0),
 (9,23,3,'2017-07-28','2:48:23','Dispatch From:sd\rDispatch To:D\rDispatch By:Air\rVehicle No: sd','ddd','d',0);
/*!40000 ALTER TABLE `tracking` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
