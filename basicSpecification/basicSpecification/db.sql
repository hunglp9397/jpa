-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: basic-specification
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence`
(
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK
TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence`
VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK
TABLES;

--
-- Table structure for table `operating_system`
--

DROP TABLE IF EXISTS `operating_system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operating_system`
(
    `id`           bigint NOT NULL,
    `kernel`       varchar(255) DEFAULT NULL,
    `name`         varchar(255) DEFAULT NULL,
    `release_date` datetime(6) DEFAULT NULL,
    `usages`       int    NOT NULL,
    `version`      varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operating_system`
--

LOCK
TABLES `operating_system` WRITE;
/*!40000 ALTER TABLE `operating_system` DISABLE KEYS */;
INSERT INTO `operating_system`
VALUES (1, '5.16.11', 'Arch Linux', '2022-03-01 00:10:00.690000', 80, '2022.03.01'),
       (2, '5.8', 'Ubuntu', '2022-02-22 00:10:00.690000', 128, '20.04.4 LTS'),
       (3, '5.13', 'Ubuntu', '2022-01-28 00:10:00.690000', 110, '21.10'),
       (4, '5.8', 'CentOS', '2020-11-12 00:10:00.690000', 200, '7'),
       (5, '5.13', 'CentOS', '2021-11-12 00:10:00.690000', 176, '8'),
       (6, '5.15.8', 'EndeavourOS', '2022-03-03 00:10:00.690000', 93, '21.5'),
       (7, '5.13', 'Deepin', '2022-03-11 00:10:00.690000', 76, '20.2.4'),
       (8, '5.8', 'Deepin', '2022-01-11 00:10:00.690000', 121, '20.2.2'),
       (9, '5.13', 'Red Hat', '2022-02-01 00:10:00.690000', 329, '7.9'),
       (10, '5.16.11', 'Red Hat', '2022-03-20 00:10:00.690000', 283, '8');
/*!40000 ALTER TABLE `operating_system` ENABLE KEYS */;
UNLOCK
TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 15:59:54
