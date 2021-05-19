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
-- Table structure for table `sessions`
--

DROP TABLE IF EXISTS `sessions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sessions` (
  `idsessions` int NOT NULL AUTO_INCREMENT,
  `lecturerName1` varchar(45) NOT NULL,
  `lecturerName2` varchar(45) DEFAULT NULL,
  `subjectName` varchar(45) NOT NULL,
  `subjectCode` varchar(45) NOT NULL,
  `groupID` varchar(45) NOT NULL,
  `tag` varchar(45) NOT NULL,
  `noOfStudents` int NOT NULL,
  `duration` int NOT NULL,
  PRIMARY KEY (`idsessions`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessions`
--

LOCK TABLES `sessions` WRITE;
/*!40000 ALTER TABLE `sessions` DISABLE KEYS */;
INSERT INTO `sessions` VALUES (1,'Nimali Weerasinghe','Nimali Weerasinghe','ITPM','IT1060','Y2.S1.IT.06','Lecture',120,2),(3,'Nimali Weerasinghe','','OOP','IT1020','Y2.S1.IT.06','Tutorial',240,1),(5,'Anilka Perera','Anilka Perera','DSA','IT3040','Y2.S1.IT.06','Tutorial',120,1),(7,'Samanth Rajapaksha','Anilka Perera','ITPM','IT3040','Y1.S1.IT.08','Tutorial',120,1),(8,'Nimali Weerasinghe','Siduni Kulasinghe','ITPM','IT3040','Y1.S1.IT.08','Lecture',120,2),(9,'Koliya De silva','Samanth Rajapaksha','OSSA','IT3040','Y2.S2.IT.07','Practical',120,1),(10,'Nimali Weerasinghe','Anilka Perera','DSA','IT1060','Y1.S1.IT.08','Tutorial',120,2),(12,'Nimali Weerasinghe','Koliya De silva','SPM','IT3040','Y2.S1.IT.06','Lecture',120,2);
/*!40000 ALTER TABLE `sessions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-18  0:00:36