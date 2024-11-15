-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pruebabuses
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bus`
--

DROP TABLE IF EXISTS `bus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bus` (
  `idBus` int(11) NOT NULL AUTO_INCREMENT,
  `Numero_bus` varchar(20) NOT NULL,
  `Placa` varchar(20) NOT NULL,
  `Fecha_creacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `Caracteristicas` varchar(100) DEFAULT NULL,
  `idMarca_bus` int(11) NOT NULL,
  `Actividad` tinyint(1) DEFAULT 1,
  PRIMARY KEY (`idBus`),
  KEY `idMarca_bus` (`idMarca_bus`),
  CONSTRAINT `bus_ibfk_1` FOREIGN KEY (`idMarca_bus`) REFERENCES `marca_bus` (`idMarca_bus`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bus`
--

LOCK TABLES `bus` WRITE;
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
INSERT INTO `bus` VALUES (1,'5421','CQE789','2024-11-14 03:39:09','50 asientos',1,1),(2,'1234','ABC123','2024-11-15 00:14:27','Bus de transporte urbano',1,1),(3,'5678','DEF456','2024-11-15 00:14:27','Bus de largo recorrido',2,0),(4,'9101','GHI789','2024-11-15 00:14:27','Bus escolar',3,1),(5,'1123','JKL012','2024-11-15 00:14:27','Bus turístico, Wi-Fi disponible',1,1),(6,'4567','MNO345','2024-11-15 00:14:27','Bus de transporte público, espacio amplio',2,0),(7,'7890','PQR678','2024-11-15 00:14:27','Bus de servicio nocturno',3,1),(8,'1345','STU901','2024-11-15 00:14:27','Bus de transporte publico, 50 asientos',1,1),(9,'6789','VWX234','2024-11-15 00:14:27','Bus interprovincial, televisión',2,1),(10,'2345','YZA567','2024-11-15 00:14:27','Bus de transporte universitario',3,0),(11,'8901','BCD890','2024-11-15 00:14:27','Bus de servicio nocturno, wifi',1,0),(12,'1443','XTY1A9','2024-11-15 06:53:37','Bus de servicio nocturno, wifi',3,0),(13,'3521','QWE4B1','2024-11-15 06:53:37','Bus escolar, aire acondicionado',6,1),(14,'4832','YZX8C3','2024-11-15 06:53:37','Bus urbano, sin wifi',1,0),(15,'2947','GHJ2D6','2024-11-15 06:53:37','Bus de lujo, wifi y aire acondicionado',2,1),(16,'5371','WVN7E4','2024-11-15 06:53:37','Bus de transporte interprovincial, wifi',4,1),(17,'6201','PRX9F2','2024-11-15 06:53:37','Bus de servicio nocturno, wifi',5,0),(18,'4358','ABM1G5','2024-11-15 06:53:37','Bus escolar, sin wifi',2,1),(19,'1923','LKO4H8','2024-11-15 06:53:37','Bus de lujo, wifi',3,0),(20,'2845','UYP5J2','2024-11-15 06:53:37','Bus urbano, sin wifi',4,1),(21,'3917','BZN8K1','2024-11-15 06:53:37','Bus de transporte interprovincial, aire acondicionado',1,0),(22,'2765','MPT9L3','2024-11-15 06:53:37','Bus escolar, wifi',6,1),(23,'1539','CDF3M6','2024-11-15 06:53:37','Bus de lujo, wifi',2,0),(24,'6720','TKL7N4','2024-11-15 06:53:37','Bus de servicio nocturno, wifi',5,1),(25,'5871','RCQ8P9','2024-11-15 06:53:37','Bus interprovincial, sin wifi',3,1),(26,'3280','JUK1Q2','2024-11-15 06:53:37','Bus escolar, aire acondicionado',4,0),(27,'2115','FOE4R7','2024-11-15 06:53:37','Bus de lujo, sin wifi',6,1),(28,'4730','BHV5S1','2024-11-15 06:53:37','Bus de servicio nocturno, wifi',2,0),(29,'6058','VJN9T4','2024-11-15 06:53:37','Bus urbano, aire acondicionado',5,1),(30,'3582','NBL6U8','2024-11-15 06:53:37','Bus de lujo, wifi y aire acondicionado',1,1),(31,'4269','EYX2V0','2024-11-15 06:53:37','Bus de transporte interprovincial, wifi',4,0);
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca_bus`
--

DROP TABLE IF EXISTS `marca_bus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca_bus` (
  `idMarca_bus` int(11) NOT NULL AUTO_INCREMENT,
  `Marca` varchar(45) NOT NULL,
  PRIMARY KEY (`idMarca_bus`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca_bus`
--

LOCK TABLES `marca_bus` WRITE;
/*!40000 ALTER TABLE `marca_bus` DISABLE KEYS */;
INSERT INTO `marca_bus` VALUES (1,'Volvo'),(2,'Scania'),(3,'Fiat'),(4,'Volare'),(5,'Modasa'),(6,'Mercedes');
/*!40000 ALTER TABLE `marca_bus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-15  1:58:43
