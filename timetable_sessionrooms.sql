-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: timetable
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `sessionrooms`
--

DROP TABLE IF EXISTS `sessionrooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sessionrooms` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lecturer1` varchar(45) DEFAULT NULL,
  `lecturer2` varchar(45) DEFAULT NULL,
  `subject` varchar(45) DEFAULT NULL,
  `subjectCode` varchar(45) DEFAULT NULL,
  `tag` varchar(45) DEFAULT NULL,
  `groupID` varchar(45) DEFAULT NULL,
  `room` varchar(45) DEFAULT NULL,
  `idsessions` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessionrooms`
--

LOCK TABLES `sessionrooms` WRITE;
/*!40000 ALTER TABLE `sessionrooms` DISABLE KEYS */;
INSERT INTO `sessionrooms` VALUES (1,'Add a Lecturer','Subject','Student Groups','Add a Student Group','Manage Student Groups','Tags','A505','10'),(2,'Anilka Perera','Anilka Perera','DSA','IT3040','Tutorial','Y2.S1.IT.06','B404','5'),(3,'Nimali Weerasinghe','Koliya De silva','SPM','IT3040','Y2.S1.IT.06','Lecture','gg','12'),(4,'Nimali Weerasinghe','Koliya De silva','SPM','IT3040','Y2.S1.IT.06','Lecture','gg','12'),(5,'Nimali Weerasinghe','Koliya De silva','SPM','IT3040','Lecture','Y2.S1.IT.06','gg','12');
/*!40000 ALTER TABLE `sessionrooms` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-20  1:58:54
