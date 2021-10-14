-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: my_bank
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `dob` datetime DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `aadhar_no` varchar(45) NOT NULL,
  `status_id` int DEFAULT NULL,
  `role_type_id` int DEFAULT NULL,
  `created_on` datetime NOT NULL,
  `mobile_no` varchar(10) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `aadhar_no_UNIQUE` (`aadhar_no`),
  KEY `user_id_idx` (`role_type_id`),
  KEY `role_id_idx` (`role_type_id`),
  KEY `status_id_idx` (`status_id`),
  KEY `password_id_idx` (`password`),
  CONSTRAINT `role_type_id` FOREIGN KEY (`role_type_id`) REFERENCES `role_type` (`id`),
  CONSTRAINT `status_id` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1322 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1234,'urvashi','tyagi','2021-09-22 02:56:32','urvashi.tyagi@gmail.com','211111111111',2,1,'2021-09-22 02:56:32','9898989898','1111'),(1235,'Nishi','pahwa',NULL,'nishthapahwa@gmail.com','11111111111',2,2,'2021-09-26 03:22:40','9898989891','2222'),(1236,'Kiran','Bahri',NULL,'Kiran@gmail.com','311111111111',1,2,'2021-09-26 03:26:28','9898989892','3333'),(1237,'namrta','kapoor',NULL,'Namrta@gmail.com','411111111111',1,2,'2021-09-26 03:32:03','9898989893','4444'),(1238,'Prateek','Jain',NULL,'prateek@gmail.com','511111111111',2,2,'2021-09-26 03:32:37','9898989894','5555'),(1239,'bhumi','gupta',NULL,'bhumi@gmail.com','611111111111',1,2,'2021-09-27 23:15:33','9898989895','6666'),(1240,'samayra','pahwa',NULL,'Samayra@gmail.com','711111111111',1,2,'2021-09-28 08:59:50','9898989896','7777'),(1241,'hemang','bahri',NULL,'Hemang@gmail.com','811111111111',1,2,'2021-09-28 22:28:50','9898989897','8888'),(1242,'sidhu','bedi',NULL,'sidhu@gmail.com','911111111111',1,2,'2021-09-28 23:18:46','9898989898','9999'),(1243,'jasmine','bhasin',NULL,'jas@gmail.com','011111111111',1,2,'2021-09-28 23:18:46','9898989899','1000'),(1244,'sandeep','kumar',NULL,'san@gmail.com','101111111111',1,2,'2021-09-28 23:19:57','9898989890','1110'),(1245,'Shikha','sanger',NULL,'sanger@gmail.com','110111111111',1,2,'2021-09-28 23:21:08','9999999999','1112'),(1246,'ashok900','sinha900',NULL,'ashok1@gmail.com','121111111111',1,2,'2021-10-04 11:45:54','8888888888','0000'),(1247,'ashok999','sinha999',NULL,'ashok@gmail.com','131111111111',1,2,'2021-10-04 14:37:21','7777777777','0000'),(1248,'jkhjg1','kjhj1',NULL,'kjh@mailinatr.com','141111111111',1,2,'2021-10-11 09:35:47','6666666666','kjhg'),(1249,'kljkhg2','kljh2',NULL,'kjh@mailinator.com','151111111111',1,2,'2021-10-11 09:36:46','5555555555','kjhghhjjjjhkdashdkja'),(1250,'kljkhg3','kljh2',NULL,'kjh1@mailinator.com','161111111111',1,2,'2021-10-11 09:37:09','4444444444','kjhghhjjjjhkdashdkja'),(1251,'kljkhg4','kljh3',NULL,'kjh2@mailinator.com','171435111111',1,2,'2021-10-11 09:37:24','3333333333','kjhghhjjjjhkdashdkja'),(1252,'kljkhg5','kljh4',NULL,'kj3h@mailinator.com','181111111111',1,2,'2021-10-11 09:42:21','2222222222','kjhghhjjjjhkdashdkja'),(1253,'kljkhg6','kljh5',NULL,'kjh4@mailinator.com','191111111111',1,2,'2021-10-11 09:42:27','1111111111','kjhghhjjjjhkdashdkja'),(1254,'ashok100','sinha100',NULL,'ashok10@gmail.com','200111111111',1,2,'2021-10-11 09:51:28','9090909090','1313'),(1255,'ashok110','sinha110',NULL,'ashok11@gmail.com','2011111111111',1,2,'2021-10-11 13:45:41','8080808080','1010'),(1256,'ashok110','sinha110',NULL,'ashok12@gmail.com','221111111111',1,2,'2021-10-11 13:51:24','7070707070','1010'),(1257,'a','jay',NULL,'a@gmail.com','111116511111',1,2,'2021-10-11 13:53:01','0909090901',''),(1258,'b','jay1',NULL,'b@gmail.com','11111119811111',1,2,'2021-10-11 13:53:04','0909090902',''),(1259,'z','jay2',NULL,'z@gmail.com','111111671111',1,2,'2021-10-11 13:53:33','0909090903',''),(1260,'c','jay3',NULL,'c@gmail.com','111111145111',1,2,'2021-10-11 13:53:36','0909090904',''),(1261,'d','jay4',NULL,'d@gmail.com','111112311111',1,2,'2021-10-11 13:54:09','0909090905',''),(1262,'e','jay5',NULL,'e@gmail.com','111111001111',1,2,'2021-10-11 13:55:18','0909090906',''),(1263,'f','jay6',NULL,'f@gmail.com','122211111111',1,2,'2021-10-11 15:02:15','0909090907','2222'),(1264,'g','jay7',NULL,'g@gmail.com','111111333111',1,2,'2021-10-11 15:02:19','0909090908','2222'),(1265,'i','jay8',NULL,'i@gmail.com','111111991111',1,2,'2021-10-11 15:03:10','0909090900','2222'),(1266,'j','jay9',NULL,'j@gmail.com','111118787111',1,2,'2021-10-11 15:03:40','0909090910','2222'),(1267,'k','jay10',NULL,'k@gmail.com','878787878623',1,2,'2021-10-11 15:04:57','0909090920','2222'),(1268,'l','jay11',NULL,'l@gmail.com','111115511111',1,2,'2021-10-11 15:07:16','0909090930',''),(1269,'m','jay12',NULL,'m@gmail.com','113311111111',1,2,'2021-10-11 15:07:47','0909090940','2222'),(1270,'nishu11','pahwa10',NULL,'nishuq@gmail.com','111112211111',1,2,'2021-10-11 16:55:41','0909090909','9090'),(1271,'nishu12','pahwa11',NULL,'nishup@gmail.com','111118111111',1,2,'2021-10-11 16:55:51','7676989890','9090'),(1272,'nishu13','pahwa12',NULL,'nishui@gmail.com','111119111111',1,2,'2021-10-11 16:55:51','8989898989','9090'),(1273,'nishu14','pahwa13',NULL,'nishuj@gmail.com','111112111111',1,2,'2021-10-11 16:55:52','2020202020','9090'),(1274,'nishu15','pahwa14',NULL,'ni@gmail.com','111111311111',1,2,'2021-10-11 16:58:28','3030303030','9090'),(1275,'nishu16','pahwa15',NULL,'nishaaa@gmail.com','111411111111',1,2,'2021-10-11 16:58:42','9898989890','9090'),(1276,'nishu17','pahwa16',NULL,'nishe@gmail.com','151111001111',1,2,'2021-10-11 16:58:51','6767676776','9090'),(1277,'gitika','kapoor',NULL,'gitika@gmail.com','111116111111',1,2,'2021-10-12 00:05:02','7676767676','9090'),(1278,'pooja','sharama',NULL,'1234','171111111111',1,2,'2021-10-12 00:15:48','7878787876','1111'),(1280,'ashok30','si30',NULL,'ashok30@gmail.com','111181111111',1,2,'2021-10-12 09:46:34','7878787870','8080'),(1282,'ashok40','mishra40',NULL,'ashok40@gmail.com','111111111911',1,2,'2021-10-12 09:47:38','7878787879','7070'),(1284,'MEERA','KAPOOR',NULL,'MEERA@GMAIL.COM','111111101111',1,2,'2021-10-12 09:52:28','7878787878','4040'),(1287,'rohan ','sharma',NULL,'rohan@gmail.com','781122114455',1,2,'2021-10-12 14:33:52','8888888888','1212'),(1293,'jiya','shah',NULL,'jiya@gmail.com','123412341234',1,2,'2021-10-12 14:34:52','0901010101','3030'),(1295,'ashg','sdf',NULL,'ashg@gmail.com','987656783423',1,2,'2021-10-12 14:36:17','7777777777','0404'),(1298,'roshan','kumar',NULL,'roshan@gmail.com','345678906781',1,2,'2021-10-12 14:59:54','0987564321','456789'),(1299,'sk','simha',NULL,'sk@gmail.com','666666666660',1,2,'2021-10-13 17:51:19','0112211331','2113'),(1301,'niharika','koshal',NULL,'niharika@gmail.com','001122116521',1,2,'2021-10-13 18:01:31','0456329810','3434'),(1304,'well','done',NULL,'well2@gmail.com','394932507269',1,2,'2021-10-14 15:04:30','2109128909','1111'),(1321,'jinu','sharma',NULL,'jinu@gmail.com','000000009009',1,2,'2021-10-14 15:14:26','1000100011','2145');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 17:08:40
