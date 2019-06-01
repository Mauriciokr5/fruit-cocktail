-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: database_pa
-- ------------------------------------------------------
-- Server version	5.7.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `random`
--

DROP TABLE IF EXISTS `random`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `random` (
  `idMenu` int(2) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `random`
--

LOCK TABLES `random` WRITE;
/*!40000 ALTER TABLE `random` DISABLE KEYS */;
INSERT INTO `random` VALUES (20,'2018-05-01'),(13,'2018-05-02'),(18,'2018-05-03'),(21,'2018-05-04'),(5,'2018-05-05'),(6,'2018-05-06'),(20,'2018-05-07'),(15,'2018-05-08'),(10,'2018-05-09'),(19,'2018-05-10'),(20,'2018-05-11'),(5,'2018-05-12'),(8,'2018-05-13'),(8,'2018-05-14'),(14,'2018-05-15'),(9,'2018-05-16'),(21,'2018-05-17'),(12,'2018-05-18'),(15,'2018-05-19'),(20,'2018-05-20'),(10,'2018-05-21'),(18,'2018-05-22'),(8,'2018-05-23'),(4,'2018-05-24'),(6,'2018-05-25'),(12,'2018-05-26'),(13,'2018-05-27'),(3,'2018-05-28'),(17,'2018-05-29'),(18,'2018-05-30'),(15,'2018-05-31'),(14,'2018-01-01'),(11,'2018-01-02'),(20,'2018-01-03'),(19,'2018-01-04'),(9,'2018-01-05'),(19,'2018-01-08'),(20,'2018-01-09'),(7,'2018-01-10'),(10,'2018-01-11'),(8,'2018-01-12'),(9,'2018-01-15'),(10,'2018-01-16'),(4,'2018-01-17'),(11,'2018-01-18'),(3,'2018-01-19'),(3,'2018-01-22'),(6,'2018-01-23'),(8,'2018-01-24'),(18,'2018-01-25'),(10,'2018-01-26'),(11,'2018-01-29'),(18,'2018-01-30'),(5,'2018-01-31'),(21,'2018-02-01'),(14,'2018-02-02'),(16,'2018-02-05'),(8,'2018-02-06'),(21,'2018-02-07'),(20,'2018-02-08'),(4,'2018-02-09'),(11,'2018-02-12'),(14,'2018-02-13'),(3,'2018-02-14'),(14,'2018-02-15'),(6,'2018-02-16'),(12,'2018-02-19'),(16,'2018-02-20'),(11,'2018-02-21'),(11,'2018-02-22'),(8,'2018-02-23'),(20,'2018-02-26'),(19,'2018-02-27'),(4,'2018-02-28'),(1,'2018-03-01'),(8,'2018-03-02'),(18,'2018-03-05'),(7,'2018-03-06'),(17,'2018-03-07'),(8,'2018-03-08'),(13,'2018-03-09'),(19,'2018-03-12'),(13,'2018-03-13'),(1,'2018-03-14'),(3,'2018-03-15'),(17,'2018-03-16'),(4,'2018-03-19'),(11,'2018-03-20'),(18,'2018-03-21'),(2,'2018-03-22'),(11,'2018-03-23'),(16,'2018-03-26'),(13,'2018-03-27'),(8,'2018-03-28'),(2,'2018-03-29'),(12,'2018-03-30'),(19,'2018-04-02'),(2,'2018-04-03'),(21,'2018-04-04'),(6,'2018-04-05'),(11,'2018-04-06'),(1,'2018-04-09'),(17,'2018-04-10'),(14,'2018-04-11'),(19,'2018-04-12'),(10,'2018-04-13'),(9,'2018-04-16'),(14,'2018-04-17'),(16,'2018-04-18'),(21,'2018-04-19'),(16,'2018-04-20'),(11,'2018-04-23'),(3,'2018-04-24'),(18,'2018-04-25'),(3,'2018-04-26'),(10,'2018-04-27'),(16,'2018-04-30'),(12,'2018-06-01'),(8,'2018-06-04'),(5,'2018-06-05'),(3,'2018-06-06'),(15,'2018-06-07'),(7,'2018-06-08'),(11,'2018-06-11'),(3,'2018-06-12'),(4,'2018-06-13'),(4,'2018-06-14'),(13,'2018-06-15'),(21,'2018-06-18'),(18,'2018-06-19'),(1,'2018-06-20'),(3,'2018-06-21'),(9,'2018-06-22'),(13,'2018-06-25'),(11,'2018-06-26'),(17,'2018-06-27'),(8,'2018-06-28'),(9,'2018-06-29'),(6,'2018-07-02'),(21,'2018-07-03'),(13,'2018-07-04'),(2,'2018-07-05'),(1,'2018-07-06'),(11,'2018-07-09'),(12,'2018-07-10'),(10,'2018-07-11'),(20,'2018-07-12'),(12,'2018-07-13'),(5,'2018-07-16'),(7,'2018-07-17'),(15,'2018-07-18'),(9,'2018-07-19'),(20,'2018-07-20'),(2,'2018-07-23'),(18,'2018-07-24'),(1,'2018-07-25'),(20,'2018-07-26'),(10,'2018-07-27'),(15,'2018-07-30'),(2,'2018-07-31'),(14,'2018-08-01'),(5,'2018-08-02'),(6,'2018-08-03'),(16,'2018-08-06'),(21,'2018-08-07'),(19,'2018-08-08'),(6,'2018-08-09'),(2,'2018-08-10'),(9,'2018-08-13'),(10,'2018-08-14'),(9,'2018-08-15'),(8,'2018-08-16'),(21,'2018-08-17'),(14,'2018-08-20'),(15,'2018-08-21'),(21,'2018-08-22'),(17,'2018-08-23'),(14,'2018-08-24'),(20,'2018-08-27'),(15,'2018-08-28'),(5,'2018-08-29'),(10,'2018-08-30'),(13,'2018-08-31'),(17,'2018-09-03'),(13,'2018-09-04'),(16,'2018-09-05'),(13,'2018-09-06'),(18,'2018-09-07'),(12,'2018-09-10'),(3,'2018-09-11'),(12,'2018-09-12'),(9,'2018-09-13'),(2,'2018-09-14'),(13,'2018-09-17'),(6,'2018-09-18'),(5,'2018-09-19'),(18,'2018-09-20'),(20,'2018-09-21'),(12,'2018-09-24'),(17,'2018-09-25'),(4,'2018-09-26'),(19,'2018-09-27'),(5,'2018-09-28'),(13,'2018-10-01'),(4,'2018-10-02'),(21,'2018-10-03'),(9,'2018-10-04'),(3,'2018-10-05'),(5,'2018-10-08'),(6,'2018-10-09'),(17,'2018-10-10'),(3,'2018-10-11'),(20,'2018-10-12'),(8,'2018-10-15'),(9,'2018-10-16'),(16,'2018-10-17'),(17,'2018-10-18'),(18,'2018-10-19'),(12,'2018-10-22'),(6,'2018-10-23'),(19,'2018-10-24'),(21,'2018-10-25'),(15,'2018-10-26'),(20,'2018-10-29'),(13,'2018-10-30'),(15,'2018-10-31'),(18,'2018-11-01'),(17,'2018-11-02'),(3,'2018-11-05'),(16,'2018-11-06'),(3,'2018-11-07'),(19,'2018-11-08'),(3,'2018-11-09'),(2,'2018-11-12'),(20,'2018-11-13'),(10,'2018-11-14'),(19,'2018-11-15'),(8,'2018-11-16'),(3,'2018-11-19'),(5,'2018-11-20'),(7,'2018-11-21'),(15,'2018-11-22'),(21,'2018-11-23'),(17,'2018-11-26'),(20,'2018-11-27'),(18,'2018-11-28'),(21,'2018-11-29'),(14,'2018-11-30'),(10,'2018-12-03'),(18,'2018-12-04'),(20,'2018-12-05'),(4,'2018-12-06'),(1,'2018-12-07'),(4,'2018-12-10'),(15,'2018-12-11'),(12,'2018-12-12'),(8,'2018-12-13'),(4,'2018-12-14'),(4,'2018-12-17'),(21,'2018-12-18'),(13,'2018-12-19'),(18,'2018-12-20'),(17,'2018-12-21'),(18,'2018-12-24'),(5,'2018-12-25'),(4,'2018-12-26'),(16,'2018-12-27'),(9,'2018-12-28'),(7,'2018-12-31');
/*!40000 ALTER TABLE `random` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-12 20:50:52