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
-- Table structure for table `menu_platillo`
--

DROP TABLE IF EXISTS `menu_platillo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_platillo` (
  `idPltillo` int(2) DEFAULT NULL,
  `idMenu` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_platillo`
--

LOCK TABLES `menu_platillo` WRITE;
/*!40000 ALTER TABLE `menu_platillo` DISABLE KEYS */;
INSERT INTO `menu_platillo` VALUES (1,1),(2,1),(3,1),(3,2),(3,4),(3,7),(3,8),(3,10),(3,11),(3,13),(3,16),(3,17),(3,18),(4,1),(4,2),(4,3),(4,4),(4,5),(4,6),(4,7),(4,8),(4,9),(4,12),(4,14),(4,15),(4,16),(4,17),(4,18),(4,19),(4,20),(5,1),(5,9),(5,15),(6,1),(6,16),(7,2),(8,2),(9,2),(9,18),(10,2),(11,3),(12,3),(13,3),(13,7),(13,12),(13,19),(14,3),(14,7),(15,4),(16,4),(17,4),(18,4),(19,4),(19,8),(20,5),(21,5),(22,5),(22,9),(22,14),(22,19),(22,20),(23,5),(23,13),(23,17),(24,5),(24,11),(24,20),(25,6),(26,6),(27,6),(28,6),(28,20),(29,6),(29,15),(29,18),(30,7),(31,7),(32,8),(33,8),(34,8),(35,8),(36,9),(37,9),(38,9),(39,10),(40,10),(41,10),(41,13),(41,17),(42,11),(43,11),(44,11),(45,12),(46,12),(47,12),(48,13),(49,13),(50,14),(51,14),(52,14),(53,14),(54,15),(55,15),(56,16),(57,16),(58,17),(59,17),(60,18),(61,18),(62,19),(63,19),(64,19),(65,20),(66,20),(67,20),(68,10),(85,21),(87,21),(88,21),(89,22),(90,22),(91,22),(92,22);
/*!40000 ALTER TABLE `menu_platillo` ENABLE KEYS */;
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
