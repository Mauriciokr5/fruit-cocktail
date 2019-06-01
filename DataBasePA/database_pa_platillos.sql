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
-- Table structure for table `platillos`
--

DROP TABLE IF EXISTS `platillos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `platillos` (
  `idPlatillo` int(11) NOT NULL AUTO_INCREMENT,
  `platillo` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idPlatillo`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `platillos`
--

LOCK TABLES `platillos` WRITE;
/*!40000 ALTER TABLE `platillos` DISABLE KEYS */;
INSERT INTO `platillos` VALUES (1,'Sopa de letras con zanahoria'),(2,'Salpicon de pollo'),(3,'Frijoles fritos'),(4,'Cereal'),(5,'Agua de tamarindo'),(6,'Papaya'),(7,'Arroz con chicharos'),(8,'Picadillo'),(9,'Agua de naranja'),(10,'Melon'),(11,'Sopa de lentejas'),(12,'Calabacitas con queso'),(13,'Agua de horchata'),(14,'Sandia'),(15,'Sopa de verduras'),(16,'Tortillas de atun'),(17,'Ensalada de pepino'),(18,'Agua de mandarina'),(19,'Piña'),(20,'Sopa de chayote'),(21,'Rollito de pollo con salsa'),(22,'Frijoles de la olla'),(23,'Agua de limon'),(24,'Platano con crema'),(25,'Sopa de haba'),(26,'Toritllas de amaranto'),(27,'Ensalada de jitomate'),(28,'Agua de melon'),(29,'Guayaba'),(30,'Sopa poblana'),(31,'Ensalada de atun'),(32,'Arroz rojo'),(33,'Bistec con papas'),(34,'Ensalada de nopales'),(35,'Agua de tuna'),(36,'Sopa de fideo'),(37,'Pastel de carne'),(38,'Ensalada de brocoli'),(39,'Sopa de ejote'),(40,'Entomatadas'),(41,'Mandarina'),(42,'Crema de zanahoria'),(43,'Tacos de pollo con lechuga y jitomate'),(44,'Agua de jamaica'),(45,'Crema de frijol'),(46,'Toritllas de espinaca con queso'),(47,'Naranja'),(48,'Sopa de calabacita'),(49,'Chilaquiles con pollo'),(50,'Espagueti rojo'),(51,'Chuleta con piña'),(52,'Ensalada de betabel'),(53,'Agua de papaya'),(54,'Crema de garbanzo'),(55,'Torillas de ejote con queso'),(56,'Arroz con zanahoria'),(57,'Pollo en salsa verde con nopales'),(58,'Espagueti con crema'),(59,'Queso en caldillo de jitomate'),(60,'Sopa de elote y pasta'),(61,'Tinga de res'),(62,'Sopa de nopal'),(63,'Tortillas de papa con queso'),(64,'Ensalada de betabel y jicama'),(65,'Consome con verduras'),(66,'Pollo frito'),(67,'Zanahoria con cebolla'),(68,'Agua de guayaba'),(74,'fdsasa'),(75,'fdafsaf'),(79,'HOla bebe'),(81,'fafds'),(82,'aaaaaaaaaaaaaa'),(83,'fdsa'),(85,'fdsfaafd'),(87,'dfsafs'),(88,'wre'),(89,'fafds');
/*!40000 ALTER TABLE `platillos` ENABLE KEYS */;
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
